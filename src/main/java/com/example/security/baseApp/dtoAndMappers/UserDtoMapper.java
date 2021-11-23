package com.example.security.baseApp.dtoAndMappers;

import com.example.security.baseApp.dtoAndMappers.UserDTO;
import com.example.security.baseApp.models.User;



/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */


public class UserDtoMapper {
    public static User map(UserDTO userDTO){
        User newUser = new User();
        newUser.setName(userDTO.getName());
        newUser.setEmail(userDTO.getEmail());
        newUser.setUsername(userDTO.getUsername());
        newUser.setLastName(userDTO.getLastName());
        newUser.setPassword(userDTO.getPassword());

        return newUser;
    }
}
