package com.xworkz.inheritenceapp.foodgrain;

public class FoodGrainRunner {
    public static void main(String[] args) {
        FoodGrain grain = new FoodGrain();
        grain.grainDetails();

        Rice rice = new Rice();
        rice.grainDetails();

        FoodGrain ref = new Rice();
        ref.grainDetails();

        Rice downcasted = (Rice) ref;
        downcasted.grainDetails();
    }
}
