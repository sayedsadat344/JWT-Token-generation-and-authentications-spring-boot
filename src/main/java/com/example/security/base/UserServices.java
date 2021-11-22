package com.example.security.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServices {
    @Autowired
    private UserDtoMapper userDtoMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(UserDTO userDTO){

        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user= userDtoMapper.map(userDTO);

        return user;

    }
}
