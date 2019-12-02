package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dao.BookDao;
import com.bookstore.pojo.Book;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;
	

    /**
     * 根据名字查找图书
     */
    public Book selectBookByName(String name) {
        return bookDao.findBookByName(name);
    }

    /**
     * 查找所有图书
     */
    public List<Book> selectAllBook() {
        return bookDao.findAllBook();
    }

    /**
     * 插入两个图书
     */
    public void insertService() {
        bookDao.insertBook("00001","安徒生童话","SnailClimb","北京大学出版社", 30.0);
        bookDao.insertBook("00002","Linux","Daisy", "人大出版社", 30.0);
    }

    /**
     * 根据id 删除图书
     */

    public void deleteService(String bookNum) {
        bookDao.deleteBook(bookNum);
    }

    /**
     * 模拟事务。由于加上了 @Transactional注解，如果转账中途出了意外 SnailClimb 和 Daisy 的钱都不会改变。
     */
    @Transactional
    public void changemoney() {
        bookDao.updateBook("SnailClimb", "", "",2000.0,"3");
        // 模拟转账过程中可能遇到的意外状况
        int temp = 1 / 0;
        bookDao.updateBook("Daisy","", "",2000.0,"3");
    }
}
