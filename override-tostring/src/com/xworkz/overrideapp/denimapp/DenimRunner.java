package com.xworkz.overrideapp.denimapp;

import com.xworkz.overrideapp.denimapp.denim.DenimDto;

public class DenimRunner {
    public static void main(String[] args) {

        DenimDto ref1 = new DenimDto();
        ref1.setDenimId(1);
        ref1.setDenimType("Jeans");
        ref1.setDenimBrand("Levi's");
        ref1.setDenimFit("Slim Fit");
        ref1.setDenimColor("Blue");
        ref1.setDenimMaterial("Cotton Denim");
        ref1.setDenimPrice(2999.00);

        int denimId1 = ref1.getDenimId();
        String denimType1 = ref1.getDenimType();
        String denimBrand1 = ref1.getDenimBrand();
        String denimFit1 = ref1.getDenimFit();
        String denimColor1 = ref1.getDenimColor();
        String denimMaterial1 = ref1.getDenimMaterial();
        double denimPrice1 = ref1.getDenimPrice();

        System.out.println("Denim ID: " + denimId1);
        System.out.println("Denim Type: " + denimType1);
        System.out.println("Denim Brand: " + denimBrand1);
        System.out.println("Denim Fit: " + denimFit1);
        System.out.println("Denim Color: " + denimColor1);
        System.out.println("Denim Material: " + denimMaterial1);
        System.out.println("Denim Price: " + denimPrice1);
        System.out.println("\n");

        DenimDto ref2 = new DenimDto();
        ref2.setDenimId(2);
        ref2.setDenimType("Jacket");
        ref2.setDenimBrand("Wrangler");
        ref2.setDenimFit("Regular Fit");
        ref2.setDenimColor("Black");
        ref2.setDenimMaterial("Stretch Denim");
        ref2.setDenimPrice(3999.00);

        int denimId2 = ref2.getDenimId();
        String denimType2 = ref2.getDenimType();
        String denimBrand2 = ref2.getDenimBrand();
        String denimFit2 = ref2.getDenimFit();
        String denimColor2 = ref2.getDenimColor();
        String denimMaterial2 = ref2.getDenimMaterial();
        double denimPrice2 = ref2.getDenimPrice();

        System.out.println("Denim ID: " + denimId2);
        System.out.println("Denim Type: " + denimType2);
        System.out.println("Denim Brand: " + denimBrand2);
        System.out.println("Denim Fit: " + denimFit2);
        System.out.println("Denim Color: " + denimColor2);
        System.out.println("Denim Material: " + denimMaterial2);
        System.out.println("Denim Price: " + denimPrice2);
        System.out.println("\n");

        DenimDto ref3 = new DenimDto();
        ref3.setDenimId(3);
        ref3.setDenimType("Shorts");
        ref3.setDenimBrand("Lee");
        ref3.setDenimFit("Loose Fit");
        ref3.setDenimColor("Grey");
        ref3.setDenimMaterial("Raw Denim");
        ref3.setDenimPrice(2499.00);

        int denimId3 = ref3.getDenimId();
        String denimType3 = ref3.getDenimType();
        String denimBrand3 = ref3.getDenimBrand();
        String denimFit3 = ref3.getDenimFit();
        String denimColor3 = ref3.getDenimColor();
        String denimMaterial3 = ref3.getDenimMaterial();
        double denimPrice3 = ref3.getDenimPrice();

        System.out.println("Denim ID: " + denimId3);
        System.out.println("Denim Type: " + denimType3);
        System.out.println("Denim Brand: " + denimBrand3);
        System.out.println("Denim Fit: " + denimFit3);
        System.out.println("Denim Color: " + denimColor3);
        System.out.println("Denim Material: " + denimMaterial3);
        System.out.println("Denim Price: " + denimPrice3);
        System.out.println("\n");

        DenimDto ref22 = new DenimDto();
        ref22.setDenimId(2);
        ref22.setDenimType("Jacket");
        ref22.setDenimBrand("Wrangler");
        ref22.setDenimFit("Regular Fit");
        ref22.setDenimColor("Black");
        ref22.setDenimMaterial("Stretch Denim");
        ref22.setDenimPrice(3999.00);

        System.out.println(ref3.toString());
        System.out.println(ref2.equals(ref22));
        System.out.println(ref3.hashCode());
    }
}
