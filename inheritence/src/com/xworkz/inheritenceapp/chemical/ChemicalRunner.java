package com.xworkz.inheritenceapp.chemical;

public class ChemicalRunner {
    public static void main(String[] args) {
        Chemical chemical = new Chemical();
        chemical.chemicalDetails();

        Soap soap = new Soap();
        soap.chemicalDetails();

        Chemical ref = new Soap();
        ref.chemicalDetails();

        Soap downcasted = (Soap) ref;
        downcasted.chemicalDetails();
    }
}