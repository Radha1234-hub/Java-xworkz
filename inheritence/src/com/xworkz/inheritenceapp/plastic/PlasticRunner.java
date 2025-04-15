package com.xworkz.inheritenceapp.plastic;

public class PlasticRunner {
    public static void main(String[] args) {

        Plastic plastic = new Plastic();
        plastic.propertyOfPlastic();
        plastic.plasticUses();
        plastic.plasticDisposal();
        plastic.heatResistance();
        plastic.plasticInnovation();

        System.out.println("\n");

        Plastic ref = new Bottle();
        ref.propertyOfPlastic();
        ref.plasticUses();
        ref.plasticDisposal();
        ref.heatResistance();
        ref.plasticInnovation();

        System.out.println("\n");

        Bottle bottle = new Bottle();
        bottle.propertyOfPlastic();
        bottle.bottleDesigns();
        bottle.reusableBottles();
        bottle.bottleRecycling();
        bottle.bottleMaterials();

    }

}
