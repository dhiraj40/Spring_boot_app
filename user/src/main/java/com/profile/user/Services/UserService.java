package com.profile.user.Services;

import java.util.List;

import com.profile.user.Models.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    //Services
    List<User> users = List.of(
        new User(11L, "Ram"),
        new User(12L, "Shyam"),
        new User(13L, "Hari"),
        new User(14L, "Mohan")
    );

    public User getUser(Long userId){
        for(User user:users){
            if(user.getId() == userId) return user;
        }
        return null;
    }

}
