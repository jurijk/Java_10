package com.step.diploma.entities;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String country;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private Integer home;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "address")
    private List<User> users;


}
