package ca.ulaval.glo4002.mockexercise;

import ca.ulaval.glo4002.mockexercise.do_not_edit.CartFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StartByTestingThisTest {

    private StartByTestingThis service;
    private CartFactory mockCartFactory;
    private ProductFinder mockProductFinder;

    @BeforeEach
    public void setUp() {
        mockCartFactory = mock(CartFactory.class);
        mockProductFinder = mock(ProductFinder.class);
        service = new StartByTestingThis(mockCartFactory, mockProductFinder);
    }

    @Test
    public void whenOneClick_shouldCreateCart() {
        service.oneClickBuy("", "");

        verify(mockCartFactory).create(anyString());
    }
    
    @Test
    public void whenOneClick_shouldCallProductFind() {
        service.oneClickBuy("", "ABC");

        verify(mockProductFinder).findBySku("ABC");
    }
}
