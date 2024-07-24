package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue//bir bir artacağı söyleniyor
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

    public Product(int id, int categoryId, String productName, double unitPrice, short unitsItyPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsItyPerUnit = unitsItyPerUnit;
        this.quantityPerUnit = quantityPerUnit;
    }


    public Product() {


    }
}
