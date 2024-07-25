package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "products")
@AllArgsConstructor//parametreli constructor
@NoArgsConstructor//parametresiz constructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//bir bir artacağı söyleniyor
    @Column(name = "product_id")
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "units_in_stock")
    private short unitsItyPerUnit;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;


}
