package com.xworkz.supermarket.supermarketapp.product;

public class Product {


    public int productId;
    public String productName;
    public String ingredients[];
    public double price;

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println(" - " + ingredient);
        }
        System.out.println("Price: " + price);
    }
}
