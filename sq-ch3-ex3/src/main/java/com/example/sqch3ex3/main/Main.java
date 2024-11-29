package com.example.sqch3ex1.main;

import com.example.sqch3ex1.beans.Parrot;
import com.example.sqch3ex1.beans.Person;
import com.example.sqch3ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("person.getName() = " + person.getName());
        System.out.println("parrot.getName( = " + parrot.getName());
        System.out.println("person.getParrot() = " + person.getParrot());
    }
}
