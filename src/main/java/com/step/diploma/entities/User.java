package com.step.diploma.entities;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn (name = "address_id")
    private Address address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<BillingDetails> billingDetails;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", billingDetails=" + billingDetails +
                '}';
    }

    //    @OneToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "user_id")
//    private BillingDetails billingDetails;


}
