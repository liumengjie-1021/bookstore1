package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.pojo.Book;
import com.bookstore.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/query")
    public List<Book> testQuery() {
        return bookService.selectAllBook();
    }
	
	@RequestMapping("/insert")
    public List<Book> testInsert() {
		bookService.insertService();
        return bookService.selectAllBook();
    }


    @RequestMapping("/changemoney")
    public List<Book> testchangemoney() {
    	bookService.changemoney();
        return bookService.selectAllBook();
    }

    @RequestMapping("/delete")
    public String testDelete() {
    	bookService.deleteService("3");
        return "OK";
    }
}
