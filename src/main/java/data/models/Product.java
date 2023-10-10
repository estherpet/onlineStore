package data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table (name="products")

public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String  name;
    private  String productDescription;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private User user;
    private  long numberOfAvaliableProduct;


}
