package com.cashpark.demo.models.commons.dtos.request;

import com.cashpark.demo.models.commons.constantes.UserType;

public record RegisterUserDto(
        String name,
        String email,
        String password,
        UserType userType
) {
}