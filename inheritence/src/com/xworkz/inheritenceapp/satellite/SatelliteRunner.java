package com.xworkz.inheritenceapp.satellite;

public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        satellite.satelliteDetails();
        satellite.orbitType();
        satellite.signalTransmission();
        satellite.scientificResearch();
        satellite.energySource();

        System.out.println("\n");

        Satellite ref = new Moon();
        ref.satelliteDetails();
        ref.orbitType();
        ref.signalTransmission();
        ref.scientificResearch();
        ref.energySource();

        System.out.println("\n");

        Moon moon = new Moon();
        moon.satelliteDetails();
        moon.moonPhases();
        moon.gravitationalEffect();
        moon.explorationHistory();
        moon.culturalImpact();
    }
}