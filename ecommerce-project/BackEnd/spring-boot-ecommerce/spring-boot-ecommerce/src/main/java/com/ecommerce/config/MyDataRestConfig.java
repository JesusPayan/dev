package com.ecommerce.config;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        /*DESABILITA LOS METODOS PUT, POST, Y DELETE */
        HttpMethod [] unSoportedMethods = {HttpMethod.PUT,HttpMethod.DELETE,HttpMethod.POST};
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unSoportedMethods)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unSoportedMethods)));
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unSoportedMethods)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unSoportedMethods)));
    }
}
