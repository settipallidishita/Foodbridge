package com.example.foodbridge.backend.controller;

import com.example.foodbridge.backend.dto.AuthRequest;
import com.example.foodbridge.backend.dto.AuthResponse;
import com.example.foodbridge.backend.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    // Placeholder for AuthService
    
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        // Implement logic later
        return ResponseEntity.ok(new AuthResponse("dummy_token", "Registration successful", request.getRole()));
    }
    
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        // Implement logic later
        return ResponseEntity.ok(new AuthResponse("dummy_token", "Login successful", null));
    }
}
