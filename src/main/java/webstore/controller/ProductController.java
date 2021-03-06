package webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import webstore.models.Product;
import webstore.services.ProductService;

import java.util.List;


@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String getListProducts(Model model){
        model.addAttribute("product", productService.findProducts());
        return "allProduct";
    }

    @RequestMapping(value = "/product" , method = RequestMethod.GET)
    public String getProductsById(@RequestParam Long id, Model model){
        model.addAttribute("product", productService.findProductsByProductId(id));
        return "productDetails";
    }
    @RequestMapping("/{category}")
    public String getProductsByCategory(@PathVariable("category")String productCategory, Model model){
        List<Product> products = productService.findProductsByCategory(productCategory);
        model.addAttribute("product",products);
        return "productByCategory";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String save(Model model, Product product){
        model.addAttribute("product", new Product());
        return "addProduct";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String doSave(Product product){
        productService.addProduct(product);
        return "redirect:/";
    }
}
