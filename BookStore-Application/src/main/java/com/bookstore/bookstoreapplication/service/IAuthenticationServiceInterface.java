package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.User;

public interface IAuthenticationServiceInterface {
    User signInAndReturnJWT(User signInRequest);
}
