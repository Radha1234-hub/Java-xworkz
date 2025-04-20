package com.xworkz.desertapp;

import com.xworkz.desertapp.desert.Desert;
import com.xworkz.desertapp.sahara.Sahara;

public class DesertRunner {

    public static void main(String[] args) {

        Desert ref = new Desert();
        ref.climate();
        ref.vegetation();
        ref.wildlife();
        ref.terrain();
        ref.significance();

        Desert ref1 = new Sahara();
        ref1.climate();
        ref1.vegetation();
        ref1.wildlife();
        ref1.terrain();
        ref1.significance();

        Sahara ref2 = new Sahara();
        ref2.climate();
        ref2.vegetation();
        ref2.wildlife();
        ref2.terrain();
        ref2.significance();
        ref2.size();
        ref2.uniqueFeatures();
    }
}
