package com.wl.demo.dao;

import com.wl.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
    public Iterable<Book> findAllByPriceGreaterThanAndAuthorLike(double price, String author);
}