package com.bookstore.bookstoreapplication.controller;

import com.bookstore.bookstoreapplication.models.PurchaseHistory;
import com.bookstore.bookstoreapplication.security.UserPrincipal;
import com.bookstore.bookstoreapplication.service.PurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")
public class PurchaseHistoryController {
    @Autowired
    private PurchaseHistoryService purchaseService;

    @PostMapping
    public ResponseEntity<?> saveNewPurchase (@RequestBody PurchaseHistory purchaseHistory){
        return  new ResponseEntity<>(purchaseService.savePurchaseHistory(purchaseHistory), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getAllUserPurchases(@AuthenticationPrincipal UserPrincipal principal){
        return  ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(principal.getId()));
    }
}
