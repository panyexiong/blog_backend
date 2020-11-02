package com.panyexiong.blog.controller;

import com.panyexiong.blog.common.lang.Result;
import com.panyexiong.blog.entity.User;
import com.panyexiong.blog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiresAuthentication
public class UserController {

    @GetMapping("/test")
    public void testController() {
        System.out.println("success");
    }

    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public Result getUserById(@PathVariable Long id) {
        User user = userService.getById(id);
        return Result.success(200, "操作成功", user);

    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user){
        return Result.success(user);
    }


}
