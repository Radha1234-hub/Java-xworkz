package com.xworkz.inheritenceapp.satellite;

public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        satellite.satelliteDetails();

        Moon moon = new Moon();
        moon.satelliteDetails();

        Satellite ref = new Moon();
        ref.satelliteDetails();

        Moon downcasted = (Moon) ref;
        downcasted.satelliteDetails();

    }
}