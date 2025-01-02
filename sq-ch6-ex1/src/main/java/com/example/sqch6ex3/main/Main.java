package com.example.sqch6ex2.main;

import com.example.sqch6ex2.config.ProjectConfig;
import com.example.sqch6ex2.model.Comment;
import com.example.sqch6ex2.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Hatasha");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}
