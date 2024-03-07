package com.atsinsin.Spring5.testdemo;

import com.atsinsin.Spring5.config.TxConfig;
import com.atsinsin.Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMoney {
    @Test
    public void demo(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void demo1(){
        ApplicationContext context=
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }


}
