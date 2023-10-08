package com.example.restjwtdataflyway.dto;

import com.example.restjwtdataflyway.entity.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.JoinColumn;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO - data transfer object это класс который используется для API контрактов
 * чтобы не использовать Entity будем использовать DTO для передачи по API
 * DTO использует sneak_case, Entity использует camelCase
 * через JSON prop указываем sneak_case
 */
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class) //sneak_case в camelCase
public class UserDto {
    private Long id;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // не хотим отдавать
    private String password;
    private UserRole role;
    @JoinColumn
    private String firstName;
    private String lastName;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
