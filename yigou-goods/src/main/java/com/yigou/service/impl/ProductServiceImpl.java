package com.yigou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigou.mapper.*;
import com.yigou.model.dto.PaginatedResult;
import com.yigou.model.entity.*;
import com.yigou.service.ProductService;
import com.yigou.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author Xiaoyue Xiao
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductSpecMapper productSpecMapper;
    @Autowired
    private SkuMapper skuMapper;
    @Autowired
    private SequenceMapper sequenceMapper;

    private final String basis_spxx = "basis_spxx";

    @Override
    public PaginatedResult pageProduct(int page, int perPage, String keywords) {

        PageHelper.startPage(page, perPage);
        ProductExample example = new ProductExample();

        ProductExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(keywords)) {

            String newKeywords = StringUtil.sqlLikeAll(keywords);
            criteria.andModelLike(newKeywords);

        }

        List<Product> products = productMapper.selectByExample(example);

        //创建一个返回值对象
        PaginatedResult result = new PaginatedResult();
        result.setData(products);
        //取分页结果
        PageInfo<Product> pageInfo = new PageInfo<>(products);
        //取总记录数
        long total = pageInfo.getTotal();
        result.setTotalCount(total);
        /*result.setCurrentPage(page);
        result.setTotalPage(pageInfo.getPages());*/
        return result;
    }

    @Transactional
    @Override
    public void addProduct(Product product) {

        /**
         * 首先判断这次是编辑还是新增，ID为空则为新增
         */
        if(product.getProductId() == null){
            Date date = new Date();
            product.setCreatetime(date);
            productMapper.insert(product);
        }

        Integer productId = product.getProductId();

        List<List<String>> specsLists = new ArrayList<>();
        /**
         * 商品的规格参数集合,保存了字典表对应的ID
         */
        List<Map<String,Object>> specs = product.getSpecs();

        if(specs != null){
            for(Map<String,Object> map : specs){

                String title = (String) map.get("title");
                List<String> specIds = (List<String>)map.get("ids");
                List<String> specNames = (List<String>)map.get("names");

                ProductSpec productSpec = new ProductSpec();
                productSpec.setTitle(title);
                productSpec.setProductId(productId);

                List<String> specsList = new ArrayList<>();

                for(int i = 0 ; i< specIds.size(); i++){

                    productSpec.setDictId(specIds.get(i));
                    productSpec.setDictName(specNames.get(i));
                    productSpec.setSpecId(null);
                    productSpecMapper.insert(productSpec);
                    Integer specId = productSpec.getSpecId();
                    specsList.add(specId.toString());
                }
                specsLists.add(specsList);
            }
            /**
             * SKU规格参数的集合,保存了产品规格关联表ID
             */
            List<String> allSkusSpecs = getAllSkusSpecs(specsLists);
            /**
             * 生成SKU并保存到SKU表中
             */
            Sku sku = new Sku();
            sku.setName(product.getModel());
            sku.setCtId(product.getCate());
            sku.setProductId(productId);
            sku.setBrand(product.getBrandName());
            sku.setInventory(product.getInventory());

            /**
             * 判断是否需要串号，如果需要的话则设置SKU也需要串号
             */
            if(product.getIsSn()){
                sku.setIsch("1");
                sku.setChcd(product.getSnLen());
            }else{
                sku.setIsch("0");
                sku.setChcd(0);
            }

            for(String str :  allSkusSpecs){
                sku.setSpecData(str);
                sku.setSpId(getSpId());
                skuMapper.insert(sku);
            }
        }
    }

    @Override
    public void updateProduct(Product product) {

        productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public Product getProductById(Integer productId) {

        Product product = productMapper.selectByPrimaryKey(productId);
        return product;
    }

    @Override
    public Product getProduct(Product product) {

        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        /**
         * 根据品牌、分类、型号名称获取商品的信息
         */
        String brandId = product.getBrandId();
        String cate = product.getCate();
        String name = product.getModel();
        if(StringUtils.isNotBlank(brandId)){
            criteria.andBrandIdEqualTo(brandId);
        }
        if(StringUtils.isNotBlank(cate)){
            criteria.andCateEqualTo(cate);
        }
        if(StringUtils.isNotBlank(name)){
            criteria.andModelEqualTo(name);
        }

        List<Product> products = productMapper.selectByExample(example);
        if(products != null && products.size() > 0){

            Product product1 = products.get(0);
            /**
             * 关联查询该商品所需要的所有的字典ID集合
             * 查询成功后将其保存到product中，并返回到前台
             */
            ProductSpecExample psExample = new ProductSpecExample();
            ProductSpecExample.Criteria pseCriteria = psExample.createCriteria();
            pseCriteria.andProductIdEqualTo(product1.getProductId());
            List<ProductSpec> productSpecs = productSpecMapper.selectByExample(psExample);

            List<String> allSpec = new ArrayList<>();
            for(ProductSpec productSpec : productSpecs){

                allSpec.add(productSpec.getDictId());
            }
            product1.setAllSpec(allSpec);
            return product1;
        }else{
            return null;
        }
    }

    /********************************** 方法工具分割线 **********************************/

    /**
     * 递归求得商品的各个SKU规格参数的组合
     * Modified By 川军六十六师.
     * Since 2017/6/26 13:47.
     */
    private List<String> getAllSkusSpecs(List<List<String>> specs){

        String specStrs = "";
        List<String> strs = new ArrayList<>();
        Map<String,Object> map = new LinkedHashMap<>();
        try {
            for(List<String> list : specs){
                specs.remove(list);
                List<String> allSkus = getAllSkusSpecs(specs);
                for(String spec : list){
                    if(allSkus != null && allSkus.size() > 0){
                        for(String str : allSkus){
                            specStrs = str + "," + spec;
                            strs.add(specStrs);
                        }
                    }else{
                        strs.add(spec);
                    }
                }
            }
            return strs;
        }catch (Exception e){
            return strs;
        }
    }

    /**
     * 获取SKU的下一个主键ID值，去sys_seq表中获取
     * @return
     */
    public String getSpId() {
        String spIdStr = null;
        Map<String,Object> map = new HashMap<>();
        Integer spIdInt = sequenceMapper.getSequence(basis_spxx);
        map.put("sequence",spIdInt + 1);
        map.put("seqName",basis_spxx);
        sequenceMapper.updateSequence(map);
        spIdStr = String.format("%06d", spIdInt);
        return spIdStr;
    }
}
