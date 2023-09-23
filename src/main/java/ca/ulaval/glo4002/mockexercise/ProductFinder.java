package ca.ulaval.glo4002.mockexercise;

import ca.ulaval.glo4002.mockexercise.do_not_edit.ProductRepository;
import ca.ulaval.glo4002.mockexercise.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ProductFinder implements ProductRepository
{
    private List<Product> products = new ArrayList<>();

    public ProductFinder(List<Product> products)
    {
        this.products = products;
    }

    public Product findBySku(String sku)
    {
        for (Product p : products)
        {
            if(p.getSku().equals(sku))
                return p;
        }
        throw new ProductNotFoundException(sku);
    }
}
