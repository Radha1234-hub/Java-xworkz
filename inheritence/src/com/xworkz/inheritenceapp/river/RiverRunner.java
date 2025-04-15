package com.xworkz.inheritenceapp.river;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new River();
        river.riverDetails();
        river.freshwaterSource();
        river.riverEcosystem();
        river.agriculturalSupport();
        river.culturalSignificance();

        System.out.println("\n");

        River ref = new Ganga();
        ref.riverDetails();
        ref.freshwaterSource();
        ref.riverEcosystem();
        ref.agriculturalSupport();
        ref.culturalSignificance();

        System.out.println("\n");

        Ganga ganga = new Ganga();
        ganga.riverDetails();
        ganga.gangaPurification();
        ganga.gangaBasin();
        ganga.gangaFestivals();
        ganga.gangaEnvironmentalChallenges();

    }
}
