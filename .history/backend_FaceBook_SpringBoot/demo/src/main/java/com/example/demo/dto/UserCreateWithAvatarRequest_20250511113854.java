package com.example.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Schema(description = "Request object for creating a new user with avatar")
public class UserCreateWithAvatarRequest {
    @NotBlank(message = "Name is required")
    @Schema(description = "Name of the user", example = "John Doe")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Schema(description = "Email of the user", example = "john.doe@example.com")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    @Schema(description = "Password of the user", example = "password123")
    private String password;

    @Schema(description = "Bio or description of the user", example = "Software developer")
    private String bio;

    @Schema(description = "Avatar image file", type = "string", format = "binary")
    private MultipartFile avatar;
} 