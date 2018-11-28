package edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by --- on 25.11.2018.
 */
@NoArgsConstructor
@Entity
@Table(name = "LAST_RESULTS_PLAYER")
public class LastResult {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RESULT")
    private long ID_result;

    @Getter
    @Setter
    @Column(name = "PLAYER_RESULT")
    private long player;

    @Getter
    @Setter
    @Column(name = "OPPONENT_RESULT")
    private long opponent;

    @Getter
    @Setter
    @Column(name = "RESULT_RESULT")
    private int result;

    public LastResult(long player, long opponent, int result) {
        this.player = player;
        this.opponent = opponent;
        this.result = result;
    }

    @Override
    public String toString() {
        return "LastResult{" +
                "ID_result=" + ID_result +
                ", player=" + player +
                ", opponent=" + opponent +
                ", result=" + result +
                '}';
    }
}
