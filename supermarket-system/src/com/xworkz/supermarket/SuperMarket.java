package com.xworkz.supermarket;
import com.xworkz.supermarket.supermarketapp.section.Section;

public class SuperMarket {


        public int supermarketId;
        public String supermarketName;
        public String location;
        public Section sections[];

        public void displaySuperMarketInfo() {
            System.out.println("SuperMarket ID: " + supermarketId);
            System.out.println("SuperMarket Name: " + supermarketName);
            System.out.println("Location: " + location);
            for (Section section : sections) {
                section.displaySectionInfo();
            }
        }
    }


