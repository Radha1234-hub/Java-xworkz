package com.xworkz.inheritenceapp.flower;

public class FlowerRunner {
    public static void main(String[] args) {

        // Creating a copy of the parent class and invoking 5 methods
        Flower flower = new Flower();
        flower.flowerDetails();
        flower.flowerFragrance();
        flower.flowerReproduction();
        flower.flowerTexture();
        flower.flowerSeasonality();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Flower ref = new Lotus();
        ref.flowerDetails();
        ref.flowerFragrance();
        ref.flowerReproduction();
        ref.flowerTexture();
        ref.flowerSeasonality();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Lotus lotus = new Lotus();
        lotus.flowerDetails();
        lotus.lotusSignificance();
        lotus.lotusHabitat();
        lotus.lotusColorVariety();
        lotus.lotusCulturalImpact();
    }
}
