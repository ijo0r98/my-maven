package com.juran.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource(name="testService")
    private TestService testService;

    @GetMapping( "/1")
    public String test() throws Exception {
        System.out.println(testService.test());
        return "test1";
    }

    @GetMapping("/test")
    public String test2() throws Exception {
        System.out.println("test2");
        System.out.println(testService.test2());
        return "test2";
    }

}
