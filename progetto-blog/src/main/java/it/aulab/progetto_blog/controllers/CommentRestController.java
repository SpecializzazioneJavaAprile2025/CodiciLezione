package it.aulab.progetto_blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.progetto_blog.models.Comment;
import it.aulab.progetto_blog.repositories.CommentRepository;

@Controller
@RequestMapping("/api/comments")
public class CommentRestController {
@Autowired
    CommentRepository commentRepository;
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Comment> getAllPost(){
        return commentRepository.findAll();
    }

}
