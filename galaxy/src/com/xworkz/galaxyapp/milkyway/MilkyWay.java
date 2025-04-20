package com.xworkz.galaxyapp.milkyway;

import com.xworkz.galaxyapp.galaxy.Galaxy;

public class MilkyWay extends Galaxy {
    @Override
    public void size() {
        System.out.println("The Milky Way is a medium-sized galaxy containing over 100 billion stars.");
    }

    @Override
    public void shape() {
        System.out.println("The Milky Way is a barred spiral galaxy with distinct arms extending outward.");
    }

    @Override
    public void components() {
        System.out.println("The Milky Way contains stars, planets, gas clouds, nebulae, and a supermassive black hole at its center.");
    }

    @Override
    public void distance() {
        System.out.println("The Milky Way spans approximately 100,000 light-years in diameter.");
    }

    @Override
    public void motion() {
        System.out.println("The Milky Way rotates, and its stars orbit the galactic center due to gravity.");
    }

    public void uniqueFeature() {
        System.out.println("The Milky Way's central region contains the Sagittarius A* supermassive black hole.");
    }

    public void neighboringGalaxies() {
        System.out.println("The Milky Way's neighbors include the Andromeda Galaxy and the Magellanic Clouds.");
    }
}
