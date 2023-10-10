package data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CreditCardInformation")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CreditCardInformation {
    @Column(nullable = false)
    private String cardNumber;
    @Column(nullable = false)
    private Short cvv;
    @Column(nullable = false)
    private String expiryDate;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    @Column(nullable = false)
    private String nameOnCard;
    private String pin;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
