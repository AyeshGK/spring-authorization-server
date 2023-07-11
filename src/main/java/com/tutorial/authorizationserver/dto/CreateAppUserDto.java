package com.tutorial.authorizationserver.dto;

import java.util.List;

public record CreateAppUserDto(
        String username,
        String password,
        String email,
        List<String> roles
) {
}
