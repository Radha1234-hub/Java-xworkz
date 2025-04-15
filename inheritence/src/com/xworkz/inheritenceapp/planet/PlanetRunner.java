package com.xworkz.inheritenceapp.planet;

public class PlanetRunner {
    public static void main(String[] args) {

        Planet planet = new Planet();
        planet.planetDetails();
        planet.planetaryAtmosphere();
        planet.gravityForce();
        planet.planetaryTemperature();
        planet.rotationPeriod();

        System.out.println("\n");

        Planet ref = new Earth();
        ref.planetDetails();
        ref.planetaryAtmosphere();
        ref.gravityForce();
        ref.planetaryTemperature();
        ref.rotationPeriod();

        System.out.println("\n");

        Earth earth = new Earth();
        earth.planetDetails();
        earth.lifeSupport();
        earth.magneticField();
        earth.waterPresence();
        earth.biodiversity();

    }
}
