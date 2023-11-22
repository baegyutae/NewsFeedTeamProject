package com.sparta.newsfeedteamproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signupUser(@RequestBody UserSignupRequestDTO userSignupRequestDTO) {
        userService.signupNewUserAccount(userSignupRequestDTO);
        return ResponseEntity.ok("사용자가 성공적으로 등록되었습니다.");
    }
}
