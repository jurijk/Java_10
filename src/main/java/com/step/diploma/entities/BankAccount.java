package com.step.diploma.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("3")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BankAccount extends BillingDetails{

    @Column
    private String bankName;

    @Column
    private Long account;

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", account=" + account +
                '}';
    }
}
