package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.pojo.Book;

import java.util.List;

public interface BookService {
    public int addBook(Book book);
    public int editBook(Book book);
    public int deleteBook(Long book_id);
    public Book getBookById(Long book_id);
    public List<Book> getBook();
}
