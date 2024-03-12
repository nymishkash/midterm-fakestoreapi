package dev.nym.midterm.controllers;

import dev.nym.midterm.dtos.FakeStoreCartDto;
import dev.nym.midterm.models.Cart;
import dev.nym.midterm.services.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }


    @GetMapping("/carts")
    public ArrayList<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }



    @GetMapping("/carts/{id}")
    public FakeStoreCartDto getSingleCart(@PathVariable Long id) {
        return cartService.getSingleCart(id);
    }

}
