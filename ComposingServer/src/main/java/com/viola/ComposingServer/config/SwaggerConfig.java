package com.viola.ComposingServer.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("composing")
                .packagesToScan("com.viola.ComposingServer.controller")
                .pathsToMatch("/**").build();
    }
}