package com.cashpark.demo.services.auth;

import com.cashpark.demo.models.commons.dtos.request.LoginUserDto;
import com.cashpark.demo.models.commons.dtos.request.RegisterUserDto;
import com.cashpark.demo.models.domain.User;

public interface AuthService {

    User signup(RegisterUserDto user);

    User authenticate(LoginUserDto input);
}
