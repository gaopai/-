package com.wl.demo.biz;

import com.wl.demo.dao.BookDAO;
import com.wl.demo.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookBiz {
    @Resource
    private BookDAO bookDAO;

    public Iterable<Book> findAll(){
        return bookDAO.findAllByPriceGreaterThanAndAuthorLike(20, "天蚕%");
    }
}
