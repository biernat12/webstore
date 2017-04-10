package webstore.services;

import webstore.models.Product;

import java.util.List;

public interface ProductServices {
    List<Product> findAll();
    Product getProductByProductId(Long id);
    List<Product> getProductsByCategory(String category);
    Product create(Product product);
}
