package com.example.security.base;

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
