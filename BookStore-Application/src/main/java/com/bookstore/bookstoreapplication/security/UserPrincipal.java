package com.bookstore.bookstoreapplication.security;

import com.bookstore.bookstoreapplication.models.Role;
import com.bookstore.bookstoreapplication.models.User;
import com.bookstore.bookstoreapplication.util.SecurityUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPrincipal implements UserDetails {
    private long id;
    private String username;
    transient private String password; //transient means that it does not show up
    transient private User user; //user for only login operation, do not use in JWToken.
    private Set<GrantedAuthority> authorities;

    public static UserPrincipal createSuperUser(){
        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(Role.SYSTEM_MANAGER.name()));
        return UserPrincipal.builder()
                .id(-1)
                .username("system-administrator")
                .authorities(authorities)
                .build();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
