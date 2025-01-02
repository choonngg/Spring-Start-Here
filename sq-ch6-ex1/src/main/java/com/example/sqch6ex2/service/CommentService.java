package com.example.sqch6ex1.service;

import com.example.sqch6ex1.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment : " + comment.getText());
    }
}
