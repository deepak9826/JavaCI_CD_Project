package com.example.javademo.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(String username) {
        System.out.println("Creating user: " + username);
    }

    public void deleteUser(String username) {
        System.out.println("Deleting user: " + username);
    }
}
