package com.xworkz.inheritenceapp.chemical;

public class ChemicalRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Chemical chemical = new Chemical();
        chemical.chemicalDetails();
        chemical.chemicalUses();
        chemical.chemicalTypes();
        chemical.chemicalSafety();
        chemical.chemicalSignificance();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Chemical ref = new Soap();
        ref.chemicalDetails();
        ref.chemicalUses();
        ref.chemicalTypes();
        ref.chemicalSafety();
        ref.chemicalSignificance();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        Soap soap = new Soap();
        soap.chemicalDetails();
        soap.soapDetails();
        soap.soapUses();
        soap.soapTypes();
        soap.soapImportance();
    }
}