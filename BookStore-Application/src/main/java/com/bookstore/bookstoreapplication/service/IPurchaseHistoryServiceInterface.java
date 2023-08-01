package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.PurchaseHistory;

public interface IPurchaseHistoryServiceInterface {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
}
