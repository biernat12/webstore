package webstore.services;

import webstore.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findProducts();
    List<Product> findProductsByCategory(String category);
    Product findProductsByProductId(Long productId);
    void addProduct(Product product);
}
