package com.yigou.service;

import com.yigou.model.entity.Test;

import java.util.List;

/**
 * @author Xiaoyue Xiao
 */
public interface TestService {

    boolean saveTest(Test test);

    boolean deleteTestById(Integer id);

    List<Test> getTestsByPage(Integer page, Integer perPage);
    
    Integer getTotalPage(Integer perPage);

    Integer selectCount();
}
