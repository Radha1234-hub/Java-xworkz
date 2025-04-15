package com.xworkz.inheritenceapp.galaxy;

public class GalaxyRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Galaxy galaxy = new Galaxy();
        galaxy.galaxyDetails();
        galaxy.galaxyShapes();
        galaxy.galaxyComponents();
        galaxy.galaxySize();
        galaxy.galaxyCount();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Galaxy ref = new MilkyWay();
        ref.galaxyDetails();
        ref.galaxyShapes();
        ref.galaxyComponents();
        ref.galaxySize();
        ref.galaxyCount();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        MilkyWay milkyWay = new MilkyWay();
        milkyWay.galaxyDetails();
        milkyWay.milkyWayDescription();
        milkyWay.milkyWayStars();
        milkyWay.milkyWayLocation();
        milkyWay.milkyWaySignificance();
    }
}
