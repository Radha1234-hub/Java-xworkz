package com.xworkz.inheritenceapp.ornament;

public class OrnamentRunner {
    public static void main(String[] args) {
        Ornament ornament = new Ornament();
        ornament.ornamentDetails();
        ornament.materialUsed();
        ornament.culturalSignificance();
        ornament.styleVariety();
        ornament.maintenanceTips();

        System.out.println("\n");

        Ornament ref = new Earrings();
        ref.ornamentDetails();
        ref.materialUsed();
        ref.culturalSignificance();
        ref.styleVariety();
        ref.maintenanceTips();

        System.out.println("\n");

        Earrings earrings = new Earrings();
        earrings.ornamentDetails();
        earrings.earringTypes();
        earrings.materialsSpecificToEarrings();
        earrings.earCare();
        earrings.trendFocus();


    }
}
