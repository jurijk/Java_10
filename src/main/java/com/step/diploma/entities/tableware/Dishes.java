package com.step.diploma.entities.tableware;

import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("ds")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Dishes extends Tableware{

    @Column
    private String material;

    @Column
    private Integer numberIt;

    @Column
    private Integer cost;

    @Column
    private Integer diameter;

    @Override
    public String toString() {
        return "Spoons{" +
                "material='" + material + '\'' +
                ", numberIt=" + numberIt +
                ", cost=" + cost +
                ", length=" + diameter +
                '}';
    }
}
