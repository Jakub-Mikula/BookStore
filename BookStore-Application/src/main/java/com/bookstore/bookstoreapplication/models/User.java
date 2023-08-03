package com.bookstore.bookstoreapplication.models;

import javax.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", unique = true, nullable = false, length = 100)
    private String name;
    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;
    @Column(name = "password", unique = true, nullable = false, length = 100)
    private String password;
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
    @Transient //wont be in database
    private String token;
}
