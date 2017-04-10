package webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import webstore.models.Product;
import webstore.services.ProductServices;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @RequestMapping("/products")
    public String getListProducts(Model model){
        model.addAttribute("product", productServices.findAll());
        return "allProducts";
    }

    @RequestMapping(value = "/product" , method = RequestMethod.GET)
    public String getProductsById(@RequestParam Long id, Model model){
        model.addAttribute("product", productServices.getProductByProductId(id));
        return "productDetails";
    }
    @RequestMapping("/{category}")
    public String getProductsByCategory(@PathVariable("category")String productCategory, Model model){
        List<Product> products = productServices.getProductsByCategory(productCategory);
        model.addAttribute("product",products);
        return "productByCategory";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String save(Model model, Product product){
        model.addAttribute("product", new Product());
        return "createProduct";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String doSave(Product product){
        Product productToAdd = productServices.create(product);
        return "redirect:/";
    }

    @RequestMapping("/registration")
    public String registration(){
        return "registration";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
