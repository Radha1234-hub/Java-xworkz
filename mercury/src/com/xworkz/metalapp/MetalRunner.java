package com.xworkz.metalapp;

import com.xworkz.metalapp.mercury.Mercury;
import com.xworkz.metalapp.metal.Metal;

public class MetalRunner {

    public static void main(String[] args) {

        Metal ref = new Metal();
        ref.properties();
        ref.uses();
        ref.types();
        ref.density();
        ref.reactions();

        Metal ref1 = new Mercury();
        ref1.properties();
        ref1.uses();
        ref1.types();
        ref1.density();
        ref1.reactions();

        Mercury ref2 = new Mercury();
        ref2.properties();
        ref2.uses();
        ref2.types();
        ref2.density();
        ref2.reactions();
        ref2.safetyPrecautions();
        ref2.environmentalImpact();
    }
}
