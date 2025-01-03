package com.example.sqch6ex2.service;

import com.example.sqch6ex2.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment : " + comment.getText());
        return "SUCCESS";
    }
}
