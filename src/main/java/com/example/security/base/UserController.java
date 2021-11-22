package com.example.security.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

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