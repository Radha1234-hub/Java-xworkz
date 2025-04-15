package com.xworkz.inheritenceapp.vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();
        vegetable.vegetableDetails();
        vegetable.nutritionalValue();
        vegetable.growthEnvironment();
        vegetable.healthBenefits();
        vegetable.cookingMethods();

        System.out.println("\n");

        Vegetable ref = new Potato();
        ref.vegetableDetails();
        ref.nutritionalValue();
        ref.growthEnvironment();
        ref.healthBenefits();
        ref.cookingMethods();

        System.out.println("\n");

        Potato potato = new Potato();
        potato.vegetableDetails();
        potato.typesOfPotatoes();
        potato.commonDishes();
        potato.storageTips();
        potato.preparationTechniques();

    }

}