package com.atsinsin.Spring5;

import aotuWire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void TestAdd(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
       Stu stu = context.getBean("stu",Stu.class);
       stu.add();


    }

    @Test
    public void test1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp= context.getBean("emp",Emp.class);
        System.out.println(emp);


    }
}
