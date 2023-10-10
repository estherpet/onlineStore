package data.models;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String name;
    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = false,unique = true)
    private  String Email;
    @Column(nullable = false)
    private  String userName;
    @Column(nullable = false)
    private  String password;
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Address> address;
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private  List<CreditCardInformation>cardInformation;

}
