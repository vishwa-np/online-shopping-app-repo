package com.online.shopping.jwtmodel;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class JwtRequest {

    @NotEmpty(message = "Enter user name")
    private String userName;

    @NotEmpty(message = "Enter password")
    private String password;

}
