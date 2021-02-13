package com.step.diploma.entities.tableware;

import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("cp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Cups extends Tableware{

    @Column
    private String material;

    @Column
    private Integer numberIt;

    @Column
    private Integer cost;

    @Column
    private Integer volume;

    @Override
    public String toString() {
        return "Spoons{" +
                "material='" + material + '\'' +
                ", numberIt=" + numberIt +
                ", cost=" + cost +
                ", length=" + volume +
                '}';
    }
}
