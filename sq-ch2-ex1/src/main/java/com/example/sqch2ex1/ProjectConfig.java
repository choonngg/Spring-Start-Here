package com.example.sqch2ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "maru1")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Maru1");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Maru2");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Maru3");
        return p;
    }
}
