package com.bookstore.dao;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bookstore.pojo.Book;

@Mapper
public interface BookDao {
	/**
     * 通过书名查询书本信息
     */
    @Select("SELECT * FROM t_book WHERE Bookname = #{bookName}")
    Book findBookByName(@Param("bookName") String bookName);
    
    /**
     * 查询所有书本信息
     */
    @Select("SELECT * FROM t_book")
    List<Book> findAllBook();
    
    /**
     * 插入书本信息
     */
    @Insert("INSERT INTO t_book(Booknumber,Bookname, Author,Publisher,price) VALUES(#{bookNumber},#{bookName}, #{author}, #{publisher}, #{price})")
    void insertBook(@Param("bookNumber") String bookNumber,@Param("bookName") String bookName, @Param("author") String author, @Param("publisher") String publisher, @Param("price") Double price);

    /**
     * 根据 id 更新书本信息
     */
    @Update("UPDATE  t_book SET Bookname = #{bookName},Author = #{author},Publisher = #{publisher},price= #{price} WHERE Booknumber = #{bookNumber}")
    void updateBook(@Param("bookName") String bookName, @Param("author") String author,  @Param("publisher") String publisher, @Param("price") Double price
                    ,@Param("bookNumber") String  bookNumber);

    /**
     * 根据 id 删除书本信息
     */
    @Delete("DELETE from t_book WHERE Booknumber = #{bookNumber}")
    void deleteBook(@Param("bookNumber") String bookNumber);
}
