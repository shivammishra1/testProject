package com.codewithshivam.blog.services.impl;

import com.codewithshivam.blog.model.Users;
import com.codewithshivam.blog.payloads.UserDto;
import com.codewithshivam.blog.repositories.UserRepo;
import com.codewithshivam.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto user, Integer userId) {
        return null;
    }

    @Override
    public UserDto getUserbyId(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    private Users dtoToModel(UserDto userDto)
    {
        Users user = new Users();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        return user;
    }

    public UserDto userDto(Users user)

        UserDto userDto = new UserDto();

}