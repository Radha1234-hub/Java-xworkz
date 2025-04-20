package com.xworkz.fuelapp;

import com.xworkz.fuelapp.fuel.Fuel;
import com.xworkz.fuelapp.petrol.Petrol;

public class FuelRunner {
    public static void main(String[] args) {

        Fuel ref = new Fuel();
        ref.type();
        ref.purpose();
        ref.source();
        ref.efficiency();
        ref.environmentalImpact();

        Fuel ref1 = new Petrol();
        ref1.type();
        ref1.purpose();
        ref1.source();
        ref1.efficiency();
        ref1.environmentalImpact();

        Petrol ref2 = new Petrol();
        ref2.type();
        ref2.purpose();
        ref2.source();
        ref2.efficiency();
        ref2.environmentalImpact();
        ref2.octaneRating();
        ref2.applications();
    }
}
