package com.xworkz.overrideapp.parchmentpaperapp;

import com.xworkz.overrideapp.parchmentpaperapp.parchmentpaper.ParchmentPaperDto;

public class ParchmentPaperRunner {
    public static void main(String[] args) {

        ParchmentPaperDto ref1 = new ParchmentPaperDto();
        ref1.setPaperId(1);
        ref1.setPaperType("Baking Parchment");
        ref1.setPaperMaterial("Silicone-Coated Paper");
        ref1.setPaperUsage("Non-Stick Baking");
        ref1.setPaperCoating("Silicone");
        ref1.setPaperSize("12x16 inches");
        ref1.setPaperPrice(250.00);

        int paperId1 = ref1.getPaperId();
        String paperType1 = ref1.getPaperType();
        String paperMaterial1 = ref1.getPaperMaterial();
        String paperUsage1 = ref1.getPaperUsage();
        String paperCoating1 = ref1.getPaperCoating();
        String paperSize1 = ref1.getPaperSize();
        double paperPrice1 = ref1.getPaperPrice();

        System.out.println("Paper ID: " + paperId1);
        System.out.println("Paper Type: " + paperType1);
        System.out.println("Paper Material: " + paperMaterial1);
        System.out.println("Paper Usage: " + paperUsage1);
        System.out.println("Paper Coating: " + paperCoating1);
        System.out.println("Paper Size: " + paperSize1);
        System.out.println("Paper Price: " + paperPrice1);
        System.out.println("\n");

        ParchmentPaperDto ref2 = new ParchmentPaperDto();
        ref2.setPaperId(2);
        ref2.setPaperType("Craft Parchment");
        ref2.setPaperMaterial("Vegetable Treated Paper");
        ref2.setPaperUsage("Arts & Crafts");
        ref2.setPaperCoating("None");
        ref2.setPaperSize("A4");
        ref2.setPaperPrice(150.00);

        int paperId2 = ref2.getPaperId();
        String paperType2 = ref2.getPaperType();
        String paperMaterial2 = ref2.getPaperMaterial();
        String paperUsage2 = ref2.getPaperUsage();
        String paperCoating2 = ref2.getPaperCoating();
        String paperSize2 = ref2.getPaperSize();
        double paperPrice2 = ref2.getPaperPrice();

        System.out.println("Paper ID: " + paperId2);
        System.out.println("Paper Type: " + paperType2);
        System.out.println("Paper Material: " + paperMaterial2);
        System.out.println("Paper Usage: " + paperUsage2);
        System.out.println("Paper Coating: " + paperCoating2);
        System.out.println("Paper Size: " + paperSize2);
        System.out.println("Paper Price: " + paperPrice2);
        System.out.println("\n");

        ParchmentPaperDto ref3 = new ParchmentPaperDto();
        ref3.setPaperId(3);
        ref3.setPaperType("Calligraphy Parchment");
        ref3.setPaperMaterial("Aged Fiber Paper");
        ref3.setPaperUsage("Historical Documents & Writing");
        ref3.setPaperCoating("Wax Finish");
        ref3.setPaperSize("Letter");
        ref3.setPaperPrice(300.00);

        int paperId3 = ref3.getPaperId();
        String paperType3 = ref3.getPaperType();
        String paperMaterial3 = ref3.getPaperMaterial();
        String paperUsage3 = ref3.getPaperUsage();
        String paperCoating3 = ref3.getPaperCoating();
        String paperSize3 = ref3.getPaperSize();
        double paperPrice3 = ref3.getPaperPrice();

        System.out.println("Paper ID: " + paperId3);
        System.out.println("Paper Type: " + paperType3);
        System.out.println("Paper Material: " + paperMaterial3);
        System.out.println("Paper Usage: " + paperUsage3);
        System.out.println("Paper Coating: " + paperCoating3);
        System.out.println("Paper Size: " + paperSize3);
        System.out.println("Paper Price: " + paperPrice3);
        System.out.println("\n");

        ParchmentPaperDto ref22 = new ParchmentPaperDto();
        ref22.setPaperId(2);
        ref22.setPaperType("Craft Parchment");
        ref22.setPaperMaterial("Vegetable Treated Paper");
        ref22.setPaperUsage("Arts & Crafts");
        ref22.setPaperCoating("None");
        ref22.setPaperSize("A4");
        ref22.setPaperPrice(150.00);

        System.out.println(ref3.toString());
        System.out.println(ref22.equals(ref2));
        System.out.println(ref3.hashCode());
    }
}
