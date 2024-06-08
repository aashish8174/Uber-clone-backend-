package com.example.Uber.Backend.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int adminId;
    String username;
    String password;
}
