package com.juran.test;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService{

    @Resource(name="testMapper")
    private TestMapper testMapper;

    @Override
    public String test() throws Exception {
        return testMapper.test();
    }

    @Override
    public String test2() throws Exception {
        return testMapper.test2();
    }
}
