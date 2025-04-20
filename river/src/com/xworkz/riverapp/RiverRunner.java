package com.xworkz.riverapp;

import com.xworkz.riverapp.river.River;
import com.xworkz.riverapp.saraswati.Saraswati;

public class RiverRunner {
    public static void main(String[] args) {

        River ref = new River();
        ref.name();
        ref.length();
        ref.source();
        ref.flowPath();
        ref.significance();

        River ref1 = new Saraswati();
        ref1.name();
        ref1.length();
        ref1.source();
        ref1.flowPath();
        ref1.significance();

        Saraswati ref2 = new Saraswati();
        ref2.name();
        ref2.length();
        ref2.source();
        ref2.flowPath();
        ref2.significance();
        ref2.historicalReferences();
        ref2.culturalImpact();
    }

}
