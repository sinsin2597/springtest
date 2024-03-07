package com.atsinsin.Spring5.dao.ano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class UserProxy {
    @Pointcut(value = "execution(* com.atsinsin.Spring5.dao.ano.User.add(..))")
    public void pointdemo(){

    }

@Before(value = "pointdemo()")
    public void before(){
        System.out.println("before........................");
    }
 @After(value = "execution(* com.atsinsin.Spring5.dao.ano.User.add(..))")
    public void after(){
        System.out.println("after.......................");
    }
    @Around(value = "execution(* com.atsinsin.Spring5.dao.ano.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("around before.........");
        proceedingJoinPoint.proceed();
        System.out.println("around after...........");
    }
}
