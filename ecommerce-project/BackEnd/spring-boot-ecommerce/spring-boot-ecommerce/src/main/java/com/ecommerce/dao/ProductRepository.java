package com.ecommerce.dao;

import com.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product",path = "products")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
