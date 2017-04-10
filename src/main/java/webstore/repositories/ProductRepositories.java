package webstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webstore.models.Product;

import java.util.List;

@Repository
public interface ProductRepositories extends JpaRepository<Product, Long> {
    List<Product> findAll();
    Product getProductByProductId(Long id);
    List<Product> getProductsByCategory(String category);
}
