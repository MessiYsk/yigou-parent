package com.yigou.mapper;

import com.yigou.model.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Xiaoyue Xiao
 */
@Mapper
public interface TestMapper {



    Integer insertTest(Test test);

    Integer deleteTestById(Integer id);

    List<Test> selectAllTests();

    List<Test> selectTestsByPage(@Param("offset") Integer offset, @Param("perPage") Integer perPage);

    Integer selectCount();

}
