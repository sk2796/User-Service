package com.project.userservice.service;

import com.project.userservice.dto.UserDto;
import com.project.userservice.mapper.UserMapper;
import com.project.userservice.mdoel.User;
import com.project.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto addUser(User user) {
        User savedUser = userRepository.save(user);
        return UserMapper.INSTANCE.toUserDto(savedUser);
    }

    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList.stream().map(UserMapper.INSTANCE::toUserDto).toList();
    }

    public Optional<UserDto> getUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(UserMapper.INSTANCE::toUserDto);
    }
}
