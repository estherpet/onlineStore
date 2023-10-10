package data.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String city;
    @Column(nullable = false)
    private  String homeAddress;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String posterCode;
}
