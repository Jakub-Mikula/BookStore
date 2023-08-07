package com.bookstore.bookstoreapplication.controller;

import com.bookstore.bookstoreapplication.models.Book;
import com.bookstore.bookstoreapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/book/")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public ResponseEntity<?> saveBook (@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.OK);
    }
    @DeleteMapping("{bookId}")
    public ResponseEntity<?> deleteBook (@PathVariable Long bookId){
         bookService.deleteBookById(bookId);
         return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllBooks (){
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }
}
