package ca.ulaval.glo4002.mockexercise;

import ca.ulaval.glo4002.mockexercise.do_not_edit.CartFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartFactoryTest {
    @Test
    public void testCartCreation() {// givenACart_
        CartFactory cartFactory = new CartFactory();
        Cart cart = cartFactory.create("anRandEmail@randCompagnie.com");
        assertEquals("anRandEmail@randCompagnie.com", cart.getEmail());
    }


}