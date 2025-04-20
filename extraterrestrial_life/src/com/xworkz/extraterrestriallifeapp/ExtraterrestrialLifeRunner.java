package com.xworkz.extraterrestriallifeapp;

import com.xworkz.extraterrestriallifeapp.alien.Alien;
import com.xworkz.extraterrestriallifeapp.extraterrestriallife.ExtraterrestrialLife;

public class ExtraterrestrialLifeRunner {
    public static void main(String[] args) {

        ExtraterrestrialLife ref = new ExtraterrestrialLife();
        ref.origin();
        ref.habitat();
        ref.characteristics();
        ref.detectionMethods();
        ref.scientificImportance();

        ExtraterrestrialLife ref1 = new Alien();
        ref1.origin();
        ref1.habitat();
        ref1.characteristics();
        ref1.detectionMethods();
        ref1.scientificImportance();

        Alien ref2 = new Alien();
        ref2.origin();
        ref2.habitat();
        ref2.characteristics();
        ref2.detectionMethods();
        ref2.scientificImportance();
        ref2.popCultureRepresentation();
        ref2.communicationAttempts();
    }
}
