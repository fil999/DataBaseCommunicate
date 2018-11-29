package edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Back;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by --- on 26.11.2018.
 */
public interface BackRepository extends JpaRepository<Back, Long> {
}
