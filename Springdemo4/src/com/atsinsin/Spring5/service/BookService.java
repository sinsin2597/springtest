package com.atsinsin.Spring5.service;

import com.atsinsin.Spring5.dao.BookDao;
import com.atsinsin.Spring5.enity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService {

    public BookService() {
    }
    @Autowired
    private BookDao bookDao;
    public void addBook(Book book){
        bookDao.add(book);
    }
    public void updateBook(Book book){
        bookDao.update(book);
    }
    public void deleteBook(String id){
        bookDao.delete(id);
    }
    public void findCount(){
        bookDao.find();
    }
    public Book findOne(String id){
      return  bookDao.findBook(id);

    }
    public List<Book> findAll(){
      return  bookDao.findAll();
    }
    public void bachAdd(List<Object[]> bachArgs){
        bookDao.bachAddBook(bachArgs);
    }
    public void bachUpdate(List<Object[]> bachArgs){
        bookDao.bachUpdateBook(bachArgs);
    }
    public void bachDelete(List<Object[]> bachArgs){
        bookDao.bachDeleteBook(bachArgs);

    }

}
