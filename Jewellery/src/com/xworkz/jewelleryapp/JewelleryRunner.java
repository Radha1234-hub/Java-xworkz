package com.xworkz.jewelleryapp;

import com.xworkz.jewelleryapp.jewellery.Jewellery;
import com.xworkz.jewelleryapp.ring.Ring;

public class JewelleryRunner {

    public static void main(String[] args) {

        Jewellery ref = new Jewellery();
        ref.type();
        ref.material();
        ref.purpose();
        ref.origin();
        ref.maintenance();

        Jewellery ref1 = new Ring();
        ref1.type();
        ref1.material();
        ref1.purpose();
        ref1.origin();
        ref1.maintenance();

        Ring ref2 = new Ring();
        ref2.type();
        ref2.material();
        ref2.purpose();
        ref2.origin();
        ref2.maintenance();
        ref2.size();
        ref2.engraving();
    }
}
