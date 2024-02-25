package com.example.democlient.demo;

import com.example.democlient.auth.dtos.AuthenticationUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "UserManagement", url = "http://localhost:8080")
public interface UsersClient {

        public static final String AUTHORIZATION = "Authorization";
        public static final String USERS_PATH = "/api/v1/users/";

        @GetMapping(value = USERS_PATH)
        ResponseEntity<AuthenticationUser> getUser(@RequestHeader(AUTHORIZATION) String bearerToken);



}
