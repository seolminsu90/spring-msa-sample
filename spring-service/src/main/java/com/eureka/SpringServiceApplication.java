package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceApplication.class, args);
	}

}
