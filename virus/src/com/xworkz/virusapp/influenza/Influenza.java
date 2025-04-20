package com.xworkz.virusapp.influenza;

import com.xworkz.virusapp.virus.Virus;

public class Influenza extends Virus {

    @Override
    public void type() {
        System.out.println("Influenza is an RNA virus that causes respiratory infections in humans and animals.");
    }

    @Override
    public void structure() {
        System.out.println("Influenza viruses have a segmented RNA genome enclosed in a spherical protein envelope.");
    }

    @Override
    public void transmission() {
        System.out.println("Influenza spreads through droplets from coughing, sneezing, or contact with contaminated surfaces.");
    }

    @Override
    public void impact() {
        System.out.println("Influenza leads to symptoms like fever, cough, body aches, and can result in severe complications.");
    }

    @Override
    public void replication() {
        System.out.println("Influenza viruses replicate in the respiratory epithelial cells, causing tissue damage and immune response.");
    }

    public void subtypes() {
        System.out.println("Influenza is classified into types A, B, and C, with type A further divided into subtypes like H1N1 and H3N2.");
    }

    public void prevention() {
        System.out.println("Influenza prevention includes annual vaccination, hygiene practices, and antiviral medications.");
    }
}
