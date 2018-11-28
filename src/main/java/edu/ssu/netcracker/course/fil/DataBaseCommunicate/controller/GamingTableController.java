package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.GamingTable;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.GamingTableRepository;
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
@RequestMapping("/gamingTable")
public class GamingTableController {

    @Autowired
    private GamingTableRepository gamingTableRepository;

    @ResponseBody
    @RequestMapping(value = "/selectAllGamingTable",  method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<GamingTable> selectAllGamingTable(){
        return gamingTableRepository.findAll();
    }
}
