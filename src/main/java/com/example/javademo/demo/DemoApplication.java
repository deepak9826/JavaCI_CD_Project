package com.example.javademo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javademo.demo.Service.UserService;

@RestController
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Boot";
    }

    @Override
    public void run(String... args) throws Exception {
        // Call service methods to trigger the AOP logging
        userService.createUser("Alice");
        userService.deleteUser("Bob");
    }
}
