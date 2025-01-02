package com.example.sqch6ex1.config;

import com.example.sqch6ex1.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.sqch6ex1.service")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
