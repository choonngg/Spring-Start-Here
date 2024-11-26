package com.example.sqch2ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //var p = context.getBean("parrot2", Parrot.class);
        var p = context.getBean("maru1", Parrot.class);
        System.out.println(p.getName());
    }
}
