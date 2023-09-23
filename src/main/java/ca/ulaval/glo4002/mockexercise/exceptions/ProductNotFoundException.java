package ca.ulaval.glo4002.mockexercise.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String sku) {
        super("Aucun produit ne correspond au sku: " + sku);
    }
}