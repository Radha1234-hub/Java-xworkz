package com.xworkz.inheritenceapp.chocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Chocolate chocolate = new Chocolate();
        chocolate.chocolateDetails();
        chocolate.chocolateIngredients();
        chocolate.chocolateBenefits();
        chocolate.chocolateVarieties();
        chocolate.chocolateConsumption();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Chocolate ref = new Cadbury();
        ref.chocolateDetails();
        ref.chocolateIngredients();
        ref.chocolateBenefits();
        ref.chocolateVarieties();
        ref.chocolateConsumption();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        Cadbury cadbury = new Cadbury();
        cadbury.chocolateDetails();
        cadbury.cadburyDetails();
        cadbury.cadburyProducts();
        cadbury.cadburyPopularity();
        cadbury.cadburyPackaging();}
}
