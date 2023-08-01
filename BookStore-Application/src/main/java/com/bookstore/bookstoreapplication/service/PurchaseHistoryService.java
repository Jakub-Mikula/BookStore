package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.PurchaseHistory;
import com.bookstore.bookstoreapplication.repository.IPurchaseHistoryRepository;
import com.bookstore.bookstoreapplication.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryServiceInterface {
    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    public List<IPurchaseItem> findAllPurchasesOfUser(Long userId){
        return  purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
