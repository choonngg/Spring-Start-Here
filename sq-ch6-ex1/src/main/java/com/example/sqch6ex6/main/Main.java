package com.example.sqch6ex4.main;

import com.example.sqch6ex4.config.ProjectConfig;
import com.example.sqch6ex4.model.Comment;
import com.example.sqch6ex4.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Hatasha");

        service.publishComment(comment);
        service.deleteComment(comment);
        service.editComment(comment);
    }
}
