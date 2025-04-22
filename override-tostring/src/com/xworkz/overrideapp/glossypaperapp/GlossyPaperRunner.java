package com.xworkz.overrideapp.glossypaperapp;

import com.xworkz.overrideapp.glossypaperapp.glossypaper.GlossyPaperDto;

public class GlossyPaperRunner {
    public static void main(String[] args) {

        GlossyPaperDto ref1 = new GlossyPaperDto();
        ref1.setPaperId(1);
        ref1.setPaperType("Photo Glossy");
        ref1.setPaperFinish("High-Gloss");
        ref1.setPaperWeight("250 gsm");
        ref1.setPaperUsage("Photographic Prints");
        ref1.setPaperSize("A4");
        ref1.setPaperPrice(500.00);

        int paperId1 = ref1.getPaperId();
        String paperType1 = ref1.getPaperType();
        String paperFinish1 = ref1.getPaperFinish();
        String paperWeight1 = ref1.getPaperWeight();
        String paperUsage1 = ref1.getPaperUsage();
        String paperSize1 = ref1.getPaperSize();
        double paperPrice1 = ref1.getPaperPrice();

        System.out.println("Paper ID: " + paperId1);
        System.out.println("Paper Type: " + paperType1);
        System.out.println("Paper Finish: " + paperFinish1);
        System.out.println("Paper Weight: " + paperWeight1);
        System.out.println("Paper Usage: " + paperUsage1);
        System.out.println("Paper Size: " + paperSize1);
        System.out.println("Paper Price: " + paperPrice1);
        System.out.println("\n");

        GlossyPaperDto ref2 = new GlossyPaperDto();
        ref2.setPaperId(2);
        ref2.setPaperType("Matte Glossy");
        ref2.setPaperFinish("Semi-Gloss");
        ref2.setPaperWeight("200 gsm");
        ref2.setPaperUsage("Marketing Brochures");
        ref2.setPaperSize("Letter");
        ref2.setPaperPrice(450.00);

        int paperId2 = ref2.getPaperId();
        String paperType2 = ref2.getPaperType();
        String paperFinish2 = ref2.getPaperFinish();
        String paperWeight2 = ref2.getPaperWeight();
        String paperUsage2 = ref2.getPaperUsage();
        String paperSize2 = ref2.getPaperSize();
        double paperPrice2 = ref2.getPaperPrice();

        System.out.println("Paper ID: " + paperId2);
        System.out.println("Paper Type: " + paperType2);
        System.out.println("Paper Finish: " + paperFinish2);
        System.out.println("Paper Weight: " + paperWeight2);
        System.out.println("Paper Usage: " + paperUsage2);
        System.out.println("Paper Size: " + paperSize2);
        System.out.println("Paper Price: " + paperPrice2);
        System.out.println("\n");

        GlossyPaperDto ref3 = new GlossyPaperDto();
        ref3.setPaperId(3);
        ref3.setPaperType("Silk Glossy");
        ref3.setPaperFinish("Soft Silk Finish");
        ref3.setPaperWeight("180 gsm");
        ref3.setPaperUsage("Magazine & Catalog Printing");
        ref3.setPaperSize("Legal");
        ref3.setPaperPrice(400.00);

        int paperId3 = ref3.getPaperId();
        String paperType3 = ref3.getPaperType();
        String paperFinish3 = ref3.getPaperFinish();
        String paperWeight3 = ref3.getPaperWeight();
        String paperUsage3 = ref3.getPaperUsage();
        String paperSize3 = ref3.getPaperSize();
        double paperPrice3 = ref3.getPaperPrice();

        System.out.println("Paper ID: " + paperId3);
        System.out.println("Paper Type: " + paperType3);
        System.out.println("Paper Finish: " + paperFinish3);
        System.out.println("Paper Weight: " + paperWeight3);
        System.out.println("Paper Usage: " + paperUsage3);
        System.out.println("Paper Size: " + paperSize3);
        System.out.println("Paper Price: " + paperPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
