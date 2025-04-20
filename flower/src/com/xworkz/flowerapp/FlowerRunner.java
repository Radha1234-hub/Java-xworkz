package com.xworkz.flowerapp;

import com.xworkz.flowerapp.flower.Flower;
import com.xworkz.flowerapp.neelakuranji.Neelakuranji;

public class FlowerRunner {

    public static void main(String[] args) {

        Flower ref = new Flower();
        ref.name();
        ref.color();
        ref.fragrance();
        ref.bloomingSeason();
        ref.significance();

        Flower ref1 = new Neelakuranji();
        ref1.name();
        ref1.color();
        ref1.fragrance();
        ref1.bloomingSeason();
        ref1.significance();

        Neelakuranji ref2 = new Neelakuranji();
        ref2.name();
        ref2.color();
        ref2.fragrance();
        ref2.bloomingSeason();
        ref2.significance();
        ref2.habitat();
        ref2.scientificName();
    }
}
