package edu.ssu.netcracker.course.fil.DataBaseCommunicate.service;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.*;
import edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by --- on 29.11.2018.
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

	//TODO: зарефачить и раскидать логику по методам
    public Player selectByEmailAndPassword(Player player){
        if ((player.getEmail() != null) && (player.getPassword() != null)) {
            player = playerRepository.findPlayerByEmailAndPassword(player.getEmail(), player.getPassword());
            for(LastResult lastResult : player.getLastResults()){
                Player opponent = lastResult.getOpponent();
                lastResult.setOpponent(new Player(opponent.getId(), opponent.getEmail(), opponent.getName()));
            }
            for (SavedGame2 game: player.getSavedGame2()){
                Player gamePlayer = game.getPlayer2();
                game.setPlayer2(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
            }
            for (SavedGame3 game: player.getSavedGame3()){
                Player gamePlayer = game.getPlayer2();
                game.setPlayer2(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
                gamePlayer = game.getPlayer3();
                game.setPlayer3(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
            }
            for (SavedGame4 game: player.getSavedGame4()){
                Player gamePlayer = game.getPlayer2();
                game.setPlayer2(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
                gamePlayer = game.getPlayer3();
                game.setPlayer3(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
                gamePlayer = game.getPlayer4();
                game.setPlayer4(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
            }
            for (Friend friend: player.getFriends()){
                Player gamePlayer = friend.getPlayer2();
                friend.setPlayer2(new Player(gamePlayer.getId(), gamePlayer.getEmail(), gamePlayer.getName()));
                friend.getResultsFriends();
            }
            return player;
        }
        else {
            return null;
        }
    }



    public int updatePlayer(Player player){
        if ((player.getEmail() != null) && (player.getPassword() != null) && (player.getName() != null)) {
            player.setPassword(String.valueOf(player.getPassword().hashCode()));
            player = playerRepository.save(player);
            if (player != null){
                return 0;
            }
        }
        return -1;
    }

}
