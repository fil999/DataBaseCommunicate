package edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by --- on 26.11.2018.
 */
public interface StatisticsRepository extends JpaRepository<Statistics, Date> {
}
