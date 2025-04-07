package com.xworkz.shirtapp;

import com.xworkz.shirtapp.shirt.Shirt;

public class ShirtRunner {

    public static void main(String[] args) {

        // 1
        Shirt ref1 = new Shirt();
        ref1.setShirtId(1);
        ref1.setShirtBrand("Peter England");
        ref1.setShirtMaterial("Cotton");
        ref1.setShirtSize("L");
        ref1.setShirtColor("White");
        ref1.setShirtSleeveLength("Full Sleeve");
        ref1.setShirtPrice(1499.99);

        int shirtId1 = ref1.getShirtId();
        String shirtBrand1 = ref1.getShirtBrand();
        String shirtMaterial1 = ref1.getShirtMaterial();
        String shirtSize1 = ref1.getShirtSize();
        String shirtColor1 = ref1.getShirtColor();
        String shirtSleeveLength1 = ref1.getShirtSleeveLength();
        double shirtPrice1 = ref1.getShirtPrice();

        System.out.println("Shirt ID: " + shirtId1);
        System.out.println("Shirt Brand: " + shirtBrand1);
        System.out.println("Shirt Material: " + shirtMaterial1);
        System.out.println("Shirt Size: " + shirtSize1);
        System.out.println("Shirt Color: " + shirtColor1);
        System.out.println("Shirt Sleeve Length: " + shirtSleeveLength1);
        System.out.println("Shirt Price: " + shirtPrice1);
        System.out.println("\n");

        // 2
        Shirt ref2 = new Shirt();
        ref2.setShirtId(2);
        ref2.setShirtBrand("Van Heusen");
        ref2.setShirtMaterial("Linen");
        ref2.setShirtSize("M");
        ref2.setShirtColor("Blue");
        ref2.setShirtSleeveLength("Half Sleeve");
        ref2.setShirtPrice(1999.49);

        int shirtId2 = ref2.getShirtId();
        String shirtBrand2 = ref2.getShirtBrand();
        String shirtMaterial2 = ref2.getShirtMaterial();
        String shirtSize2 = ref2.getShirtSize();
        String shirtColor2 = ref2.getShirtColor();
        String shirtSleeveLength2 = ref2.getShirtSleeveLength();
        double shirtPrice2 = ref2.getShirtPrice();

        System.out.println("Shirt ID: " + shirtId2);
        System.out.println("Shirt Brand: " + shirtBrand2);
        System.out.println("Shirt Material: " + shirtMaterial2);
        System.out.println("Shirt Size: " + shirtSize2);
        System.out.println("Shirt Color: " + shirtColor2);
        System.out.println("Shirt Sleeve Length: " + shirtSleeveLength2);
        System.out.println("Shirt Price: " + shirtPrice2);
        System.out.println("\n");

        // 3
        Shirt ref3 = new Shirt();
        ref3.setShirtId(3);
        ref3.setShirtBrand("Louis Philippe");
        ref3.setShirtMaterial("Cotton Blend");
        ref3.setShirtSize("XL");
        ref3.setShirtColor("Black");
        ref3.setShirtSleeveLength("Full Sleeve");
        ref3.setShirtPrice(2499.75);

        int shirtId3 = ref3.getShirtId();
        String shirtBrand3 = ref3.getShirtBrand();
        String shirtMaterial3 = ref3.getShirtMaterial();
        String shirtSize3 = ref3.getShirtSize();
        String shirtColor3 = ref3.getShirtColor();
        String shirtSleeveLength3 = ref3.getShirtSleeveLength();
        double shirtPrice3 = ref3.getShirtPrice();

        System.out.println("Shirt ID: " + shirtId3);
        System.out.println("Shirt Brand: " + shirtBrand3);
        System.out.println("Shirt Material: " + shirtMaterial3);
        System.out.println("Shirt Size: " + shirtSize3);
        System.out.println("Shirt Color: " + shirtColor3);
        System.out.println("Shirt Sleeve Length: " + shirtSleeveLength3);
        System.out.println("Shirt Price: " + shirtPrice3);
        System.out.println("\n");

        // 4
        Shirt ref4 = new Shirt();
        ref4.setShirtId(4);
        ref4.setShirtBrand("Allen Solly");
        ref4.setShirtMaterial("Polyester");
        ref4.setShirtSize("S");
        ref4.setShirtColor("Grey");
        ref4.setShirtSleeveLength("Half Sleeve");
        ref4.setShirtPrice(1599.00);

        int shirtId4 = ref4.getShirtId();
        String shirtBrand4 = ref4.getShirtBrand();
        String shirtMaterial4 = ref4.getShirtMaterial();
        String shirtSize4 = ref4.getShirtSize();
        String shirtColor4 = ref4.getShirtColor();
        String shirtSleeveLength4 = ref4.getShirtSleeveLength();
        double shirtPrice4 = ref4.getShirtPrice();

        System.out.println("Shirt ID: " + shirtId4);
        System.out.println("Shirt Brand: " + shirtBrand4);
        System.out.println("Shirt Material: " + shirtMaterial4);
        System.out.println("Shirt Size: " + shirtSize4);
        System.out.println("Shirt Color: " + shirtColor4);
        System.out.println("Shirt Sleeve Length: " + shirtSleeveLength4);
        System.out.println("Shirt Price: " + shirtPrice4);
        System.out.println("\n");

        // 5
        Shirt ref5 = new Shirt();
        ref5.setShirtId(5);
        ref5.setShirtBrand("Raymond");
        ref5.setShirtMaterial("Silk");
        ref5.setShirtSize("M");
        ref5.setShirtColor("Maroon");
        ref5.setShirtSleeveLength("Full Sleeve");
        ref5.setShirtPrice(2999.50);

        int shirtId5 = ref5.getShirtId();
        String shirtBrand5 = ref5.getShirtBrand();
        String shirtMaterial5 = ref5.getShirtMaterial();
        String shirtSize5 = ref5.getShirtSize();
        String shirtColor5 = ref5.getShirtColor();
        String shirtSleeveLength5 = ref5.getShirtSleeveLength();
        double shirtPrice5 = ref5.getShirtPrice();

        System.out.println("Shirt ID: " + shirtId5);
        System.out.println("Shirt Brand: " + shirtBrand5);
        System.out.println("Shirt Material: " + shirtMaterial5);
        System.out.println("Shirt Size: " + shirtSize5);
        System.out.println("Shirt Color: " + shirtColor5);
        System.out.println("Shirt Sleeve Length: " + shirtSleeveLength5);
        System.out.println("Shirt Price: " + shirtPrice5);
        System.out.println("\n");
    }
}
