package com.example.security.baseApp.dtoAndMappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;

}
