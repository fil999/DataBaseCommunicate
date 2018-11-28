package edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by --- on 25.11.2018.
 */
@NoArgsConstructor
@Entity
@Table(name = "SAVED_GAME_2_PLAYER")
public class SavedGame2{

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SAVED_2")
    private long ID_saved;

    @Getter
    @Setter
    @Column(name = "PLAYER_1_SAVED_2")
    private long player1;

    @Getter
    @Setter
    //@ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "ID_PLAYER")
    @Column(name = "PLAYER_2_SAVED_2")
    private long player2;


    @Getter
    @Setter
    @Column(name = "CARDS_PLAYER_1_SAVED_2")
    private String cardPlayer1;

    @Getter
    @Setter
    @Column(name = "CARDS_PLAYER_2_SAVED_2")
    private String cardPlayer2;

    @Getter
    @Setter
    @Column(name = "CARDS_RESIDUAL_SAVED_2")
    private String cardResidual;

    @Getter
    @Setter
    @Column(name = "TRUMP_CARD_SAVED_2")
    private String trump;


    public SavedGame2(long player1, long player2, String cardPlayer1, String cardPlayer2, String cardResidual, String trump) {
        this.player1 = player1;
        this.player2 = player2;
        this.cardPlayer1 = cardPlayer1;
        this.cardPlayer2 = cardPlayer2;
        this.cardResidual = cardResidual;
        this.trump = trump;
    }


}
