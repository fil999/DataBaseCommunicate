package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Comment;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @ResponseBody
    @RequestMapping(value = "/insertComment",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertComment(@RequestParam("comment")Comment comment){
        commentRepository.save(comment);
    }
}
