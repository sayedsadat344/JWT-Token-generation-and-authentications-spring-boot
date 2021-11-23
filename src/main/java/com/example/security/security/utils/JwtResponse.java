package com.example.security.security.utils;

import lombok.*;

import java.io.Serializable;


/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */

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
