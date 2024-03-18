package com.ssafy.backend.domain.user.service;

import com.ssafy.backend.domain.user.dto.request.SignupRequestDto;
import com.ssafy.backend.global.jwt.dto.TokenDto;
import com.ssafy.backend.global.jwt.dto.UserInfoDto;

public interface AuthService {

    void signup(SignupRequestDto signupRequestDto);
    UserInfoDto login(String email, String password);
    TokenDto reissue(String refreshToken);
    boolean duplicateCheckEmail(String email);

}
