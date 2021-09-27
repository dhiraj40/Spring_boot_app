package com.profile.user.Controllers;

import java.util.List;

import com.profile.user.Models.User;
import com.profile.user.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId){
        User user = userService.getUser(userId);

        List todos = restTemplate.getForObject("http://localhost:9001/todos/"+userId, List.class);
        user.setTodos(todos);

        return user;
    }
}
