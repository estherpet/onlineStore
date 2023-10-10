package data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shoppingcart")

public class ShoppingCart {
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List <Items> items;
    @Id
    private Long id;

}
