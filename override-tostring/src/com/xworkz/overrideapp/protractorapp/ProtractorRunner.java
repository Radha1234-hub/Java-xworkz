package com.xworkz.overrideapp.protractorapp;

import com.xworkz.overrideapp.protractorapp.protractor.ProtractorDto;

public class ProtractorRunner {
    public static void main(String[] args) {

        ProtractorDto ref1 = new ProtractorDto();
        ref1.setProtractorId(1);
        ref1.setProtractorType("Half-Circle Protractor");
        ref1.setProtractorMaterial("Plastic");
        ref1.setProtractorBrand("Classmate");
        ref1.setProtractorUsage("Basic Angle Measurement");
        ref1.setProtractorDegreeRange("0° to 180°");
        ref1.setProtractorPrice(50.00);

        int protractorId1 = ref1.getProtractorId();
        String protractorType1 = ref1.getProtractorType();
        String protractorMaterial1 = ref1.getProtractorMaterial();
        String protractorBrand1 = ref1.getProtractorBrand();
        String protractorUsage1 = ref1.getProtractorUsage();
        String protractorDegreeRange1 = ref1.getProtractorDegreeRange();
        double protractorPrice1 = ref1.getProtractorPrice();

        System.out.println("Protractor ID: " + protractorId1);
        System.out.println("Protractor Type: " + protractorType1);
        System.out.println("Protractor Material: " + protractorMaterial1);
        System.out.println("Protractor Brand: " + protractorBrand1);
        System.out.println("Protractor Usage: " + protractorUsage1);
        System.out.println("Protractor Degree Range: " + protractorDegreeRange1);
        System.out.println("Protractor Price: " + protractorPrice1);
        System.out.println("\n");

        ProtractorDto ref2 = new ProtractorDto();
        ref2.setProtractorId(2);
        ref2.setProtractorType("Full-Circle Protractor");
        ref2.setProtractorMaterial("Metal");
        ref2.setProtractorBrand("Staedtler");
        ref2.setProtractorUsage("Engineering & Technical Drawings");
        ref2.setProtractorDegreeRange("0° to 360°");
        ref2.setProtractorPrice(150.00);

        int protractorId2 = ref2.getProtractorId();
        String protractorType2 = ref2.getProtractorType();
        String protractorMaterial2 = ref2.getProtractorMaterial();
        String protractorBrand2 = ref2.getProtractorBrand();
        String protractorUsage2 = ref2.getProtractorUsage();
        String protractorDegreeRange2 = ref2.getProtractorDegreeRange();
        double protractorPrice2 = ref2.getProtractorPrice();

        System.out.println("Protractor ID: " + protractorId2);
        System.out.println("Protractor Type: " + protractorType2);
        System.out.println("Protractor Material: " + protractorMaterial2);
        System.out.println("Protractor Brand: " + protractorBrand2);
        System.out.println("Protractor Usage: " + protractorUsage2);
        System.out.println("Protractor Degree Range: " + protractorDegreeRange2);
        System.out.println("Protractor Price: " + protractorPrice2);
        System.out.println("\n");

        ProtractorDto ref3 = new ProtractorDto();
        ref3.setProtractorId(3);
        ref3.setProtractorType("Digital Protractor");
        ref3.setProtractorMaterial("Aluminum Alloy");
        ref3.setProtractorBrand("Bosch");
        ref3.setProtractorUsage("Precision Angle Measurement");
        ref3.setProtractorDegreeRange("0° to 180°");
        ref3.setProtractorPrice(1200.00);

        int protractorId3 = ref3.getProtractorId();
        String protractorType3 = ref3.getProtractorType();
        String protractorMaterial3 = ref3.getProtractorMaterial();
        String protractorBrand3 = ref3.getProtractorBrand();
        String protractorUsage3 = ref3.getProtractorUsage();
        String protractorDegreeRange3 = ref3.getProtractorDegreeRange();
        double protractorPrice3 = ref3.getProtractorPrice();

        System.out.println("Protractor ID: " + protractorId3);
        System.out.println("Protractor Type: " + protractorType3);
        System.out.println("Protractor Material: " + protractorMaterial3);
        System.out.println("Protractor Brand: " + protractorBrand3);
        System.out.println("Protractor Usage: " + protractorUsage3);
        System.out.println("Protractor Degree Range: " + protractorDegreeRange3);
        System.out.println("Protractor Price: " + protractorPrice3);
        System.out.println("\n");

        ProtractorDto ref33 = new ProtractorDto();
        ref33.setProtractorId(3);
        ref33.setProtractorType("Digital Protractor");
        ref33.setProtractorMaterial("Aluminum Alloy");
        ref33.setProtractorBrand("Bosch");
        ref33.setProtractorUsage("Precision Angle Measurement");
        ref33.setProtractorDegreeRange("0° to 180°");
        ref33.setProtractorPrice(1200.00);




        System.out.println(ref3.toString());
        System.out.println(ref33.equals(ref3));
        System.out.println(ref1.hashCode());
    }
}
