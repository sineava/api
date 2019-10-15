package com.request.api.controller;

import com.request.api.model.User;
import com.request.api.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {
        System.out.println("hello");
        return new UserResponse("Hi：" + user.getName());
    }
}
