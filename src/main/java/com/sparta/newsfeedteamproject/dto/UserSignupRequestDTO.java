package com.sparta.newsfeedteamproject;

import lombok.Data;

@Data
public class UserSignupRequestDTO {
    private String userName;
    private String password;
    private String email;
}