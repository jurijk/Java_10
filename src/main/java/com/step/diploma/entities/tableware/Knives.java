package com.step.diploma.entities.tableware;

import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("kn")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Knives extends Tableware{

    @Column
    private String material;

    @Column
    private Integer numberIt;

    @Column
    private Integer cost;

    @Column
    private Integer length;

    @Override
    public String toString() {
        return "Spoons{" +
                "material='" + material + '\'' +
                ", numberIt=" + numberIt +
                ", cost=" + cost +
                ", length=" + length +
                '}';
    }
}
