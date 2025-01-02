package com.example.sqch6ex1.main;

import com.example.sqch6ex1.config.ProjectConfig;
import com.example.sqch6ex1.model.Comment;
import com.example.sqch6ex1.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Hatasha");

        service.publishComment(comment);
    }
}
