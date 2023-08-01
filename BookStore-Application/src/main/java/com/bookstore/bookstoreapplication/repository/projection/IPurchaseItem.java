package com.bookstore.bookstoreapplication.repository.projection;

import java.time.LocalDateTime;

public interface IPurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime purchaseTime();
}