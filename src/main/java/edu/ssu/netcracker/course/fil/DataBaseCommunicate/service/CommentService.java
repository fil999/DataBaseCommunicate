package edu.ssu.netcracker.course.fil.DataBaseCommunicate.service;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Comment;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by --- on 29.11.2018.
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public int insertComment(Comment comment){
        comment = commentRepository.save(comment);
        if (comment != null){
            return 0;
        }
        return -1;
    }
}
