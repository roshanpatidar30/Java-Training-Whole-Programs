package com.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }

 // Getters and setters...
}