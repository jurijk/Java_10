package com.step.diploma.entities;
import lombok.*;
import javax.persistence.*;

@Entity
@DiscriminatorValue("1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VisaCard extends BillingDetails{

    @Column
    private Long cardNumber;

    @Column
    private Integer expMonth;

    @Column
    private Integer expYear;

    @Override
    public String toString() {
        return "VisaCard{" +
                "cardNumber=" + cardNumber +
                ", expMonth=" + expMonth +
                ", expYear=" + expYear +
                '}';
    }
}
