package com.xworkz.inheritenceapp.foodgrain;

public class FoodGrainRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        FoodGrain grain = new FoodGrain();
        grain.grainDetails();
        grain.grainCultivation();
        grain.grainStorage();
        grain.grainProcessing();
        grain.grainTrade();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        FoodGrain ref = new Rice();
        ref.grainDetails();
        ref.grainCultivation();
        ref.grainStorage();
        ref.grainProcessing();
        ref.grainTrade();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Rice rice = new Rice();
        rice.grainDetails();
        rice.riceVarieties();
        rice.riceCooking();
        rice.riceBenefits();
        rice.riceCulturalSignificance();

}}
