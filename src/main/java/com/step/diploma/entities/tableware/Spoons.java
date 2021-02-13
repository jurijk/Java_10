package com.step.diploma.entities.tableware;

import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("sp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Spoons extends Tableware{

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
