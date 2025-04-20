package com.xworkz.gemapp;

import com.xworkz.gemapp.gem.Gem;
import com.xworkz.gemapp.pearl.Pearl;

public class GemRunner {

    public static void main(String[] args) {

        Gem ref = new Gem();
        ref.type();
        ref.formation();
        ref.uses();
        ref.value();
        ref.care();

        Gem ref1 = new Pearl();
        ref1.type();
        ref1.formation();
        ref1.uses();
        ref1.value();
        ref1.care();

        Pearl ref2 = new Pearl();
        ref2.type();
        ref2.formation();
        ref2.uses();
        ref2.value();
        ref2.care();
        ref2.origin();
        ref2.colorVarieties();
    }
}
