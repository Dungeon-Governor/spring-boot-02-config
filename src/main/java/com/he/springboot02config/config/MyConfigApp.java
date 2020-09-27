package com.he.springboot02config.config;

import com.he.springboot02config.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigApp {

    @Bean
    public Person Person(){
        System.out.println(154);
        return new Person();
    }
}
