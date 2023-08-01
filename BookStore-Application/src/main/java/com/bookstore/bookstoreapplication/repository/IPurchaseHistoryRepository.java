package com.bookstore.bookstoreapplication.repository;


import com.bookstore.bookstoreapplication.models.PurchaseHistory;
import com.bookstore.bookstoreapplication.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {
    @Query("SELECT b.title as title, ph.price as price, ph.purchaseTime as purchaseTime FROM PurchaseHistory ph left join Book b on b.id = ph.bookId where ph.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
