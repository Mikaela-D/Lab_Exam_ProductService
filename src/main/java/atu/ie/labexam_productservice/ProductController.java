package atu.ie.labexam_productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    @Autowired
    public void ProductService(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/addProduct")
    public ResponseEntity <String> addProduct(@RequestBody Product product) {
        productService.add(product);
        return ResponseEntity("Product added to the warehouse");
    }
}
