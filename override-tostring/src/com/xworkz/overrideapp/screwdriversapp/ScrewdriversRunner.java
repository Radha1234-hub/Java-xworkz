package com.xworkz.overrideapp.screwdriversapp;

import com.xworkz.overrideapp.screwdriversapp.screwdrivers.ScrewdriversDto;

public class ScrewdriversRunner {
    public static void main(String[] args) {

        ScrewdriversDto ref1 = new ScrewdriversDto();
        ref1.setScrewdriverId(1);
        ref1.setScrewdriverType("Flathead");
        ref1.setScrewdriverMaterial("Steel");
        ref1.setScrewdriverBrand("Stanley");
        ref1.setScrewdriverUsage("General Purpose");
        ref1.setScrewdriverSize("6-inch");
        ref1.setScrewdriverPrice(250.00);

        int screwdriverId1 = ref1.getScrewdriverId();
        String screwdriverType1 = ref1.getScrewdriverType();
        String screwdriverMaterial1 = ref1.getScrewdriverMaterial();
        String screwdriverBrand1 = ref1.getScrewdriverBrand();
        String screwdriverUsage1 = ref1.getScrewdriverUsage();
        String screwdriverSize1 = ref1.getScrewdriverSize();
        double screwdriverPrice1 = ref1.getScrewdriverPrice();

        System.out.println("Screwdriver ID: " + screwdriverId1);
        System.out.println("Screwdriver Type: " + screwdriverType1);
        System.out.println("Screwdriver Material: " + screwdriverMaterial1);
        System.out.println("Screwdriver Brand: " + screwdriverBrand1);
        System.out.println("Screwdriver Usage: " + screwdriverUsage1);
        System.out.println("Screwdriver Size: " + screwdriverSize1);
        System.out.println("Screwdriver Price: " + screwdriverPrice1);
        System.out.println("\n");

        ScrewdriversDto ref2 = new ScrewdriversDto();
        ref2.setScrewdriverId(2);
        ref2.setScrewdriverType("Phillips");
        ref2.setScrewdriverMaterial("Chromium-Vanadium");
        ref2.setScrewdriverBrand("Bosch");
        ref2.setScrewdriverUsage("Electronics & Assembly");
        ref2.setScrewdriverSize("5-inch");
        ref2.setScrewdriverPrice(300.00);

        int screwdriverId2 = ref2.getScrewdriverId();
        String screwdriverType2 = ref2.getScrewdriverType();
        String screwdriverMaterial2 = ref2.getScrewdriverMaterial();
        String screwdriverBrand2 = ref2.getScrewdriverBrand();
        String screwdriverUsage2 = ref2.getScrewdriverUsage();
        String screwdriverSize2 = ref2.getScrewdriverSize();
        double screwdriverPrice2 = ref2.getScrewdriverPrice();

        System.out.println("Screwdriver ID: " + screwdriverId2);
        System.out.println("Screwdriver Type: " + screwdriverType2);
        System.out.println("Screwdriver Material: " + screwdriverMaterial2);
        System.out.println("Screwdriver Brand: " + screwdriverBrand2);
        System.out.println("Screwdriver Usage: " + screwdriverUsage2);
        System.out.println("Screwdriver Size: " + screwdriverSize2);
        System.out.println("Screwdriver Price: " + screwdriverPrice2);
        System.out.println("\n");

        ScrewdriversDto ref3 = new ScrewdriversDto();
        ref3.setScrewdriverId(3);
        ref3.setScrewdriverType("Torx");
        ref3.setScrewdriverMaterial("High-Carbon Steel");
        ref3.setScrewdriverBrand("Wiha");
        ref3.setScrewdriverUsage("Automotive & Machinery");
        ref3.setScrewdriverSize("8-inch");
        ref3.setScrewdriverPrice(450.00);

        int screwdriverId3 = ref3.getScrewdriverId();
        String screwdriverType3 = ref3.getScrewdriverType();
        String screwdriverMaterial3 = ref3.getScrewdriverMaterial();
        String screwdriverBrand3 = ref3.getScrewdriverBrand();
        String screwdriverUsage3 = ref3.getScrewdriverUsage();
        String screwdriverSize3 = ref3.getScrewdriverSize();
        double screwdriverPrice3 = ref3.getScrewdriverPrice();

        System.out.println("Screwdriver ID: " + screwdriverId3);
        System.out.println("Screwdriver Type: " + screwdriverType3);
        System.out.println("Screwdriver Material: " + screwdriverMaterial3);
        System.out.println("Screwdriver Brand: " + screwdriverBrand3);
        System.out.println("Screwdriver Usage: " + screwdriverUsage3);
        System.out.println("Screwdriver Size: " + screwdriverSize3);
        System.out.println("Screwdriver Price: " + screwdriverPrice3);
        System.out.println("\n");

        ScrewdriversDto ref11 = new ScrewdriversDto();
        ref11.setScrewdriverId(1);
        ref11.setScrewdriverType("Flathead");
        ref11.setScrewdriverMaterial("Steel");
        ref11.setScrewdriverBrand("Stanley");
        ref11.setScrewdriverUsage("General Purpose");
        ref11.setScrewdriverSize("6-inch");
        ref11.setScrewdriverPrice(250.00);

        System.out.println(ref3.toString());
        System.out.println(ref11.equals(ref1));
        System.out.println(ref11.hashCode());
    }
}
