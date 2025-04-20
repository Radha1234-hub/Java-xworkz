package com.xworkz.fuelapp.petrol;

import com.xworkz.fuelapp.fuel.Fuel;

public class Petrol extends Fuel {

    @Override
    public void type() {
        System.out.println("Petrol is a liquid fuel derived from crude oil through refining processes.");
    }

    @Override
    public void purpose() {
        System.out.println("Petrol is primarily used to power internal combustion engines in vehicles.");
    }

    @Override
    public void source() {
        System.out.println("Petrol is sourced from petroleum reservoirs and refined into usable fuel.");
    }

    @Override
    public void efficiency() {
        System.out.println("Petrol has a high energy density, making it efficient for powering engines.");
    }

    @Override
    public void environmentalImpact() {
        System.out.println("Petrol combustion produces carbon dioxide and contributes to air pollution.");
    }

    public void octaneRating() {
        System.out.println("Petrol has an octane rating that indicates its resistance to knocking in engines.");
    }

    public void applications() {
        System.out.println("Apart from vehicles, petrol is used in generators, chainsaws, and small machinery.");
    }
}
