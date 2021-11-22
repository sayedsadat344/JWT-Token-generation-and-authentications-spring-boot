package com.example.security.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

import javax.*;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_name")
    private String name;


    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_last_name")
    private String lastName;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "employee_email")
    private String email;


    @Size(min = 3, max = 100, message = "Username must at least 3 characters.")
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 3, max = 100, message = "Password must at least 3 characters.")
    @JsonIgnore
    private String password;


}
