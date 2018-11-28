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
@Table(name = "RESULTS_FRIEND")
public class ResultsFriends {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RESULTS_FRIEND")
    private long ID_result;

    @Getter
    @Setter
    @Column(name = "FRIEND_RESULTS_FRIEND")
    private long friends;

    @Getter
    @Setter
    @Column(name = "RESULT_RESULTS_FRIEND")
    private int result;


    public ResultsFriends(long friends, int result) {
        this.friends = friends;
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultsFriends{" +
                "ID_result=" + ID_result +
                ", friends=" + friends +
                ", result=" + result +
                '}';
    }
}