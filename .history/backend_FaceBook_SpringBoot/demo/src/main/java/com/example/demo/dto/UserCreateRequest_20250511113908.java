package com.example.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
@Schema(description = "Request object for creating a new user")
public class UserCreateRequest {
    @Schema(description = "Name of the user", example = "John Doe")
    private String name;

    @Schema(description = "Email of the user", example = "john.doe@example.com")
    private String email;

    @Schema(description = "Password of the user", example = "password123")
    private String password;

    @Schema(description = "Bio or description of the user", example = "Software developer")
    private String bio;
}