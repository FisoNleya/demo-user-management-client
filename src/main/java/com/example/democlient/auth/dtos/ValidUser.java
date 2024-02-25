package com.example.democlient.auth.dtos;

public record ValidUser(
         String firstname,
         String lastname,
         String email,
         Role role

) {
}
