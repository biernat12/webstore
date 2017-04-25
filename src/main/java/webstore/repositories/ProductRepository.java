package webstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import webstore.models.Product;

import java.util.List;

@Transactional
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findProductsByProductId(Long productId);

    List<Product> findProductsByCategory(String category);

    @Override
    List<Product> findAll();

}
