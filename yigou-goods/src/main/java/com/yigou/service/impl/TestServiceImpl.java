package com.yigou.service.impl;

import com.yigou.mapper.TestMapper;
import com.yigou.model.entity.Test;
import com.yigou.service.TestService;
import com.yigou.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Xiaoyue Xiao
 */
@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }


    @Override
    @Transactional
    public boolean saveTest(Test test) {
        return testMapper.insertTest(test) > 0;
    }


    @Override
    @Transactional
    public boolean deleteTestById(Integer id) {
        return testMapper.deleteTestById(id) > 0;
    }

    @Override
    public List<Test> getTestsByPage(Integer page, Integer perPage) {
        Integer offset = PageUtil.calculateOffset(page, perPage);
        List<Test> tests = testMapper.selectTestsByPage(offset, perPage);
        return tests;
    }


    @Override
    public Integer getTotalPage(Integer perPage) {
        int i = PageUtil.calculateTotalPage(testMapper.selectCount(), perPage);

        return i;
    }

    @Override
    public Integer selectCount() {
        return testMapper.selectCount();
    }


}
