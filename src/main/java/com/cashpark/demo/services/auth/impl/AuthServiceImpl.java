package com.cashpark.demo.services.auth.impl;

import com.cashpark.demo.mapper.UserMapper;
import com.cashpark.demo.models.commons.dtos.request.LoginUserDto;
import com.cashpark.demo.models.commons.dtos.request.RegisterUserDto;
import com.cashpark.demo.models.domain.User;
import com.cashpark.demo.models.repository.UserRepository;
import com.cashpark.demo.services.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserMapper userMapper;


    @Override
    public User signup(RegisterUserDto user) {
        User userEntity = userMapper.toUserEntity(user);
        userEntity.setPassword(passwordEncoder.encode(user.password()));
        return userRepository.save(userEntity);
    }


    @Override
    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.email(),
                        input.password()
                )
        );

        return userRepository.findByEmail(input.email())
                .orElseThrow();
    }

}
