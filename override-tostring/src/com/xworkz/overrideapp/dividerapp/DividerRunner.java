package com.xworkz.overrideapp.dividerapp;

import com.xworkz.overrideapp.dividerapp.divider.DividerDto;

public class DividerRunner {
    public static void main(String[] args) {

        DividerDto ref1 = new DividerDto();
        ref1.setDividerId(1);
        ref1.setDividerType("Compass Divider");
        ref1.setDividerMaterial("Steel");
        ref1.setDividerBrand("Staedtler");
        ref1.setDividerUsage("Technical Drawing & Geometry");
        ref1.setDividerSize("6 inches");
        ref1.setDividerPrice(250.00);

        int dividerId1 = ref1.getDividerId();
        String dividerType1 = ref1.getDividerType();
        String dividerMaterial1 = ref1.getDividerMaterial();
        String dividerBrand1 = ref1.getDividerBrand();
        String dividerUsage1 = ref1.getDividerUsage();
        String dividerSize1 = ref1.getDividerSize();
        double dividerPrice1 = ref1.getDividerPrice();

        System.out.println("Divider ID: " + dividerId1);
        System.out.println("Divider Type: " + dividerType1);
        System.out.println("Divider Material: " + dividerMaterial1);
        System.out.println("Divider Brand: " + dividerBrand1);
        System.out.println("Divider Usage: " + dividerUsage1);
        System.out.println("Divider Size: " + dividerSize1);
        System.out.println("Divider Price: " + dividerPrice1);
        System.out.println("\n");

        DividerDto ref2 = new DividerDto();
        ref2.setDividerId(2);
        ref2.setDividerType("Wing Divider");
        ref2.setDividerMaterial("Carbon Steel");
        ref2.setDividerBrand("Faber-Castell");
        ref2.setDividerUsage("Woodworking & Metalworking");
        ref2.setDividerSize("8 inches");
        ref2.setDividerPrice(400.00);

        int dividerId2 = ref2.getDividerId();
        String dividerType2 = ref2.getDividerType();
        String dividerMaterial2 = ref2.getDividerMaterial();
        String dividerBrand2 = ref2.getDividerBrand();
        String dividerUsage2 = ref2.getDividerUsage();
        String dividerSize2 = ref2.getDividerSize();
        double dividerPrice2 = ref2.getDividerPrice();

        System.out.println("Divider ID: " + dividerId2);
        System.out.println("Divider Type: " + dividerType2);
        System.out.println("Divider Material: " + dividerMaterial2);
        System.out.println("Divider Brand: " + dividerBrand2);
        System.out.println("Divider Usage: " + dividerUsage2);
        System.out.println("Divider Size: " + dividerSize2);
        System.out.println("Divider Price: " + dividerPrice2);
        System.out.println("\n");

        DividerDto ref3 = new DividerDto();
        ref3.setDividerId(3);
        ref3.setDividerType("Spring Divider");
        ref3.setDividerMaterial("Aluminum Alloy");
        ref3.setDividerBrand("Bosch");
        ref3.setDividerUsage("Precision Measuring & Marking");
        ref3.setDividerSize("10 inches");
        ref3.setDividerPrice(600.00);

        int dividerId3 = ref3.getDividerId();
        String dividerType3 = ref3.getDividerType();
        String dividerMaterial3 = ref3.getDividerMaterial();
        String dividerBrand3 = ref3.getDividerBrand();
        String dividerUsage3 = ref3.getDividerUsage();
        String dividerSize3 = ref3.getDividerSize();
        double dividerPrice3 = ref3.getDividerPrice();

        System.out.println("Divider ID: " + dividerId3);
        System.out.println("Divider Type: " + dividerType3);
        System.out.println("Divider Material: " + dividerMaterial3);
        System.out.println("Divider Brand: " + dividerBrand3);
        System.out.println("Divider Usage: " + dividerUsage3);
        System.out.println("Divider Size: " + dividerSize3);
        System.out.println("Divider Price: " + dividerPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
