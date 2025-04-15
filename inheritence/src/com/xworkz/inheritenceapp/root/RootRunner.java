package com.xworkz.inheritenceapp.root;

public class RootRunner {
    public static void main(String[] args) {
        Root root = new Root();
        root.rootDetails();
        root.absorbWater();
        root.storeNutrients();
        root.provideSupport();
        root.promoteSoilHealth();

        System.out.println("\n");

        Root ref = new Carrot();
        ref.rootDetails();
        ref.absorbWater();
        ref.storeNutrients();
        ref.provideSupport();
        ref.promoteSoilHealth();

        System.out.println("\n");

        Carrot carrot = new Carrot();
        carrot.rootDetails();
        carrot.nutritionalValue();
        carrot.culinaryUses();
        carrot.growthConditions();
        carrot.storageTips();


    }
}
