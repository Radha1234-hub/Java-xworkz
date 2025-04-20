package com.xworkz.carftapp;

import com.xworkz.carftapp.craft.Craft;
import com.xworkz.carftapp.pottery.Pottery;

public class CarftRunner {

    public static void main(String[] args) {

        Craft ref = new Craft();
        ref.type();
        ref.materials();
        ref.tools();
        ref.purpose();
        ref.history();

        Craft ref1 = new Pottery();
        ref1.type();
        ref1.materials();
        ref1.tools();
        ref1.purpose();
        ref1.history();

        Pottery ref2 = new Pottery();
        ref2.type();
        ref2.materials();
        ref2.tools();
        ref2.purpose();
        ref2.history();
        ref2.firingProcess();
        ref2.styles();
    }
}
