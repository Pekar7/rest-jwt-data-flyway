package com.example.restjwtdataflyway.mapper;

import com.example.restjwtdataflyway.dto.UserDto;
import com.example.restjwtdataflyway.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDto entityToDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setUsername(userEntity.getUsername());
        userDto.setPassword(userEntity.getPassword());
        userDto.setRole(userEntity.getRole());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEnabled(userEntity.isEnabled());
        userDto.setCreatedAt(userEntity.getCreatedAt());
        userDto.setUpdatedAt(userEntity.getUpdatedAt());
        return userDto;
    }

    public static UserEntity entityToDto(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDto.getId());
        userEntity.setUsername(userDto.getUsername());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setRole(userDto.getRole());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEnabled(userDto.isEnabled());
        userEntity.setCreatedAt(userDto.getCreatedAt());
        userEntity.setUpdatedAt(userDto.getUpdatedAt());
        return userEntity;
    }
}
