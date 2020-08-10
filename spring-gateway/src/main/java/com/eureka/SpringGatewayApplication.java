package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class SpringGatewayApplication {

    public static void main(String[] args) {
        System.setProperty("reactor.netty.http.server.accessLogEnabled", "true");
        SpringApplication.run(SpringGatewayApplication.class, args);
    }

}
