package com.atsinsin.Spring5.dao.ano;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class AddProxy {
    @AfterReturning(value = "execution(* com.atsinsin.Spring5.dao.ano.User.add(..))")
    public void returningafter(){
        System.out.println("addproxy................");
    }
    @Before(value = "execution(* com.atsinsin.Spring5.dao.ano.User.add(..))")
    public void before(){
        System.out.println("add before........................");
    }

}
