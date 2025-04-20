package com.xworkz.martialartapp;

import com.xworkz.martialartapp.karate.Karate;
import com.xworkz.martialartapp.martialart.MartilaArt;

public class MartialArtRunner {
    public static void main(String[] args) {

        MartilaArt  ref = new MartilaArt ();
        ref.origin();
        ref.techniques();
        ref.purpose();
        ref.equipment();
        ref.philosophy();

        MartilaArt  ref1 = new Karate();
        ref1.origin();
        ref1.techniques();
        ref1.purpose();
        ref1.equipment();
        ref1.philosophy();

        Karate ref2 = new Karate();
        ref2.origin();
        ref2.techniques();
        ref2.purpose();
        ref2.equipment();
        ref2.philosophy();
        ref2.kata();
        ref2.beltSystem();
    }
}
