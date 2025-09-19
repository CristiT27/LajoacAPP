package com.LajoacApp.Lajoac.service;

import com.LajoacApp.Lajoac.model.User;
import com.LajoacApp.Lajoac.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository
    userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
