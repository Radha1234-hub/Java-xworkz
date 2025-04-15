package com.xworkz.inheritenceapp.naturalprocess;

public class NaturalProcessRunner {
    public static void main(String[] args) {
        NaturalProcess naturalProcess = new NaturalProcess();
        naturalProcess.processDetails();
        naturalProcess.chemicalReaction();
        naturalProcess.oxygenRelease();
        naturalProcess.plantGrowth();
        naturalProcess.ecologicalImportance();

        System.out.println("\n");

        NaturalProcess ref = new Photosynthesis();
        ref.processDetails();
        ref.chemicalReaction();
        ref.oxygenRelease();
        ref.plantGrowth();
        ref.ecologicalImportance();

        System.out.println("\n");

        Photosynthesis photosynthesis = new Photosynthesis();
        photosynthesis.processDetails();
        photosynthesis.lightAbsorption();
        photosynthesis.energyTransformation();
        photosynthesis.foodChainSupport();
        photosynthesis.environmentalRole();

    }
}
