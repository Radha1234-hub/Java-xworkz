package com.xworkz.naturalsatelliteapp;

import com.xworkz.naturalsatelliteapp.moon.Moon;
import com.xworkz.naturalsatelliteapp.naturalsatellite.NaturalSatellite;

public class NaturalSatelliteRunner {
    public static void main(String[] args) {

        NaturalSatellite ref = new NaturalSatellite();
        ref.type();
        ref.composition();
        ref.orbit();
        ref.discovery();
        ref.significance();

        NaturalSatellite ref1 = new Moon();
        ref1.type();
        ref1.composition();
        ref1.orbit();
        ref1.discovery();
        ref1.significance();

        Moon ref2 = new Moon();
        ref2.type();
        ref2.composition();
        ref2.orbit();
        ref2.discovery();
        ref2.significance();
        ref2.phases();
        ref2.exploration();
    }
}
