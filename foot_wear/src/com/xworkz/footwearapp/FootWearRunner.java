package com.xworkz.footwearapp;

import com.xworkz.footwearapp.footwear.FootWear;
import com.xworkz.footwearapp.slipper.Slipper;

public class FootWearRunner {

    public static void main(String[] args) {

        FootWear ref = new FootWear();
        ref.type();
        ref.material();
        ref.usage();
        ref.size();
        ref.design();

        FootWear ref1 = new Slipper();
        ref1.type();
        ref1.material();
        ref1.usage();
        ref1.size();
        ref1.design();

        Slipper ref2 = new Slipper();
        ref2.type();
        ref2.material();
        ref2.usage();
        ref2.size();
        ref2.design();
        ref2.comfortLevel();
        ref2.slipResistance();
    }
}
