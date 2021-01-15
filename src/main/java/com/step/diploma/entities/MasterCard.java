package com.step.diploma.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("2")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MasterCard extends BillingDetails{

    @Column
    private Long cardNumber;

    @Column
    private Integer expMonth;

    @Column
    private Integer expYear;

    @Override
    public String toString() {
        return "MasterCard{" +
                "cardNumber=" + cardNumber +
                ", expMonth=" + expMonth +
                ", expYear=" + expYear +
                '}';
    }
}
