package com.example.sqch5ex1.ex2.main;

import com.example.sqch5ex1.ex2.config.ProjectConfig;
import com.example.sqch5ex1.ex2.service.CommentService;
import com.example.sqch5ex1.ex2.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}
