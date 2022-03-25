package com.ecommerce.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
//@Data
@Getter
@Setter
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;
    /*EN MAPPEDBY SE PONE LA VARIABLE DE LA CLASE QUE SE ESTA REFERENCIANDO*/
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "productCategory")
    private Set<Product> products;
}
