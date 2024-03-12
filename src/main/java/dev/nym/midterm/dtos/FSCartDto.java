package dev.nym.midterm.dtos;

import dev.nym.midterm.models.Cart;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class FSCartDto {
    ArrayList<Cart> list;
}
