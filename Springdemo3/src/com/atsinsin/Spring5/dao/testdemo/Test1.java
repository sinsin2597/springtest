package com.atsinsin.Spring5.dao.testdemo;

import com.atsinsin.Spring5.dao.ano.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext context=
               new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
