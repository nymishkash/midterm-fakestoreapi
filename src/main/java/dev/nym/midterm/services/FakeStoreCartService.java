package dev.nym.midterm.services;

import dev.nym.midterm.dtos.FSCartDto;
import dev.nym.midterm.dtos.FakeStoreCartDto;
import dev.nym.midterm.models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class FakeStoreCartService implements CartService{

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public ArrayList<Cart> getAllCarts() {

        return Objects.requireNonNull(restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                FSCartDto.class

        )).getList();
    }

    @Override
    public FakeStoreCartDto getSingleCart(long id) {

        return restTemplate.getForObject(
                "https://fakestoreapi.com/carts/" + id,
                FakeStoreCartDto.class

        );



    }

    @Override
    public Cart createCart(Cart cart) {

        return null;
    }
}
