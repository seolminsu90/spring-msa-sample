package com.eureka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

@Configuration
public class LoggingGlobalFiltersConfigurations {

    final Logger logger = LoggerFactory.getLogger(LoggingGlobalFiltersConfigurations.class);

    @Bean
    public GlobalFilter postGlobalFilter() {
        return (exchange, chain) -> {
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("Global Post Filter executed");
            }));
        };
    }

    @Bean
    public GlobalFilter preGlobalFilter() {
        return (exchange, chain) -> {
            logger.info("Global Pre Filter executed");
            return chain.filter(exchange);
        };
    }
}
