package com.xworkz.supermarket;

import com.xworkz.supermarket.SuperMarket;
import com.xworkz.supermarket.supermarketapp.section.Section;
import com.xworkz.supermarket.supermarketapp.product.Product;


public class SuperMarketRunner {



        public static void main(String[] args) {
            String location = "Bangalore";

            // SuperMarket
            SuperMarket market = new SuperMarket();
            market.supermarketId = 1;
            market.supermarketName = "Xworkz SuperMarket";
            market.location = location;

            // Sections
            Section sections[] = new Section[2];

            // Section 1
            Section section1 = new Section();
            section1.sectionId = 1;
            section1.sectionName = "Grocery";
            Product products1[] = new Product[2];

            Product product1 = new Product();
            product1.productId = 101;
            product1.productName = "Bread";
            product1.price = 30.0;
            String ingredients1[] = {"Wheat Flour", "Yeast", "Salt"};
            product1.ingredients = ingredients1;

            Product product2 = new Product();
            product2.productId = 102;
            product2.productName = "Noodles";
            product2.price = 120.0;
            String ingredients2[] = {"Flor", "Water", "Salt"};
            product2.ingredients = ingredients2;

            products1[0] = product1;
            products1[1] = product2;
            section1.products = products1;

            // Section 2
            Section section2 = new Section();
            section2.sectionId = 2;
            section2.sectionName = "Dairy";
            Product products2[] = new Product[2];

            Product product3 = new Product();
            product3.productId = 201;
            product3.productName = "Yogurt";
            product3.price = 50.0;
            String ingredients3[] = {"Milk", "Bacterial Cultures", "Cream"};
            product3.ingredients = ingredients3;

            Product product4 = new Product();
            product4.productId = 202;
            product4.productName = "Butter";
            product4.price = 80.0;
            String ingredients4[] = {"Cream", "Salt", "Cultures"};
            product4.ingredients = ingredients4;

            products2[0] = product3;
            products2[1] = product4;
            section2.products = products2;

            sections[0] = section1;
            sections[1] = section2;

            market.sections = sections;


            market.displaySuperMarketInfo();
        }
    }


