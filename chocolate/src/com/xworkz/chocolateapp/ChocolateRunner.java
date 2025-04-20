package com.xworkz.chocolateapp;

import com.xworkz.chocolateapp.chocolate.Chocolate;
import com.xworkz.chocolateapp.fivestar.FiveStar;

public class ChocolateRunner {

    public static void main(String[] args) {

        Chocolate ref = new Chocolate();
        ref.type();
        ref.ingredients();
        ref.texture();
        ref.packaging();
        ref.popularity();

        Chocolate ref1 = new FiveStar();
        ref1.type();
        ref1.ingredients();
        ref1.texture();
        ref1.packaging();
        ref1.popularity();

        FiveStar ref2 = new FiveStar();
        ref2.type();
        ref2.ingredients();
        ref2.texture();
        ref2.packaging();
        ref2.popularity();
        ref2.marketReach();
        ref2.specialEditions();
    }
}
