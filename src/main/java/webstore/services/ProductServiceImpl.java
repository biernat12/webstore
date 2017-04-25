package webstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstore.models.Product;
import webstore.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepositories;


    @Override
    public List<Product> findProducts() {
        return productRepositories.findAll();
    }

    @Override
    public Product findProductsByProductId(Long id) {
        return productRepositories.findOne(id);
    }


    @Override
    public List<Product> findProductsByCategory(String category) {
        return productRepositories.findProductsByCategory(category);
    }

    @Override
    public void addProduct(Product product) {
        productRepositories.save(product);
    }


}
