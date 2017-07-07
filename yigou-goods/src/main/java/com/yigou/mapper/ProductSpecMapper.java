package com.yigou.mapper;

import com.yigou.model.entity.ProductSpec;
import com.yigou.model.entity.ProductSpecExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductSpecMapper {
    int countByExample(ProductSpecExample example);

    int deleteByExample(ProductSpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(ProductSpec record);

    int insertSelective(ProductSpec record);

    List<ProductSpec> selectByExample(ProductSpecExample example);

    ProductSpec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    int updateByExample(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    int updateByPrimaryKeySelective(ProductSpec record);

    int updateByPrimaryKey(ProductSpec record);
}