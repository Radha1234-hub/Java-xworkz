package com.xworkz.celestialbody.asteroid;

import com.xworkz.celestialbody.celestialbody.CelestialBody;

public class Asteroid extends CelestialBody {

    @Override
    public void type() {
        System.out.println("Asteroids are small, rocky celestial bodies primarily found in the asteroid belt between Mars and Jupiter.");
    }

    @Override
    public void composition() {
        System.out.println("Asteroids are composed of metals, silicates, and occasionally organic compounds.");
    }

    @Override
    public void size() {
        System.out.println("Asteroids vary in size, ranging from a few meters to hundreds of kilometers in diameter.");
    }

    @Override
    public void motion() {
        System.out.println("Asteroids move in elliptical orbits around the Sun and can occasionally collide with planets.");
    }

    @Override
    public void significance() {
        System.out.println("Asteroids are important for studying the early solar system and are potential sources of rare materials.");
    }

    public void classification() {
        System.out.println("Asteroids are classified as C-type (carbonaceous), S-type (silicaceous), or M-type (metallic).");
    }

    public void exploration() {
        System.out.println("Asteroids are explored using spacecraft missions like NASA’s OSIRIS-REx and Japan's Hayabusa.");
    }

}
