package com.xworkz.inheritenceapp.galaxy;

public class GalaxyRunner {
    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy();
        galaxy.galaxyDetails();

        MilkyWay milkyWay = new MilkyWay();
        milkyWay.galaxyDetails();

        Galaxy ref = new MilkyWay();
        ref.galaxyDetails();

        MilkyWay downcasted = (MilkyWay) ref;
        downcasted.galaxyDetails();
    }
}
