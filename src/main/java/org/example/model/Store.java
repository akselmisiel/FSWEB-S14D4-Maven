package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] productList = {
                new Coke("Coke", 1.5, "Coca Cola", true),
                new Bread("Bread", 2.5, "Whole Wheat", 0.5),
                new Chocolate("Chocolate", 3.5, "Dark Chocolate", "Dark")
        };
        listProducts(productList);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}