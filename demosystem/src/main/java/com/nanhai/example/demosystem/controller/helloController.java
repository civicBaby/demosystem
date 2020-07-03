package com.nanhai.example.demosystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: DH
 * @Date: 2020/7/2 09:30
 * @Description:
 */

@Controller
public class helloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}
