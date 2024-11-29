package com.example.sqch3ex1.config;

import com.example.sqch3ex1.beans.Parrot;
import com.example.sqch3ex1.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Maru");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Choong");
        p.setParrot(parrot());
        return p;
    }

}
