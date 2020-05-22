package com.yanjunyi.ssm.controller;

import com.yanjunyi.ssm.pojo.Book;
import com.yanjunyi.ssm.pojo.ReaderCard;
import com.yanjunyi.ssm.pojo.ReaderInfo;
import com.yanjunyi.ssm.service.BookService;
import com.yanjunyi.ssm.service.ReaderInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping(value = "/get/{id}",produces =  "application/json; charset=utf-8")
    public @ResponseBody String getBookById(@PathVariable("id") Long id){
        Book book=bookService.getBookById(id);
        System.out.println(book.toString());
        return book.toString();
    }
    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public @ResponseBody String addBook(Book book){
        System.out.println(book);
        Integer i = bookService.addBook(book);
        return "success";
    }

    @RequestMapping(value = "/addBook",method = RequestMethod.GET)
    public String addBook(){
        return "book_add";
    }


    @RequestMapping("/reader_books")
    public ModelAndView readerBooks(HttpServletRequest request) {
        List<Book> books = bookService.getBook();
        ModelAndView modelAndView = new ModelAndView("reader_books");
        modelAndView.addObject("books", books);
         return modelAndView;
    }

    @RequestMapping("/reader_book_detail")
    public ModelAndView bookDetail(HttpServletRequest request) {
        long bookId = Long.parseLong(request.getParameter("bookId"));
        Book book = bookService.getBookById(bookId);
        ModelAndView modelAndView = new ModelAndView("reader_book_detail");
        modelAndView.addObject("detail", book);
        return modelAndView;
    }
}
