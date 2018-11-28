package edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by --- on 26.11.2018.
 */
public interface CommentRepository extends CrudRepository<Comment, Long> {
}
