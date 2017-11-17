package com.wl.demo.controller;

import com.wl.demo.biz.BookBiz;
import com.wl.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookBiz bookBiz;

    @RequestMapping("/list")
    public String list(Model model) {
        Iterable<Book> list = bookBiz.findAll();
        model.addAttribute("list", list);
        return "/book/list";
    }
}