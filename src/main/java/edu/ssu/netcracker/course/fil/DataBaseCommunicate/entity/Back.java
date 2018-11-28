package edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by --- on 25.11.2018.
 */
@NoArgsConstructor
@Entity
@Table(name = "BACK")
public class Back{

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BACK")
    private long ID_back;

    @Getter
    @Setter
    @Column(name = "NAME_BACK", length = 50)
    private String name_back;

    @Getter
    @Setter
    @Column(name = "COST_BACK")
    private int cost_back;

    @Getter
    @Setter
    @Column(name = "PATCH_BACK", length = 50)
    private String patch_back;


    public Back(String name_back, int cost_back, String patch_back) {
        this.name_back = name_back;
        this.cost_back = cost_back;
        this.patch_back = patch_back;
    }

    @Override
    public String toString() {
        return "Back{" +
                "ID_back=" + ID_back +
                ", name_back='" + name_back + '\'' +
                ", cost_back=" + cost_back +
                ", patch_back='" + patch_back + '\'' +
                '}';
    }
}
