package com.cognizant.AuthenticationServiceJWT.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.AuthenticationServiceJWT.model.JWTauth;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }

  
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        if (!username.equals("user") || !password.equals("pwd")) {
            return ResponseEntity.status(403).body("Invalid credentials");
        }
        
        String token = JWTauth.generateToken(username);

        return ResponseEntity.ok().body("{\"token\": \"" + token + "\"}");
    }
}
