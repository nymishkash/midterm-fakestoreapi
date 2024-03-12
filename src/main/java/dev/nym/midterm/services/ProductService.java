package dev.nym.midterm.services;


import dev.nym.midterm.dtos.FakeStoreProductDto;
import dev.nym.midterm.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    FakeStoreProductDto getSingleProduct(long id);
    Product createProduct(Product product);



}
