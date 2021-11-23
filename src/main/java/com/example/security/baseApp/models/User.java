package com.example.security.baseApp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import javax.validation.constraints.Size;



/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */

@Entity(name = "user")
@Table(name = "user_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_tbl_generator")
    @SequenceGenerator(name = "user_tbl_generator", sequenceName = "user_tbl_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic(optional = false)
    @NotNull
    @Column(name = "name")
    private String name;


    @Basic(optional = false)
    @NotNull
    @Column(name = "lastname")
    private String lastName;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;


    @Size(min = 3, max = 100, message = "Username must at least 3 characters.")
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 3, max = 100, message = "Password must at least 3 characters.")
    @JsonIgnore
    private String password;


}
