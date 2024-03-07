package com.atsinsin.Spring5.testdemo;

import com.atsinsin.Spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestJdbc {
    @Test
    public void testjdbc(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book=new Book();
//        book.setUserId("1");
//        book.setUsername("zhangsan");
//        book.setUstatus("employee");
//        bookService.addBook(book);
//        Book book=new Book();
//        book.setUserId("1");
//        book.setUsername("lisi");
//        book.setUstatus("boss");
//        bookService.updateBook(book);
 //       bookService.deleteBook("1");
//        bookService.findCount();
//        List<Book> all = bookService.findAll();
//        System.out.println(all);
//        List<Object[]> bachArgs = new ArrayList<>();
//        Object[] o1={"10","111","1"};
//        Object[] o2={"20","222","2"};
//        bachArgs.add(o1);
//        bachArgs.add(o2);
      //  bookService.bachAdd(bachArgs);
        List<Object[]> bachArgs = new ArrayList<>();
        Object[] o1={"0"};
        Object[] o2={"10"};
        bachArgs.add(o1);
        bachArgs.add(o2);
        bookService.bachDelete(bachArgs);
    }
}
