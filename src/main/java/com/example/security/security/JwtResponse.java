package com.example.security.security;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JwtResponse implements Serializable {
    private String jwttoken;
    private String username;
    private String email;


    public JwtResponse(String token) {
        this.jwttoken = token;
    }
}
