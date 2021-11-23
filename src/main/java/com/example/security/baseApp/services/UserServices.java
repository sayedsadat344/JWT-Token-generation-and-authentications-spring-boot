package com.example.security.baseApp.services;

import com.example.security.baseApp.repositories.UserRepository;
import com.example.security.baseApp.dtoAndMappers.UserDTO;
import com.example.security.baseApp.dtoAndMappers.UserDtoMapper;
import com.example.security.baseApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */

@Service
public class UserServices {


    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(UserDTO userDTO){

        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user= UserDtoMapper.map(userDTO);
        return userRepository.save(user);

    }
}
