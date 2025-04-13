package com.xworkz.inheritenceapp.planet;

public class PlanetRunner {
    public static void main(String[] args) {

        Planet planet = new Planet();
        planet.planetDetails();

        Earth earth = new Earth();
        earth.planetDetails();

        Planet ref = new Earth();
        ref.planetDetails();

        Earth downcasted = (Earth) ref;
        downcasted.planetDetails();

    }
}
