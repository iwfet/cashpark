package com.cashpark.demo.services.user;

import com.cashpark.demo.models.commons.dtos.request.RegisterUserDto;
import com.cashpark.demo.models.commons.dtos.request.UpdateUserDTO;
import com.cashpark.demo.models.domain.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<User> findAllUsers();

    Optional<User> findUserById(Long id);

    User saveUser(RegisterUserDto user);

    void deleteUser(Long id);

    User update(Long id, UpdateUserDTO userDetails);
}
