package com.example.security.baseApp.controllers;

import com.example.security.baseApp.dtoAndMappers.UserDTO;
import com.example.security.baseApp.services.UserServices;
import com.example.security.baseApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */

@RestController
@CrossOrigin
@RequestMapping(value="api/user")
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping()
    public User saveUser(@RequestBody UserDTO userDTO){
     return userServices.saveUser(userDTO);
    }
}