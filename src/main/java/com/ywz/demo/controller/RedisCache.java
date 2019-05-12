package com.ywz.demo.controller;

import com.ywz.demo.service.RedisCacheServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yangwuzhi
 * @Description: redis缓存测试
 * @Date: 2019-05-12
 */

@RestController
public class RedisCache {

    @Resource
    RedisCacheServices empRedis;

    @GetMapping("/test")
    public String test(){
        empRedis.test("10001");
        return "成功";
    }

}
