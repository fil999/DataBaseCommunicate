package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Back;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.BackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/back")
public class BackController {

    @Autowired
    private BackRepository backRepository;

    @ResponseBody
    @RequestMapping(value = "/selectAllBack",  method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Back> selectAll() {
        Iterable<Back> backIterable = backRepository.findAll();
        return backIterable;
    }
}
