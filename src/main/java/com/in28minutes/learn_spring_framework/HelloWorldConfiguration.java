package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java Record to hold Person data
record Person(String name, int age){ }
// Java Record to hold Address data
record Address(String firstLine, String city){ }

@Configuration
public class HelloWorldConfiguration {
    // Configure the Spring Beans
    @Bean
    public String name() {
        return "Sudeshna";
    }

    @Bean
    public int age() {
        return 21;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 25);
    }

    @Bean
    public Address address(){
        return new Address("Baker's Street", "London");
    }

}
