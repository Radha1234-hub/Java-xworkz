package com.xworkz.cosmeticapp;

import com.xworkz.cosmeticapp.cosmetic.Cosmetic;
import com.xworkz.cosmeticapp.serum.Serum;

public class CosmeticRunner {

    public static void main(String[] args) {

        Cosmetic ref = new Cosmetic();

        ref.ingredients();
        ref.function();
        ref.packaging();
        ref.application();
        ref.shelfLife();

        Cosmetic ref1 = new Serum();

        ref1.ingredients();
        ref1.function();
        ref1.packaging();
        ref1.application();
        ref1.shelfLife();

        Serum ref2 = new Serum();

        ref2.ingredients();
        ref2.function();
        ref2.packaging();
        ref2.application();
        ref2.shelfLife();
    }
}
