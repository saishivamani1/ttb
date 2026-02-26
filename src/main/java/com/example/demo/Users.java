package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }
}
