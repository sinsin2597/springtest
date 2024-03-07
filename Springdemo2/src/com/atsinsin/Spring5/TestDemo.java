package com.atsinsin.Spring5;

import com.atsinsin.Spring5.service.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void testAdd(){
        ApplicationContext context=
               new ClassPathXmlApplicationContext("xml/bean3.xml");
       Service service= context.getBean("service", Service.class);
       service.add();

    }
}
