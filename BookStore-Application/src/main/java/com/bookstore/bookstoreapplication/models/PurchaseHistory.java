package com.bookstore.bookstoreapplication.models;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "bookId", nullable = false)
    private long bookId;
    @Column(name = "userId", nullable = false)
    private long userId;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "create_time", nullable = false)
    private LocalDateTime purchaseTime;
}


