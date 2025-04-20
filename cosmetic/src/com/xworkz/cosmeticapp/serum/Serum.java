package com.xworkz.cosmeticapp.serum;

import com.xworkz.cosmeticapp.cosmetic.Cosmetic;

public class Serum extends Cosmetic {

    @Override
    public void ingredients() {
        System.out.println("Serums use concentrated active ingredients like hyaluronic acid, vitamin C, and retinol for targeted skincare.");
    }

    @Override
    public void function() {
        System.out.println("Serums deliver intensive skincare benefits like hydration, brightening, and anti-aging.");
    }

    @Override
    public void packaging() {
        System.out.println("Serums are often packaged in small bottles with droppers for precise application.");
    }

    @Override
    public void application() {
        System.out.println("Serums are applied in small amounts after cleansing and before moisturizing.");
    }

    @Override
    public void shelfLife() {
        System.out.println("Shelf life of serums is generally shorter due to their high concentration of active ingredients.");
    }
}
