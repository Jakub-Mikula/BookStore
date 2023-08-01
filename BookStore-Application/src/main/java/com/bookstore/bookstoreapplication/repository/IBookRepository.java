package com.bookstore.bookstoreapplication.repository;


import com.bookstore.bookstoreapplication.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
