package com.xworkz.overrideapp.cottonapp;

import com.xworkz.overrideapp.cottonapp.cotton.CottonDto;

public class CottonRunner {
    public static void main(String[] args) {

        CottonDto ref1 = new CottonDto();
        ref1.setCottonId(1);
        ref1.setCottonType("Organic");
        ref1.setCottonOrigin("India");
        ref1.setCottonQuality("Premium");
        ref1.setCottonUsage("Clothing");
        ref1.setCottonColor("White");
        ref1.setCottonPrice(500.00);

        int cottonId1 = ref1.getCottonId();
        String cottonType1 = ref1.getCottonType();
        String cottonOrigin1 = ref1.getCottonOrigin();
        String cottonQuality1 = ref1.getCottonQuality();
        String cottonUsage1 = ref1.getCottonUsage();
        String cottonColor1 = ref1.getCottonColor();
        double cottonPrice1 = ref1.getCottonPrice();

        System.out.println("Cotton ID: " + cottonId1);
        System.out.println("Cotton Type: " + cottonType1);
        System.out.println("Cotton Origin: " + cottonOrigin1);
        System.out.println("Cotton Quality: " + cottonQuality1);
        System.out.println("Cotton Usage: " + cottonUsage1);
        System.out.println("Cotton Color: " + cottonColor1);
        System.out.println("Cotton Price: " + cottonPrice1);
        System.out.println("\n");

        CottonDto ref2 = new CottonDto();
        ref2.setCottonId(2);
        ref2.setCottonType("Pima");
        ref2.setCottonOrigin("USA");
        ref2.setCottonQuality("High");
        ref2.setCottonUsage("Luxury Fabrics");
        ref2.setCottonColor("Cream");
        ref2.setCottonPrice(700.00);

        int cottonId2 = ref2.getCottonId();
        String cottonType2 = ref2.getCottonType();
        String cottonOrigin2 = ref2.getCottonOrigin();
        String cottonQuality2 = ref2.getCottonQuality();
        String cottonUsage2 = ref2.getCottonUsage();
        String cottonColor2 = ref2.getCottonColor();
        double cottonPrice2 = ref2.getCottonPrice();

        System.out.println("Cotton ID: " + cottonId2);
        System.out.println("Cotton Type: " + cottonType2);
        System.out.println("Cotton Origin: " + cottonOrigin2);
        System.out.println("Cotton Quality: " + cottonQuality2);
        System.out.println("Cotton Usage: " + cottonUsage2);
        System.out.println("Cotton Color: " + cottonColor2);
        System.out.println("Cotton Price: " + cottonPrice2);
        System.out.println("\n");

        CottonDto ref3 = new CottonDto();
        ref3.setCottonId(3);
        ref3.setCottonType("Egyptian");
        ref3.setCottonOrigin("Egypt");
        ref3.setCottonQuality("Superior");
        ref3.setCottonUsage("Bedding");
        ref3.setCottonColor("Off-White");
        ref3.setCottonPrice(900.00);

        int cottonId3 = ref3.getCottonId();
        String cottonType3 = ref3.getCottonType();
        String cottonOrigin3 = ref3.getCottonOrigin();
        String cottonQuality3 = ref3.getCottonQuality();
        String cottonUsage3 = ref3.getCottonUsage();
        String cottonColor3 = ref3.getCottonColor();
        double cottonPrice3 = ref3.getCottonPrice();

        System.out.println("Cotton ID: " + cottonId3);
        System.out.println("Cotton Type: " + cottonType3);
        System.out.println("Cotton Origin: " + cottonOrigin3);
        System.out.println("Cotton Quality: " + cottonQuality3);
        System.out.println("Cotton Usage: " + cottonUsage3);
        System.out.println("Cotton Color: " + cottonColor3);
        System.out.println("Cotton Price: " + cottonPrice3);
        System.out.println("\n");

        CottonDto ref22 = new CottonDto();
        ref22.setCottonId(2);
        ref22.setCottonType("Pima");
        ref22.setCottonOrigin("USA");
        ref22.setCottonQuality("High");
        ref22.setCottonUsage("Luxury Fabrics");
        ref22.setCottonColor("Cream");
        ref22.setCottonPrice(700.00);

        System.out.println(ref3.toString());
        System.out.println(ref2.equals(ref22));
        System.out.println(ref3.hashCode());
    }
}
