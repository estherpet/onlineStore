package data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table (name="items")

public class Items {
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private  Product product;
    private long quantity;
    @Id
    private Long id;

}
