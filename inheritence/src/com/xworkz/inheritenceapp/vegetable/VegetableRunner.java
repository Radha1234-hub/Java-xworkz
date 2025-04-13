package com.xworkz.inheritenceapp.vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();
        vegetable.vegetableDetails();

        Potato potato = new Potato();
        potato.vegetableDetails();

        Vegetable ref = new Potato();
        ref.vegetableDetails();

        Potato downcasted = (Potato) ref;
        downcasted.vegetableDetails();

    }

}