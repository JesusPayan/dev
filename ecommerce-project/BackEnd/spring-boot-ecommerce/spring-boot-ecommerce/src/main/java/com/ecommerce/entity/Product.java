package com.ecommerce.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity /*INDICA A JAVA QUE ES UNA ENTIDAD JPA*/
@Table(name = "product")/*SI LA TABLA NO SE LLAMA IGUAL QUE LA CLASE ESTA ANOTACION INDICA A JAVA EL NOMBRE DEL TABLA*/
@Data/*ESTA ANOTACION INDICA A JAVA QUE SE USA LOMBOK PARA CREAR LOS GETTER Y SETTER DEL BEAN*/
public class Product {
    /*DECLARACION DE COLUMNAS DE LA TABLA PRODUCTO*/

    @Id /*ID DEL PRODUCTO*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String urlImage;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory productCategory;

}
