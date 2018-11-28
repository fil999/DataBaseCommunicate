package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Player;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by --- on 26.11.2018.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @ResponseBody
    @RequestMapping(value = "/selectPlayer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Player selectPlayer(@RequestBody Player player){
        return  playerRepository.findPlayerByEmail_playerAndPassword_playerAnd(player.getEmail_player(), String.valueOf(player.getPassword_player().hashCode()));
    }

    @ResponseBody
    @RequestMapping(value = "/updatePlayer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePlayer(@RequestBody Player player){
         playerRepository.save(player);
    }


}
