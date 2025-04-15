package com.xworkz.inheritenceapp.dessert;

public class DessertRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Dessert dessert = new Dessert();
        dessert.dessertDetails();
        dessert.dessertIngredients();
        dessert.dessertTypes();
        dessert.dessertOccasions();
        dessert.dessertSignificance();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Dessert ref = new IceCream();
        ref.dessertDetails();
        ref.dessertIngredients();
        ref.dessertTypes();
        ref.dessertOccasions();
        ref.dessertSignificance();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        IceCream iceCream = new IceCream();
        iceCream.dessertDetails();
        iceCream.iceCreamFlavors();
        iceCream.iceCreamTextures();
        iceCream.iceCreamServingStyles();
        iceCream.iceCreamPopularity();
    }

}
