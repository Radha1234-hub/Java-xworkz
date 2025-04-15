package com.xworkz.inheritenceapp.civilization;

public class CivilizationRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Civilization civilization = new Civilization();
        civilization.civilizationDetails();
        civilization.agricultureDevelopment();
        civilization.culturalGrowth();
        civilization.governanceStructures();
        civilization.scientificAdvancements();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Civilization ref = new Indus();
        ref.civilizationDetails();
        ref.agricultureDevelopment();
        ref.culturalGrowth();
        ref.governanceStructures();
        ref.scientificAdvancements();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Indus indus = new Indus();
        indus.civilizationDetails();
        indus.indusArchitecture();
        indus.tradeNetwork();
        indus.craftsmanship();
        indus.writtenLanguage();
    }
}
