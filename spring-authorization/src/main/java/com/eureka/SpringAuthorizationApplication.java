package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthorizationApplication.class, args);
    }

    // curl (client_id):(client_secret)@localhost:8095/oauth/token -d
    // grant_type=password -d client_id=(client_id) -d scope=read -d
    // username=(username) -d password=(password)
}
