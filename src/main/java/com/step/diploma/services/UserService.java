package com.step.diploma.services;

import com.step.diploma.entities.User;
import com.step.diploma.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        userRepository.save(user);
    }

    public User findUser(Integer userId){
        return userRepository.findById(userId).orElse(null);
    }


}
