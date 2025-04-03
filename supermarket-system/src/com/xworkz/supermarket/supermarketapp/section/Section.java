package com.xworkz.supermarket.supermarketapp.section;

import com.xworkz.supermarket.supermarketapp.product.Product;

public class Section {



    public int sectionId;
    public String sectionName;
    public Product products[];

    public void displaySectionInfo() {
        System.out.println("Section ID: " + sectionId);
        System.out.println("Section Name: " + sectionName);
        for (Product product : products) {
            product.displayProductInfo();
        }
    }
}