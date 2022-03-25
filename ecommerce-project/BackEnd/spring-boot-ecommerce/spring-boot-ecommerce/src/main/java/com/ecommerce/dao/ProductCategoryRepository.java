package com.ecommerce.dao;

import com.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
/*productCategory: es el nombre de la entrada del json
product-category: product-category
*/
public interface ProductCategoryRepository extends JpaRepository <ProductCategory,Long> {
}
