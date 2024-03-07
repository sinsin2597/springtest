package com.atsinsin.Spring5.service;


import com.atsinsin.Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

@org.springframework.stereotype.Service
public class Service {
//@Autowired
//@Qualifier(value = "impl1")
    @Resource(name = "impl1")
    private UserDao userDao;
    @Value(value = "zhansan")
    private String name;

    public void add(){
        System.out.println("add...........................");
        System.out.println(name);
        userDao.add();
    }
}
