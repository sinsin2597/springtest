package com.atsinsin.Spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "impl1")
public class UserDaoImpl implements UserDao{


    @Override
    public void add() {
        System.out.println("userdao add..................");
    }
}
