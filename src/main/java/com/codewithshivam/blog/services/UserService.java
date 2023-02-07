package com.codewithshivam.blog.services;

import com.codewithshivam.blog.payloads.UserDto;

import java.util.List;

public interface UserService {

   UserDto createUser(UserDto user);
   UserDto updateUser(UserDto user,Integer userId);
   UserDto getUserbyId(Integer userId);
   List<UserDto> getAllUser();

   void deleteUser(Integer userId);


}
