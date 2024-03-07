package com.atsinsin.Spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addmoney() {
        String sql = "update t_account set money=money+100 where id=?";
        jdbcTemplate.update(sql,1);
    }

    @Override
    public void reducemoney() {
        String sql = "update t_account set money=money-100 where id=?";
        jdbcTemplate.update(sql,2);
    }
}
