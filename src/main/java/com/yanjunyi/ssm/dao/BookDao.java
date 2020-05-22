package com.yanjunyi.ssm.dao;

import com.yanjunyi.ssm.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    public int addBook(Book book);
    public int editBook(Book book);
    public int deleteBook(Long book_id);
    public Book getBookById(Long book_id);
    public List<Book> getBook();
}
