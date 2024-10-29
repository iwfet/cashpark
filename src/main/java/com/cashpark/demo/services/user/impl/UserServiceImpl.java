package com.cashpark.demo.services.user.impl;

import com.cashpark.demo.mapper.UserMapper;
import com.cashpark.demo.models.commons.dtos.request.RegisterUserDto;
import com.cashpark.demo.models.commons.dtos.request.UpdateUserDTO;
import com.cashpark.demo.models.domain.User;
import com.cashpark.demo.models.repository.UserRepository;
import com.cashpark.demo.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private  UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
    @Override
    public User saveUser(RegisterUserDto user) {
        User userEntity = userMapper.toUserEntity(user);
        return userRepository.save(userEntity);
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(Long id, UpdateUserDTO updateUserDTO) {
        return  findUserById(id).
                map((user)->{
                    user.setName(updateUserDTO.name());
                    user.setPassword(updateUserDTO.password());
                    user.setUserType(updateUserDTO.userType());
                    user.setEmail(updateUserDTO.email());


                    userRepository.save(user);
                    return user;
                })
                .orElseThrow(()-> new RuntimeException("User não encontrado"));
    }
}
