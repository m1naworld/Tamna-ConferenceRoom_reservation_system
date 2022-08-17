package com.example.tamna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/login")
    public void reqLogin(){

    }

    @PostMapping("token")
    public String token() {
        return "<h1>token</h1>";
    }
}