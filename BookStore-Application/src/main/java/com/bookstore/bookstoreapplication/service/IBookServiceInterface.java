package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.Book;

import java.util.List;

public interface IBookServiceInterface {
    Book saveBook(Book book);

    void deleteBookById(long id);

    List<Book> findAllBooks();
}
