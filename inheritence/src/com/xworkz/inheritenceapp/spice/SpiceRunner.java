package com.xworkz.inheritenceapp.spice;

public class SpiceRunner {
    public static void main(String[] args) {
        Spice spice = new Spice();
        spice.spiceDetails();
        spice.origin();
        spice.culinaryUses();
        spice.medicinalProperties();
        spice.storageTips();

        System.out.println("\n");

        Spice ref = new Pepper();
        ref.spiceDetails();
        ref.origin();
        ref.culinaryUses();
        ref.medicinalProperties();
        ref.storageTips();

        System.out.println("\n");

        Pepper pepper = new Pepper();
        pepper.spiceDetails();
        pepper.pepperTypes();
        pepper.healthBenefits();
        pepper.cultivationRegions();
        pepper.pairingWithFood();

    }
}
