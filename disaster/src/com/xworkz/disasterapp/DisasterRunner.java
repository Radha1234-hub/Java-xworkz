package com.xworkz.disasterapp;

import com.xworkz.disasterapp.disaster.Disaster;
import com.xworkz.disasterapp.earthquake.Earthquake;

public class DisasterRunner {
    public static void main(String[] args) {

        Disaster ref = new Disaster();
        ref.type();
        ref.cause();
        ref.impact();
        ref.preparedness();
        ref.recovery();

        Disaster ref1 = new Earthquake();
        ref1.type();
        ref1.cause();
        ref1.impact();
        ref1.preparedness();
        ref1.recovery();

        Earthquake ref2 = new Earthquake();
        ref2.type();
        ref2.cause();
        ref2.impact();
        ref2.preparedness();
        ref2.recovery();
        ref2.magnitude();
        ref2.regions();
    }
}
