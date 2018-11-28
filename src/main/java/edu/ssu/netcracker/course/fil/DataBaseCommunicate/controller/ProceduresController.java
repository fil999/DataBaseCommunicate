package edu.ssu.netcracker.course.fil.DataBaseCommunicate.controller;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

/**
 * Created by --- on 27.11.2018.
 */
@Controller
@RequestMapping("/procedures")
public class ProceduresController {

    @Autowired
    private EntityManager entityManager;

    @RequestMapping(value = "/game",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void game(@RequestBody LastResult lastResult){
        StoredProcedureQuery proc = entityManager.createStoredProcedureQuery("game_func")
                .registerStoredProcedureParameter("id_player_game", long.class, ParameterMode.IN)
                .setParameter("id_player_game", lastResult.getPlayer())
                .registerStoredProcedureParameter("id_opponent", long.class, ParameterMode.IN)
                .setParameter("id_opponent", lastResult.getOpponent())
                .registerStoredProcedureParameter("rezult", int.class, ParameterMode.IN)
                .setParameter("rezult", lastResult.getResult());
        proc.execute();
    }

    @RequestMapping(value = "/friendsGame",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void friendsGame(@RequestBody ResultsFriends resultsFriends){
        StoredProcedureQuery proc = entityManager.createStoredProcedureQuery("game_friend_func")
                .registerStoredProcedureParameter("id_friends_game", long.class, ParameterMode.IN)
                .setParameter("id_friends_game", resultsFriends.getFriends())
                .registerStoredProcedureParameter("rezult", int.class, ParameterMode.IN)
                .setParameter("rezult", resultsFriends.getResult());
        proc.execute();
    }

    @RequestMapping(value = "/save2",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save2(@RequestBody SavedGame2 savedGame2){
        StoredProcedureQuery proc = entityManager.createStoredProcedureQuery("save_game2_func")
                .registerStoredProcedureParameter("player1", long.class, ParameterMode.IN)
                .setParameter("player1", savedGame2.getPlayer1())
                .registerStoredProcedureParameter("player2", int.class, ParameterMode.IN)
                .setParameter("player2", savedGame2.getPlayer2())
                .registerStoredProcedureParameter("cards1", String.class, ParameterMode.IN)
                .setParameter("cards1", savedGame2.getCardPlayer1())
                .registerStoredProcedureParameter("cards2", String.class, ParameterMode.IN)
                .setParameter("cards2", savedGame2.getCardPlayer2())
                .registerStoredProcedureParameter("cardsResidual", String.class, ParameterMode.IN)
                .setParameter("cardsResidual", savedGame2.getCardResidual())
                .registerStoredProcedureParameter("trump", String.class, ParameterMode.IN)
                .setParameter("trump", savedGame2.getTrump());
        proc.execute();
    }

    @RequestMapping(value = "/save3",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save3(@RequestBody SavedGame3 savedGame3){
        StoredProcedureQuery proc = entityManager.createStoredProcedureQuery("save_game3_func")
                .registerStoredProcedureParameter("player1", long.class, ParameterMode.IN)
                .setParameter("player1", savedGame3.getPlayer1())
                .registerStoredProcedureParameter("player2", int.class, ParameterMode.IN)
                .setParameter("player2", savedGame3.getPlayer2())
                .registerStoredProcedureParameter("player3", int.class, ParameterMode.IN)
                .setParameter("player3", savedGame3.getPlayer3())
                .registerStoredProcedureParameter("cards1", String.class, ParameterMode.IN)
                .setParameter("cards1", savedGame3.getCardPlayer1())
                .registerStoredProcedureParameter("cards2", String.class, ParameterMode.IN)
                .setParameter("cards2", savedGame3.getCardPlayer2())
                .registerStoredProcedureParameter("cards3", String.class, ParameterMode.IN)
                .setParameter("cards3", savedGame3.getCardPlayer3())
                .registerStoredProcedureParameter("cardsResidual", String.class, ParameterMode.IN)
                .setParameter("cardsResidual", savedGame3.getCardResidual())
                .registerStoredProcedureParameter("trump", String.class, ParameterMode.IN)
                .setParameter("trump", savedGame3.getTrump());
        proc.execute();
    }

    @RequestMapping(value = "/save4",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save4(@RequestBody SavedGame4 savedGame4){
        StoredProcedureQuery proc = entityManager.createStoredProcedureQuery("save_game3_func")
                .registerStoredProcedureParameter("player1", long.class, ParameterMode.IN)
                .setParameter("player1", savedGame4.getPlayer1())
                .registerStoredProcedureParameter("player2", int.class, ParameterMode.IN)
                .setParameter("player2", savedGame4.getPlayer2())
                .registerStoredProcedureParameter("player3", int.class, ParameterMode.IN)
                .setParameter("player3", savedGame4.getPlayer3())
                .registerStoredProcedureParameter("player4", int.class, ParameterMode.IN)
                .setParameter("player4", savedGame4.getPlayer4())
                .registerStoredProcedureParameter("cards1", String.class, ParameterMode.IN)
                .setParameter("cards1", savedGame4.getCardPlayer1())
                .registerStoredProcedureParameter("cards2", String.class, ParameterMode.IN)
                .setParameter("cards2", savedGame4.getCardPlayer2())
                .registerStoredProcedureParameter("cards3", String.class, ParameterMode.IN)
                .setParameter("cards3", savedGame4.getCardPlayer3())
                .registerStoredProcedureParameter("cards4", String.class, ParameterMode.IN)
                .setParameter("cards4", savedGame4.getCardPlayer4())
                .registerStoredProcedureParameter("cardsResidual", String.class, ParameterMode.IN)
                .setParameter("cardsResidual", savedGame4.getCardResidual())
                .registerStoredProcedureParameter("trump", String.class, ParameterMode.IN)
                .setParameter("trump", savedGame4.getTrump());
        proc.execute();
    }
}
