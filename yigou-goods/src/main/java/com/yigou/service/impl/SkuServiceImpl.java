package com.yigou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yigou.mapper.ProductSpecMapper;
import com.yigou.mapper.SkuMapper;
import com.yigou.model.dto.PaginatedResult;
import com.yigou.model.entity.ProductSpec;
import com.yigou.model.entity.Sku;
import com.yigou.model.entity.SkuExample;
import com.yigou.service.SkuService;
import com.yigou.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 最小销售单元的service
 * Author 川军六十六师.
 * Time 2017/6/24 16:53.
 * Modified By 川军六十六师.
 */
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    private SkuMapper skuMapper;
    @Autowired
    private ProductSpecMapper productSpecMapper;

    @Override
    public PaginatedResult pageSku(int page, int perPage,String keyword,Integer productId) {

        PageHelper.startPage(page,perPage);
        SkuExample example = new SkuExample();

        SkuExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(keyword)){
            /**
             * 关键词可以匹配多个字段进行or查询
             */
            SkuExample.Criteria criteria1 = example.or();
            SkuExample.Criteria criteria2 = example.or();

            String newKey = StringUtil.sqlLikeAll(keyword);
            criteria.andBrandEqualTo(newKey);
            criteria1.andNameLike(newKey);
            criteria2.andSpIdLike(newKey);
        }

        /**
         * 如果productId不为空的话，则查询该productId下所有的sku
         */
        if(productId != null){
            criteria.andProductIdEqualTo(productId);
        }

        List<Sku> skus = skuMapper.selectByExample(example);
        /**
         * 通过specData的值获取DictID的值，
         * 返回给前台
         */
        if(skus != null){
            for(Sku sku : skus){
                String specData = sku.getSpecData();
                List<String> dictIds = new ArrayList<>();
                if(specData != null){
                    String[]  specStrs = specData.split(",");
                    for(String str : specStrs){
                        if(StringUtils.isNotBlank(str)){
                            ProductSpec productSpec = productSpecMapper.selectByPrimaryKey(Integer.parseInt(str));
                            dictIds.add(productSpec.getDictId());
                        }
                    }
                }
            }
        }
        //创建一个返回值对象
        PaginatedResult result = new PaginatedResult();
        result.setData(skus);
        //取分页结果
        PageInfo<Sku> pageInfo = new PageInfo<>(skus);
        //取总记录数
        long total = pageInfo.getTotal();
        result.setTotalCount(total);
        /*result.setCurrentPage(page);
        result.setTotalPage(pageInfo.getPages());*/
        return result;
    }

    @Override
    public void updateSku(Sku sku) {

       /* *//**
         * 从前台传过来的SKU的字段与SKU表中的specData的意思不一样，这里对应的字典表中的dict_id
         *//*
        String dictIdStrs = sku.getDictIds();
        String dictNamesStrs = sku.getDictNames();

        if(StringUtils.isNotBlank(dictIdStrs)){

            String[] dictIds = dictIdStrs.split(",");
            String[] dictNames = dictNamesStrs.split(",");
            String newSepcData = "";
            ProductSpec productSpec = new ProductSpec();
            productSpec.setProductId(sku.getProductId());

            for(int i = 0; i < dictIds.length; i++){

                ProductSpecExample example = new ProductSpecExample();
                *//**
                 * 根据product_id和dict_id去产品规格关联表中查找记录数
                 * 如果查到记录则表示表中有了，再将该属性绑定SKU中
                 *//*
                example.createCriteria().andDictIdEqualTo(dictIds[i]).andProductIdEqualTo(sku.getProductId());
                List<ProductSpec> productSpecs = productSpecMapper.selectByExample(example);

                productSpec.setDictId(dictIds[i]);

                if(productSpecs.size() == 0){
                    productSpec.setDictName(dictNames[i]);
                    productSpecMapper.insert(productSpec);
                }
            }
        }

        skuMapper.updateByPrimaryKeySelective(sku);
    */}
}
