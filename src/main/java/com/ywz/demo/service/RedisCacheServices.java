package com.ywz.demo.service;

import com.ywz.demo.bean.Employee;
import org.springframework.stereotype.Service;

/**
 * @Author: yangwuzhi
 * @Description: redisServices
 * @Date: 2019-05-12
 */

@Service
public interface RedisCacheServices {

    Employee test(String id);

}
