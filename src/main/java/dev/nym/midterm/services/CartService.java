package dev.nym.midterm.services;

import dev.nym.midterm.dtos.FakeStoreCartDto;
import dev.nym.midterm.models.Cart;

import java.util.ArrayList;

public interface CartService {

    ArrayList<Cart> getAllCarts();

    FakeStoreCartDto getSingleCart(long id);

    Cart createCart(Cart cart);
}
