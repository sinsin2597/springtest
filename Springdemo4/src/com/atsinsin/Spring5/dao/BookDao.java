package com.atsinsin.Spring5.dao;

import com.atsinsin.Spring5.enity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void delete(String id);

    void update(Book book);

    int find();

    Book findBook(String id);

    List<Book> findAll();

    void bachAddBook(List<Object[]> bachArgs);

    void bachUpdateBook(List<Object[] > bachArgs);

    void bachDeleteBook(List<Object[]> bachArgs);
}
