package com.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;

@SpringBootApplication
public class SpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);

        /*
         * Map<String, String> uriVariables =
         * ServerWebExchangeUtils.getPathPredicateVariables(""); String segment =
         * uriVariables.get("segment");
         */
    }

}
