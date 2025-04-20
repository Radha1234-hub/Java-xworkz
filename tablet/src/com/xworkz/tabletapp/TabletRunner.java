package com.xworkz.tabletapp;

import com.xworkz.tabletapp.dot.Dot;
import com.xworkz.tabletapp.tablet.Tablet;

public class TabletRunner {

    public static void main(String[] args) {

        Tablet ref = new Tablet();
        ref.composition();
        ref.usage();
        ref.dosage();
        ref.packaging();
        ref.shelfLife();

        Tablet ref1 = new Dot();
        ref1.composition();
        ref1.usage();
        ref1.dosage();
        ref1.packaging();
        ref1.shelfLife();

        Dot ref2 = new Dot();
        ref2.composition();
        ref2.usage();
        ref2.dosage();
        ref2.packaging();
        ref2.shelfLife();
        ref2.precautions();
        ref2.effectiveness();
    }
}
