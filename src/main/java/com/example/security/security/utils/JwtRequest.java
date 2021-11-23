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
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;
}
