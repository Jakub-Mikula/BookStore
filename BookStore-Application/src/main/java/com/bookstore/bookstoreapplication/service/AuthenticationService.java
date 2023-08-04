package com.bookstore.bookstoreapplication.service;

import com.bookstore.bookstoreapplication.models.User;
import com.bookstore.bookstoreapplication.security.JWT.IJwtProvider;

import com.bookstore.bookstoreapplication.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationServiceInterface {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private IJwtProvider jwtProvider;
    @Override
    public User signInAndReturnJWT (User signInRequest){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword())
        );
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userPrincipal);
        User signInUser = userPrincipal.getUser();
        signInUser.setToken(jwt);
        return signInUser;
    }
}
