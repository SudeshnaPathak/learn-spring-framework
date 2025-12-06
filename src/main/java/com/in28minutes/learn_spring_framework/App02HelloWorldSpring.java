package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args)
    {
        // JVM -> Spring Context (Container) -> Spring Bean
        //1. Launch a Spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to manage(Spring Beans)
        // HelloWorldConfiguration class - @Configuration
        // name method - @Bean

        //3. Retrieving Beans managed by Spring Context
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
