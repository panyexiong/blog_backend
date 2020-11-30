package com.panyexiong.blog.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author panyexiong
 */
@RestController
@RequestMapping("post")
public class PostController {


    @PostMapping("/obj")
    @ResponseBody
    public Object returnJson(@RequestBody Object obj){
        System.out.println(obj);
        return obj;
    }

}
