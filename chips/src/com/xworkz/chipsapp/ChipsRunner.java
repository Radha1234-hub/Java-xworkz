package com.xworkz.chipsapp;

import com.xworkz.chipsapp.chips.Chips;
import com.xworkz.chipsapp.lays.Lays;

public class ChipsRunner {
    public static void main(String[] args) {

        Chips ref = new Chips();
        ref.brand();
        ref.flavor();
        ref.packaging();
        ref.ingredients();
        ref.popularity();

        Chips ref1 = new Lays();
        ref1.brand();
        ref1.flavor();
        ref1.packaging();
        ref1.ingredients();
        ref1.popularity();

        Lays ref2 = new Lays();
        ref2.brand();
        ref2.flavor();
        ref2.packaging();
        ref2.ingredients();
        ref2.popularity();
        ref2.specialEditions();
        ref2.marketReach();
    }
}
