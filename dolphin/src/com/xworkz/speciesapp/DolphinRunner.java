package com.xworkz.speciesapp;

import com.xworkz.speciesapp.dolphin.Dolphin;
import com.xworkz.speciesapp.mammal.Mammal;



public class DolphinRunner {

    public static void main(String[] args) {

        Mammal ref = new Mammal();
        ref.habitat();
        ref.characteristics();
        ref.locomotion();
        ref.feeding();
        ref.communication();

        Mammal ref1 = new Dolphin();
        ref1.habitat();
        ref1.characteristics();
        ref1.locomotion();
        ref1.feeding();
        ref1.communication();

        Dolphin ref2 = new Dolphin();
        ref2.habitat();
        ref2.characteristics();
        ref2.locomotion();
        ref2.feeding();
        ref2.communication();
        ref2.echolocation();
        ref2.socialBehavior();
    }
}
