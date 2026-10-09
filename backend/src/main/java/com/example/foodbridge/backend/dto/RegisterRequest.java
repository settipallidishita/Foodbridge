package com.example.foodbridge.backend.dto;

import com.example.foodbridge.backend.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String email;
    private String phone;
    private String password;
    private Role role;
    private String organizationName;
    private String registrationNumber;
    private String address;
}
