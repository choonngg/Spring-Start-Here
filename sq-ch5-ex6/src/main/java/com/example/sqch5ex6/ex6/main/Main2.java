package com.example.sqch5ex6.ex6.main;

import com.example.sqch5ex6.ex6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = c.getBean("commentService");
        var cs2 = c.getBean("commentService");
        boolean b1 = cs1 == cs2;
        System.out.println(b1);
    }
}
