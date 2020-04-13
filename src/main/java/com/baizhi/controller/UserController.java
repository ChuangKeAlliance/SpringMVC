package com.baizhi.controller;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author Erge
 * Email:745580511@qq.com
 * Date: 2020/1/9.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String userLogin(){
        System.out.println("----------请求到达！-------------");
        return "login";
    }
}
