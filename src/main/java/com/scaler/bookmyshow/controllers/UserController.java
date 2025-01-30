package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.UserRequestDto;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User signup(UserRequestDto requestDto) {
        // TODO: ADd try catch block
        return userService.signUp(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassowrd());
    }
}
