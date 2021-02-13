package com.step.diploma.entities.tableware;

import com.step.diploma.entities.User;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "tableware")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tw_type", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Tableware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn (name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "Tableware{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
