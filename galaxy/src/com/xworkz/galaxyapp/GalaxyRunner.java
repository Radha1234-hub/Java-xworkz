package com.xworkz.galaxyapp;

import com.xworkz.galaxyapp.galaxy.Galaxy;
import com.xworkz.galaxyapp.milkyway.MilkyWay;

public class GalaxyRunner {

    public static void main(String[] args) {

        Galaxy ref = new Galaxy();
        ref.size();
        ref.shape();
        ref.components();
        ref.distance();
        ref.motion();

        Galaxy ref1 = new MilkyWay();
        ref1.size();
        ref1.shape();
        ref1.components();
        ref1.distance();
        ref1.motion();

        MilkyWay ref2 = new MilkyWay();
        ref2.size();
        ref2.shape();
        ref2.components();
        ref2.distance();
        ref2.motion();
        ref2.uniqueFeature();
        ref2.neighboringGalaxies();
    }
}
