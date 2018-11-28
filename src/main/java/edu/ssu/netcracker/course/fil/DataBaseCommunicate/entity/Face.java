package edu.ssu.netcracker.course.fil.DataBaseCommunicate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by --- on 25.11.2018.
 */
@NoArgsConstructor
@Entity
@Table(name = "FACE")
public class Face {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FACE")
    private long ID_face;

    @Getter
    @Setter
    @Column(name = "NAME_FACE", length = 50)
    private String name_face;

    @Getter
    @Setter
    @Column(name = "COST_FACE")
    private int cost_face;

    @Getter
    @Setter
    @Column(name = "PATCH_FACE", length = 50)
    private String patch_face;


    public Face(String name_face, int cost_face, String patch_face) {
        this.name_face = name_face;
        this.cost_face = cost_face;
        this.patch_face = patch_face;
    }

    @Override
    public String toString() {
        return "Face{" +
                "ID_face=" + ID_face +
                ", name_face='" + name_face + '\'' +
                ", cost_face=" + cost_face +
                ", patch_face='" + patch_face + '\'' +
                '}';
    }
}
