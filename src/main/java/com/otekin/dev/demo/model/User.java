package com.otekin.dev.demo.model;

public record User
        (Long id,
         String firstName,
         String lastName,
         String email) {
}