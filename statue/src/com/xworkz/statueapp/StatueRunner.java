package com.xworkz.statueapp;

import com.xworkz.statueapp.statue.Statue;
import com.xworkz.statueapp.statueofliberty.StatueOfLiberty;

public class StatueRunner {
    public static void main(String[] args) {

        Statue ref = new Statue();
        ref.name();
        ref.height();
        ref.material();
        ref.location();
        ref.purpose();

        Statue ref1 = new StatueOfLiberty();
        ref1.name();
        ref1.height();
        ref1.material();
        ref1.location();
        ref1.purpose();

        StatueOfLiberty ref2 = new StatueOfLiberty();
        ref2.name();
        ref2.height();
        ref2.material();
        ref2.location();
        ref2.purpose();
        ref2.designer();
        ref2.dateOfInauguration();
    }
}
