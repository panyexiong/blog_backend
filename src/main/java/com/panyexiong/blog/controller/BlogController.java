package com.panyexiong.blog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.panyexiong.blog.common.lang.Result;
import com.panyexiong.blog.entity.Blog;
import com.panyexiong.blog.service.BlogService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/blog")
public class BlogController {

    @Resource
    BlogService blogService;

    @RequestMapping("/blogs")
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage,
                       @RequestParam(defaultValue = "5") Integer pageSize) {
        Page page = new Page(currentPage, pageSize);
        IPage iPage = blogService.page(page, new QueryWrapper<Blog>().orderByDesc("created"));

        return Result.success(iPage);
    }
}
