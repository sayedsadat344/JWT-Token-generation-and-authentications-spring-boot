package com.example.security.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.security.base.UserRepository;
import com.example.security.base.UserServices;

@Service
public class JwtUserDetailsService implements UserDetailsService {


    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.security.base.User user = userRepository.findByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        } else {
            return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
        }
        // if ("javainuse".equals(username)) {
        //     return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
        //             new ArrayList<>());
        // } else {
        //     throw new UsernameNotFoundException("User not found with username: " + username);
        // }
    }
}
