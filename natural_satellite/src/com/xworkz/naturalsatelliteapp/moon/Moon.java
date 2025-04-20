package com.xworkz.naturalsatelliteapp.moon;

import com.xworkz.naturalsatelliteapp.naturalsatellite.NaturalSatellite;

public class Moon extends NaturalSatellite {
    @Override
    public void type() {
        System.out.println("The Moon is Earth's only natural satellite, and it's the fifth-largest moon in the Solar System.");
    }

    @Override
    public void composition() {
        System.out.println("The Moon is composed mainly of rock and minerals, including basalt and anorthosite.");
    }

    @Override
    public void orbit() {
        System.out.println("The Moon orbits Earth in an elliptical path at an average distance of 384,400 kilometers.");
    }

    @Override
    public void discovery() {
        System.out.println("The Moon has been visible to humans since prehistoric times and has inspired countless studies.");
    }

    @Override
    public void significance() {
        System.out.println("The Moon influences Earth's tides and serves as a key target for space exploration.");
    }

    public void phases() {
        System.out.println("The Moon undergoes phases such as new moon, crescent, full moon, and gibbous due to its orbit and Earth's shadow.");
    }

    public void exploration() {
        System.out.println("The Moon has been explored by missions such as Apollo and lunar orbiters, providing valuable scientific data.");
    }
}
