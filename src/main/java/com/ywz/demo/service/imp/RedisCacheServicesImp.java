package com.ywz.demo.service.imp;

import com.ywz.demo.bean.Employee;
import com.ywz.demo.service.RedisCacheServices;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @Author: yangwuzhi
 * @Description: 实现类
 * @Date: 2019-05-12
 */

@Component
public class RedisCacheServicesImp implements RedisCacheServices {


    @Override
    @Cacheable(value = "test")
    public Employee test(String id) {
        Employee employee = new Employee();
        employee.setId(100001);
        employee.setdId(30001);
        employee.setLastName("张三");
        employee.setEmail("123456");
        employee.setGender(1);

        System.out.println("请求一次");
        return  employee;
    }
}
