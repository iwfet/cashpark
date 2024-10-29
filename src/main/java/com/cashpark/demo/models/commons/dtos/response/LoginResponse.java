package com.cashpark.demo.models.commons.dtos.response;

import com.cashpark.demo.models.domain.User;

public record LoginResponse(
        String token, Long expiresIn
) {
}
