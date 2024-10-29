package com.cashpark.demo.models.commons.dtos.request;

public record LoginUserDto(
        String email,
        String password
) {
}
