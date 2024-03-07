package com.atsinsin.Spring5.service;

import com.atsinsin.Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void accountMoney(){
        userDao.reducemoney();

        int i = 10 / 0 ;

        userDao.addmoney();
    }
}
