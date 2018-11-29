package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Statistics;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.StatisticsRepository;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @ResponseBody
    @RequestMapping(value = "/insertStatistics", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int insertStatistics(@RequestBody int number){
        return statisticsService.insertStatistics(number);
    }
}
