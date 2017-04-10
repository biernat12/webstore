package webstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstore.models.Product;
import webstore.repositories.ProductRepositories;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {

    @Autowired
    private ProductRepositories productRepositories;


    @Override
    public List<Product> findAll() {
        return this.productRepositories.findAll();
    }

    @Override
    public Product getProductByProductId(Long id) {
        return this.productRepositories.findOne(id);
    }


    @Override
    public List<Product> getProductsByCategory(String category) {
        return this.productRepositories.getProductsByCategory(category);
    }

    @Override
    public Product create(Product product) {
        return this.productRepositories.save(product);
    }
}
