package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java Record to hold Person data
record Person(String name, int age , Address address){ }
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
        return new Person("Ravi", 25 , new Address("Main Street" , "Utrecht"));
    }

    @Bean(name = "address2") // Custom Bean Name
    public Address address(){
        return new Address("Baker's Street", "London");
    }

    @Bean
    public Address address3(){
        return new Address("Motinagar", "Hyderabad");
    }

    @Bean
    public Person person2MethodCall(){
        //Auto wiring using Method Calls
        return new Person(name() , age() , address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        // Creating Bean using existing Beans as Parameters
        // Auto wiring using Parameters
        return new Person(name , age , address3);
    }
}
