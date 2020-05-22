package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.dao.BookDao;
import com.yanjunyi.ssm.pojo.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImp implements BookService {
    @Resource
    private BookDao bookDao;

    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    public int editBook(Book book) {
        return bookDao.editBook(book);
    }

    public int deleteBook(Long book_id) {
        return bookDao.deleteBook(book_id);
    }

    public Book getBookById(Long book_id) {
        return bookDao.getBookById(book_id);
    }

    public List<Book> getBook() {
        return bookDao.getBook();
    }
}
