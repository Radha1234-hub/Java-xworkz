package com.xworkz.celestialbody;

import com.xworkz.celestialbody.asteroid.Asteroid;
import com.xworkz.celestialbody.celestialbody.CelestialBody;

public class CelestialBodyRunner {
    public static void main(String[] args) {

        CelestialBody ref = new CelestialBody();
        ref.type();
        ref.composition();
        ref.size();
        ref.motion();
        ref.significance();

        CelestialBody ref1 = new Asteroid();
        ref1.type();
        ref1.composition();
        ref1.size();
        ref1.motion();
        ref1.significance();

        Asteroid ref2 = new Asteroid();
        ref2.type();
        ref2.composition();
        ref2.size();
        ref2.motion();
        ref2.significance();
        ref2.classification();
        ref2.exploration();
    }
}
