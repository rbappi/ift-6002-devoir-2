package ca.ulaval.glo4002.mockexercise;

import ca.ulaval.glo4002.mockexercise.do_not_edit.CartFactory;
import ca.ulaval.glo4002.mockexercise.exceptions.ProductNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductFinderTest {
    private Product product1;
    private Product product2;
    private Product product3;
    private ProductFinder productFinder;

    @BeforeEach
    public  void setup()
    {
        product1 = new Product("6549", "Reblochon", 12.34);
        product2 = new Product("457", "Pomme de terre", 1.41);
        product3 = new Product("1247", "Lardon", 4.56);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        productFinder = new ProductFinder(products);
    }

    @Test
    public void givenAnExistingProduct_whenSearched_thenIsFound()
    {
        Product p = productFinder.findBySku(product2.getSku());
        assertEquals(p, product2);
    }

    @Test
    public void givenAnUnknownProduct_whenSearched_thenIsNotFound()
    {
        assertThrows(ProductNotFoundException.class, () -> {productFinder.findBySku("545128");});
    }
}