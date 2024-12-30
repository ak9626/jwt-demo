package com.example.jwtdemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    @PreAuthorize("hasRole('USER')")  // This matches the ROLE_USER authority
    public String test() {
        return "If you see this, you are authenticated!";
    }
}