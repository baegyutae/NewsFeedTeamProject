package com.sparta.newsfeedteamproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // Spring Security 인증 기능 제외
public class NewsfeedteamprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsfeedteamprojectApplication.class, args);
    }

}
