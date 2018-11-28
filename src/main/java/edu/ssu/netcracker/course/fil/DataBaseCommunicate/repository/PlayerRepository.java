package edu.ssu.netcracker.course.fil.DataBaseCommunicate.repository;

import edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by --- on 26.11.2018.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findPlayerByEmail_playerAndPassword_playerAnd(String email, String player);

}
