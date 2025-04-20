package com.xworkz.flourapp;

import com.xworkz.flourapp.flour.Flour;
import com.xworkz.flourapp.wheatflour.WheatFlour;

public class FlourRunner {

    public static void main(String[] args) {

        Flour ref = new Flour();
        ref.type();
        ref.color();
        ref.use();
        ref.texture();
        ref.nutritionalValue();

        Flour ref1 = new WheatFlour();
        ref1.type();
        ref1.color();
        ref1.use();
        ref1.texture();
        ref1.nutritionalValue();

        WheatFlour ref2 = new WheatFlour();
        ref2.type();
        ref2.color();
        ref2.use();
        ref2.texture();
        ref2.nutritionalValue();
        ref2.glutenContent();
        ref2.typesOfWheatFlour();
    }
}
