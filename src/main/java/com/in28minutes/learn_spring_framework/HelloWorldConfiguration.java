package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    // Configure the Spring Beans
    @Bean
    public String name() {
        return "Sudeshna";
    }

}
