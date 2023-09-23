package ca.ulaval.glo4002.mockexercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;
    private Product product1;

    @BeforeEach
    public  void setup()
    {
        cart = new Cart("email@test");
        product1 = new Product("6549", "Reblochon", 12.34);
    }

    @Test
    public void givenAProduct_whenAddedToCart_thenShouldBeAccessible()
    {
        cart.addProduct(product1);
        assertTrue(cart.contains(product1));
    }

}