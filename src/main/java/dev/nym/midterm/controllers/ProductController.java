package dev.nym.midterm.controllers;

import dev.nym.midterm.dtos.FakeStoreProductDto;
import dev.nym.midterm.models.Product;
import dev.nym.midterm.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    @GetMapping("/products/{id}")
    public FakeStoreProductDto getSingleProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return null;
    }
}

