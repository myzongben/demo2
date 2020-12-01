package com.example.demo2;

import com.example.wzb.Demo2Application;
import com.example.wzb.util.RedisUtil;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest(classes = Demo2Application.class)
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisUtil redisUtil;

    @Test
    void redisTest() {
        RedisConnectionFactory connectionFactory = redisTemplate.getConnectionFactory();
        System.out.println("redis连接池查看："+connectionFactory);
        redisUtil.set("laowang","hahaha");
        System.out.println(redisUtil.get("laowang"));
    }
}
