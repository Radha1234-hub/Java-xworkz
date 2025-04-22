package com.xworkz.overrideapp.wrenchesapp;

import com.xworkz.overrideapp.wrenchesapp.wrenches.WrenchesDto;

public class WrenchesRunner {
    public static void main(String[] args) {

        WrenchesDto ref1 = new WrenchesDto();
        ref1.setWrenchId(1);
        ref1.setWrenchType("Adjustable Wrench");
        ref1.setWrenchMaterial("Chrome Vanadium Steel");
        ref1.setWrenchBrand("Stanley");
        ref1.setWrenchUsage("Multipurpose");
        ref1.setWrenchSize("8-inch");
        ref1.setWrenchPrice(500.00);

        int wrenchId1 = ref1.getWrenchId();
        String wrenchType1 = ref1.getWrenchType();
        String wrenchMaterial1 = ref1.getWrenchMaterial();
        String wrenchBrand1 = ref1.getWrenchBrand();
        String wrenchUsage1 = ref1.getWrenchUsage();
        String wrenchSize1 = ref1.getWrenchSize();
        double wrenchPrice1 = ref1.getWrenchPrice();

        System.out.println("Wrench ID: " + wrenchId1);
        System.out.println("Wrench Type: " + wrenchType1);
        System.out.println("Wrench Material: " + wrenchMaterial1);
        System.out.println("Wrench Brand: " + wrenchBrand1);
        System.out.println("Wrench Usage: " + wrenchUsage1);
        System.out.println("Wrench Size: " + wrenchSize1);
        System.out.println("Wrench Price: " + wrenchPrice1);
        System.out.println("\n");

        WrenchesDto ref2 = new WrenchesDto();
        ref2.setWrenchId(2);
        ref2.setWrenchType("Pipe Wrench");
        ref2.setWrenchMaterial("Cast Iron");
        ref2.setWrenchBrand("RIDGID");
        ref2.setWrenchUsage("Plumbing");
        ref2.setWrenchSize("14-inch");
        ref2.setWrenchPrice(1200.00);

        int wrenchId2 = ref2.getWrenchId();
        String wrenchType2 = ref2.getWrenchType();
        String wrenchMaterial2 = ref2.getWrenchMaterial();
        String wrenchBrand2 = ref2.getWrenchBrand();
        String wrenchUsage2 = ref2.getWrenchUsage();
        String wrenchSize2 = ref2.getWrenchSize();
        double wrenchPrice2 = ref2.getWrenchPrice();

        System.out.println("Wrench ID: " + wrenchId2);
        System.out.println("Wrench Type: " + wrenchType2);
        System.out.println("Wrench Material: " + wrenchMaterial2);
        System.out.println("Wrench Brand: " + wrenchBrand2);
        System.out.println("Wrench Usage: " + wrenchUsage2);
        System.out.println("Wrench Size: " + wrenchSize2);
        System.out.println("Wrench Price: " + wrenchPrice2);
        System.out.println("\n");

        WrenchesDto ref3 = new WrenchesDto();
        ref3.setWrenchId(3);
        ref3.setWrenchType("Torque Wrench");
        ref3.setWrenchMaterial("Alloy Steel");
        ref3.setWrenchBrand("Tekton");
        ref3.setWrenchUsage("Automotive");
        ref3.setWrenchSize("10-inch");
        ref3.setWrenchPrice(3500.00);

        int wrenchId3 = ref3.getWrenchId();
        String wrenchType3 = ref3.getWrenchType();
        String wrenchMaterial3 = ref3.getWrenchMaterial();
        String wrenchBrand3 = ref3.getWrenchBrand();
        String wrenchUsage3 = ref3.getWrenchUsage();
        String wrenchSize3 = ref3.getWrenchSize();
        double wrenchPrice3 = ref3.getWrenchPrice();

        System.out.println("Wrench ID: " + wrenchId3);
        System.out.println("Wrench Type: " + wrenchType3);
        System.out.println("Wrench Material: " + wrenchMaterial3);
        System.out.println("Wrench Brand: " + wrenchBrand3);
        System.out.println("Wrench Usage: " + wrenchUsage3);
        System.out.println("Wrench Size: " + wrenchSize3);
        System.out.println("Wrench Price: " + wrenchPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
