package com.example.sqch3ex4.main;

import com.example.sqch3ex4.beans.Person;
import com.example.sqch3ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        p.setName("Choong");
        p.getParrot().setName("Maru");

        System.out.println("p.getName() = " + p.getName());
        System.out.println("p.getParrot( = " + p.getParrot());
    }
}
