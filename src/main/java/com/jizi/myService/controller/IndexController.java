package com.jizi.myService.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YongQiang
 * @Date 2020/6/8 12:49
 * @Version 1.0
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    public String index(){
        System.out.println("这是index页面");
        return "这是主页面";
    }
}
