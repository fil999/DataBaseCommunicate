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
@Table(name = "GAMING_TABLE")
public class GamingTable {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TABLE")
    private long id_table;

    @Getter
    @Setter
    @Column(name = "NAME_TABLE", length = 50)
    private String name_table;

    @Getter
    @Setter
    @Column(name = "COST_TABLE")
    private int cost_table;

    @Getter
    @Setter
    @Column(name = "PATCH_TABLE", length = 50)
    private String patch_table;


    public GamingTable(String name_table, int cost_table, String patch_table) {
        this.name_table = name_table;
        this.cost_table = cost_table;
        this.patch_table = patch_table;
    }

    @Override
    public String toString() {
        return "GamingTable{" +
                "id_table=" + id_table +
                ", name_table='" + name_table + '\'' +
                ", cost_table=" + cost_table +
                ", patch_table='" + patch_table + '\'' +
                '}';
    }
}
