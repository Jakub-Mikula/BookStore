package com.bookstore.bookstoreapplication.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime purchaseTime();
}