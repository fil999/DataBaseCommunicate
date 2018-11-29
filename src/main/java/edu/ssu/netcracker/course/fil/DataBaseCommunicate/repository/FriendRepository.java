package edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by --- on 26.11.2018.
 */
public interface FriendRepository extends JpaRepository<Friend, Long> {
}
