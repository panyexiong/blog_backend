package com.panyexiong.blog;

import com.panyexiong.blog.entity.User;
import com.panyexiong.blog.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void test1(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
