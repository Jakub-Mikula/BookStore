package com.bookstore.bookstoreapplication.models;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title", nullable = false, unique = true, length = 100)
    private String title;
    @Column(name = "author", nullable = false, length = 100)
    private String author;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;
}
