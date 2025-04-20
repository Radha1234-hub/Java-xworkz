package com.xworkz.gasesapp;

import com.xworkz.gasesapp.gases.Gases;
import com.xworkz.gasesapp.oxygen.Oxygen;

public class GasesRunner {
    public static void main(String[] args) {

        Gases ref = new Gases();
        ref.composition();
        ref.properties();
        ref.uses();
        ref.occurrence();
        ref.behavior();

        Gases ref1 = new Oxygen();
        ref1.composition();
        ref1.properties();
        ref1.uses();
        ref1.occurrence();
        ref1.behavior();

        Oxygen ref2 = new Oxygen();
        ref2.composition();
        ref2.properties();
        ref2.uses();
        ref2.occurrence();
        ref2.behavior();
        ref2.biologicalImportance();
        ref2.industrialApplications();
    }
}
