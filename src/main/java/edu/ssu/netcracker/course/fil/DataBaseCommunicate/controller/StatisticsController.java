package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Statistics;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsRepository statisticsRepository;

    @RequestMapping(value = "/insertStatistics",  method = RequestMethod.POST)
    public void insertStatistics(@RequestParam("number") int number){
        statisticsRepository.save(new Statistics(new Date(), number));
    }
}
