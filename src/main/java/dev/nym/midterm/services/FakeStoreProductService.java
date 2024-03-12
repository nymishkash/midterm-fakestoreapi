package dev.nym.midterm.services;

import dev.nym.midterm.dtos.FakeStoreProductDto;
import dev.nym.midterm.models.Product;
import dev.nym.midterm.dtos.FakeStoreProductDto;
import dev.nym.midterm.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate = new RestTemplate();


    @Override
    public List<Product> getAllProducts() {

        return null;
    }

    @Override
    public FakeStoreProductDto getSingleProduct(long id) {

        return restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class
        );
    }

    @Override
    public Product createProduct(Product product) {

        return null;
    }
}
