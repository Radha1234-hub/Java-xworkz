package com.xworkz.inheritenceapp.fruit;

import com.xworkz.inheritenceapp.machine.Machine;

public class FruitRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Fruit fruit = new Fruit();
        fruit.fruitDetails();
        fruit.fruitNutrients();
        fruit.fruitVarieties();
        fruit.fruitBenefits();
        fruit.fruitCultivation();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Fruit ref = new Mango();
        ref.fruitDetails();
        ref.fruitNutrients();
        ref.fruitVarieties();
        ref.fruitBenefits();
        ref.fruitCultivation();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Mango mango = new Mango();
        mango.fruitDetails();
        mango.mangoSeason();
        mango.mangoTypes();
        mango.mangoUses();
        mango.mangoSignificance();
    }

}
