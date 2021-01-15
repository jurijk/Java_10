package com.step.diploma.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "billingdetails")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "bd_type", discriminatorType = DiscriminatorType.INTEGER)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BillingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn (name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "BillingDetails{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }

    //    @OneToOne (mappedBy = "billingDetails")
//    private User user;


}
