package com.panyexiong.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panyexiong
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/test")
    public void testController(){
        System.out.println("success");
    }


}
