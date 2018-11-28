package edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by --- on 25.11.2018.
 */
@NoArgsConstructor
@Entity
@Table(name = "FRIEND")
public class Friend {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FRIEND")
    private long ID_friend;

    @Getter
    @Setter
    @Column(name = "PLAYER1_FRIEND")
    private long player1;

    @Getter
    @Setter
    @Column(name = "PLAYER2_FRIEND")
    private long player2;

    @Getter
    @Setter
    @Column(name = "WINS_PLAYER1_FRIEND")
    private int wins_player1;

    @Getter
    @Setter
    @Column(name = "WINS_PLAYER2_FREIND")
    private int wins_player2;

    @Getter
    @Setter
    @Column(name = "TIE_FRINED")
    private int tie;

    @Getter
    @Setter
    @OneToMany
    @JoinColumn(name = "FRIEND_RESULTS_FRIEND")
    private Collection<ResultsFriends> resultsFriends;


    public Friend(long player1, long player2, int wins_player1, int wins_player2, int tie, Collection<ResultsFriends> resultsFriends) {
        this.player1 = player1;
        this.player2 = player2;
        this.wins_player1 = wins_player1;
        this.wins_player2 = wins_player2;
        this.tie = tie;
        this.resultsFriends = resultsFriends;
    }

    public Friend(long player1, long player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.wins_player1 = 0;
        this.wins_player2 = 0;
        this.tie = 0;
        this.resultsFriends = null;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "ID_friend=" + ID_friend +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ", wins_player1=" + wins_player1 +
                ", wins_player2=" + wins_player2 +
                ", tie=" + tie +
                ", resultsFriends=" + resultsFriends +
                '}';
    }
}
