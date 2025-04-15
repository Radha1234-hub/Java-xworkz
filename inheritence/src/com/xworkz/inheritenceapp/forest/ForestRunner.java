package com.xworkz.inheritenceapp.forest;

public class ForestRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Forest forest = new Forest();
        forest.forestDetails();
        forest.forestImportance();
        forest.forestTypes();
        forest.forestResources();
        forest.forestThreats();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Forest ref = new Amazon();
        ref.forestDetails();
        ref.forestImportance();
        ref.forestTypes();
        ref.forestResources();
        ref.forestThreats();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Amazon amazon = new Amazon();
        amazon.forestDetails();
        amazon.amazonLocation();
        amazon.amazonBiodiversity();
        amazon.amazonRole();
        amazon.amazonThreats();
    }
}
