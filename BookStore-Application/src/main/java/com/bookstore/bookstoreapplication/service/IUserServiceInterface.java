package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface IUserServiceInterface {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdminFromUser(String username);
}
