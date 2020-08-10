package com.eureka.config;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.eureka.entity.User;
import com.eureka.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationRunner {

    @Resource (name="UserRepository")
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Init Data...");
        User newUser = new User();        
        PasswordEncoder passwordEncoder;
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        newUser.setUsername("test");
        newUser.setPassword(passwordEncoder.encode("1234"));
        newUser.setUserType(0);
        newUser.setDate(new Date()); 
        userRepository.save(newUser);
    }
}
