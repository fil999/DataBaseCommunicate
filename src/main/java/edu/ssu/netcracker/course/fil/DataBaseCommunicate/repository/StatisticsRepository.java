package edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Statistics;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by --- on 26.11.2018.
 */
public interface StatisticsRepository extends CrudRepository<Statistics, Date> {
}
