package com.project.upgrade.userformvalidation.service;



import com.project.upgrade.userformvalidation.model.User;
import com.project.upgrade.userformvalidation.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public void registerUser(User newUser) {

        userRepository.registerUser(newUser);
    }

}