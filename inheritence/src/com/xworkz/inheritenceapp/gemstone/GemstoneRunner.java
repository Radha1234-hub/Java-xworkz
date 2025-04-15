package com.xworkz.inheritenceapp.gemstone;

public class GemstoneRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Gemstone gemstone = new Gemstone();
        gemstone.gemstoneDetails();
        gemstone.gemstoneFormation();
        gemstone.gemstoneCategories();
        gemstone.gemstoneUses();
        gemstone.gemstoneCare();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Gemstone ref = new Daimond();
        ref.gemstoneDetails();
        ref.gemstoneFormation();
        ref.gemstoneCategories();
        ref.gemstoneUses();
        ref.gemstoneCare();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Daimond daimond = new Daimond();
        daimond.gemstoneDetails();
        daimond.diamondHardness();
        daimond.diamondUses();
        daimond.diamondSymbolism();
        daimond.diamondColors();

    }}
