package com.atsinsin.Spring5.dao;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class UserDaoProxy {
    public static void main(String[] args) {
        Class[] interfaces ={UserDao.class};
        UserDaoImpl userDao=new UserDaoImpl();
        UserDao dao =(UserDao) Proxy.newProxyInstance(UserDaoProxy.class.getClassLoader(), interfaces, new JDKProxy(userDao));
        int result=dao.add(1,2);
        System.out.println(result);
    }

}

class JDKProxy implements InvocationHandler{
    private Object obj;
    public JDKProxy(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        //方法前
        System.out.println("方法之前执行的......"+method.getName()+"传递的参数："+ Arrays.toString(objects));

        //被增强的方法执行
        Object res=method.invoke(obj,objects);

        //方法之后
        System.out.println("方法之后....."+obj);
        return res;


    }
}