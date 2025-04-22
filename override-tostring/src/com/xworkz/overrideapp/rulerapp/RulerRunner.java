package com.xworkz.overrideapp.rulerapp;

import com.xworkz.overrideapp.rulerapp.ruler.RulerDto;

public class RulerRunner {
    public static void main(String[] args) {

        RulerDto ref1 = new RulerDto();
        ref1.setRulerId(1);
        ref1.setRulerType("Plastic Ruler");
        ref1.setRulerMaterial("Acrylic Plastic");
        ref1.setRulerLength("30 cm");
        ref1.setRulerUsage("School & Office");
        ref1.setRulerBrand("Classmate");
        ref1.setRulerPrice(50.00);

        int rulerId1 = ref1.getRulerId();
        String rulerType1 = ref1.getRulerType();
        String rulerMaterial1 = ref1.getRulerMaterial();
        String rulerLength1 = ref1.getRulerLength();
        String rulerUsage1 = ref1.getRulerUsage();
        String rulerBrand1 = ref1.getRulerBrand();
        double rulerPrice1 = ref1.getRulerPrice();

        System.out.println("Ruler ID: " + rulerId1);
        System.out.println("Ruler Type: " + rulerType1);
        System.out.println("Ruler Material: " + rulerMaterial1);
        System.out.println("Ruler Length: " + rulerLength1);
        System.out.println("Ruler Usage: " + rulerUsage1);
        System.out.println("Ruler Brand: " + rulerBrand1);
        System.out.println("Ruler Price: " + rulerPrice1);
        System.out.println("\n");

        RulerDto ref2 = new RulerDto();
        ref2.setRulerId(2);
        ref2.setRulerType("Metal Ruler");
        ref2.setRulerMaterial("Stainless Steel");
        ref2.setRulerLength("15 cm");
        ref2.setRulerUsage("Precision Drawing & Drafting");
        ref2.setRulerBrand("Staedtler");
        ref2.setRulerPrice(150.00);

        int rulerId2 = ref2.getRulerId();
        String rulerType2 = ref2.getRulerType();
        String rulerMaterial2 = ref2.getRulerMaterial();
        String rulerLength2 = ref2.getRulerLength();
        String rulerUsage2 = ref2.getRulerUsage();
        String rulerBrand2 = ref2.getRulerBrand();
        double rulerPrice2 = ref2.getRulerPrice();

        System.out.println("Ruler ID: " + rulerId2);
        System.out.println("Ruler Type: " + rulerType2);
        System.out.println("Ruler Material: " + rulerMaterial2);
        System.out.println("Ruler Length: " + rulerLength2);
        System.out.println("Ruler Usage: " + rulerUsage2);
        System.out.println("Ruler Brand: " + rulerBrand2);
        System.out.println("Ruler Price: " + rulerPrice2);
        System.out.println("\n");

        RulerDto ref3 = new RulerDto();
        ref3.setRulerId(3);
        ref3.setRulerType("Wooden Ruler");
        ref3.setRulerMaterial("Hardwood");
        ref3.setRulerLength("12 inches");
        ref3.setRulerUsage("Drawing & Measuring");
        ref3.setRulerBrand("Faber-Castell");
        ref3.setRulerPrice(80.00);

        int rulerId3 = ref3.getRulerId();
        String rulerType3 = ref3.getRulerType();
        String rulerMaterial3 = ref3.getRulerMaterial();
        String rulerLength3 = ref3.getRulerLength();
        String rulerUsage3 = ref3.getRulerUsage();
        String rulerBrand3 = ref3.getRulerBrand();
        double rulerPrice3 = ref3.getRulerPrice();

        System.out.println("Ruler ID: " + rulerId3);
        System.out.println("Ruler Type: " + rulerType3);
        System.out.println("Ruler Material: " + rulerMaterial3);
        System.out.println("Ruler Length: " + rulerLength3);
        System.out.println("Ruler Usage: " + rulerUsage3);
        System.out.println("Ruler Brand: " + rulerBrand3);
        System.out.println("Ruler Price: " + rulerPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
