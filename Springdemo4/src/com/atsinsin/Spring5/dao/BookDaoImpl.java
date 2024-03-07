package com.atsinsin.Spring5.dao;

import com.atsinsin.Spring5.enity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        String sql="insert into t_book values(?,?,?)";
        Object[] args={book.getUserId(),book.getUsername(),book.getUstatus()};
        int update= jdbcTemplate.update(sql,args);
        System.out.println(update);

    }

    @Override
    public void delete(String id) {

        String sql="delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);

    }

    @Override
    public void update(Book book) {

        String sql="update t_book set username=?,ustatus=? where user_id=?";
        Object[] args={book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    @Override
    public int find() {
    String sql="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);

        return 0;
    }

    @Override
    public Book findBook(String id) {
        String sql="select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAll() {
        String sql="select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void bachAddBook(List<Object[]> bachArgs) {
        String sql="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,bachArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void bachUpdateBook(List<Object[]> bachArgs) {
        String sql="update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,bachArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void bachDeleteBook(List<Object[]> bachArgs) {
        String sql = "delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,bachArgs);
        System.out.println(Arrays.toString(ints));
    }


}
