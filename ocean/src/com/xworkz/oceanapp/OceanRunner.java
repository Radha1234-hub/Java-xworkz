package com.xworkz.oceanapp;

import com.xworkz.oceanapp.indianocean.IndianOcean;
import com.xworkz.oceanapp.ocean.Ocean;

public class OceanRunner {
    public static void main(String[] args) {

        Ocean ref = new Ocean();
        ref.name();
        ref.size();
        ref.depth();
        ref.marineLife();
        ref.importance();

        Ocean ref1 = new IndianOcean();
        ref1.name();
        ref1.size();
        ref1.depth();
        ref1.marineLife();
        ref1.importance();

        IndianOcean ref2 = new IndianOcean();
        ref2.name();
        ref2.size();
        ref2.depth();
        ref2.marineLife();
        ref2.importance();
        ref2.borderingCountries();
        ref2.uniqueFeatures();
    }
}
