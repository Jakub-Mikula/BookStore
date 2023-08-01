package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.Book;
import com.bookstore.bookstoreapplication.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements IBookServiceInterface {
   @Autowired
    private IBookRepository bookRepository;

   @Override
   public Book saveBook(Book book){
       book.setCreateTime(LocalDateTime.now());
       return bookRepository.save(book);
   }
    @Override
   public void deleteBookById(long id){
       bookRepository.deleteById(id);
   }

   @Override
   public List<Book> findAllBooks(){
       return bookRepository.findAll();
   }
}
