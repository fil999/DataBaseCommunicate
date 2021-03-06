package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Friend;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.FriendRepository;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/friend")
public class FriendController {

    @Autowired
    private FriendService friendService;

    @ResponseBody
    @RequestMapping(value = "/insertFriend",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public int insertFriend(@RequestBody Friend friend) {
        return friendService.insertFriend(friend);
    }
}
