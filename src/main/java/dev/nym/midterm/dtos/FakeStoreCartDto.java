package dev.nym.midterm.dtos;

import dev.nym.midterm.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FakeStoreCartDto {

    private long id;
    private long userId;
    private String date;
    List<Product> list;

}
