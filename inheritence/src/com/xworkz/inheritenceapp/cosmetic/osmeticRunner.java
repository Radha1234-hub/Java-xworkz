package com.xworkz.inheritenceapp.cosmetic;

public class osmeticRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Cosmetic cosmetic = new Cosmetic();
        cosmetic.cosmeticDetails();
        cosmetic.cosmeticTypes();
        cosmetic.cosmeticPurpose();
        cosmetic.cosmeticIngredients();
        cosmetic.cosmeticUsage();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Cosmetic ref = new LipStick();
        ref.cosmeticDetails();
        ref.cosmeticTypes();
        ref.cosmeticPurpose();
        ref.cosmeticIngredients();
        ref.cosmeticUsage();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        LipStick lipstick = new LipStick();
        lipstick.cosmeticDetails();
        lipstick.lipstickDetails();
        lipstick.lipstickTypes();
        lipstick.lipstickIngredients();
        lipstick.lipstickPurpose();

    }
}
