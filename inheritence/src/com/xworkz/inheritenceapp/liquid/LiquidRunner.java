package com.xworkz.inheritenceapp.liquid;

public class LiquidRunner {

    public static void main(String[] args) {
// Create a copy of Parent and invoke 5 methods
        Liquid liquid = new Liquid();
        liquid.liquidDetails();
        liquid.liquidProperties();
        liquid.liquidUses();
        liquid.liquidStates();
        liquid.liquidCharacteristics();

        System.out.println("\n");

        // Create a copy of Sub-class using Parent reference type and invoke 5 methods
        Liquid ref = new Water();
        ref.liquidDetails();
        ref.liquidProperties();
        ref.liquidUses();
        ref.liquidStates();
        ref.liquidCharacteristics();

        System.out.println("\n");

        // Create a copy of Sub-class using same class reference type and invoke 5 methods
        Water water = new Water();
        water.liquidDetails();
        water.waterCycle();
        water.waterPurification();
        water.waterTemperatureEffects();
        water.waterEnvironmentalRole();

    }
}