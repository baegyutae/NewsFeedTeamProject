package com.sparta.newsfeedteamproject;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void signupNewUserAccount(UserSignupRequestDTO userSignupRequestDTO) {
        // 패스워드 인코딩
        String password = passwordEncoder.encode(userSignupRequestDTO.getPassword());
        userSignupRequestDTO.setPassword(password);
        User user = new User(userSignupRequestDTO);

        // 이메일 중복 확인
        if (userRepository.findByEmail(userSignupRequestDTO.getEmail()).isPresent()) {
            throw new IllegalArgumentException("중복된 email 입니다.");
        }
        userRepository.save(user);
    }
}

