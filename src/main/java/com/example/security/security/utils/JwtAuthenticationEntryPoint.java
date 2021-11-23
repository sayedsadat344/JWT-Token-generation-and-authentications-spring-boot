package com.example.security.security.utils;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;



/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */


@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}