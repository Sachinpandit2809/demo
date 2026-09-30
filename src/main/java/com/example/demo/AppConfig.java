package com.example.demo;


import com.example.demo.User.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig{
    @Bean
    public User createUser(){
        return new User("Sachin", 23);
    }
// empty
}