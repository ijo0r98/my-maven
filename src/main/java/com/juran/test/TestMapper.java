package com.juran.test;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("testMapper")
public interface TestMapper {

    String test() throws Exception;
    String test2() throws Exception;
}
