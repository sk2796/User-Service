package com.project.userservice.mapper;

import com.project.userservice.dto.UserDto;
import com.project.userservice.mdoel.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(UserDto userDTO);
    UserDto toUserDto(User user);
}
