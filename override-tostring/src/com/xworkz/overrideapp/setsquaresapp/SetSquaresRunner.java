package com.xworkz.overrideapp.setsquaresapp;

import com.xworkz.overrideapp.setsquaresapp.setsquares.SetSquaresDto;

public class SetSquaresRunner {
    public static void main(String[] args) {

        SetSquaresDto ref1 = new SetSquaresDto();
        ref1.setSetSquareId(1);
        ref1.setSetSquareType("45-Degree Set Square");
        ref1.setSetSquareMaterial("Plastic");
        ref1.setSetSquareBrand("Classmate");
        ref1.setSetSquareUsage("Geometry & Technical Drawing");
        ref1.setSetSquareAngle("45°");
        ref1.setSetSquarePrice(100.00);

        int setSquareId1 = ref1.getSetSquareId();
        String setSquareType1 = ref1.getSetSquareType();
        String setSquareMaterial1 = ref1.getSetSquareMaterial();
        String setSquareBrand1 = ref1.getSetSquareBrand();
        String setSquareUsage1 = ref1.getSetSquareUsage();
        String setSquareAngle1 = ref1.getSetSquareAngle();
        double setSquarePrice1 = ref1.getSetSquarePrice();

        System.out.println("SetSquare ID: " + setSquareId1);
        System.out.println("SetSquare Type: " + setSquareType1);
        System.out.println("SetSquare Material: " + setSquareMaterial1);
        System.out.println("SetSquare Brand: " + setSquareBrand1);
        System.out.println("SetSquare Usage: " + setSquareUsage1);
        System.out.println("SetSquare Angle: " + setSquareAngle1);
        System.out.println("SetSquare Price: " + setSquarePrice1);
        System.out.println("\n");

        SetSquaresDto ref2 = new SetSquaresDto();
        ref2.setSetSquareId(2);
        ref2.setSetSquareType("30/60-Degree Set Square");
        ref2.setSetSquareMaterial("Acrylic");
        ref2.setSetSquareBrand("Staedtler");
        ref2.setSetSquareUsage("Engineering & Precision Drawing");
        ref2.setSetSquareAngle("30°/60°");
        ref2.setSetSquarePrice(150.00);

        int setSquareId2 = ref2.getSetSquareId();
        String setSquareType2 = ref2.getSetSquareType();
        String setSquareMaterial2 = ref2.getSetSquareMaterial();
        String setSquareBrand2 = ref2.getSetSquareBrand();
        String setSquareUsage2 = ref2.getSetSquareUsage();
        String setSquareAngle2 = ref2.getSetSquareAngle();
        double setSquarePrice2 = ref2.getSetSquarePrice();

        System.out.println("SetSquare ID: " + setSquareId2);
        System.out.println("SetSquare Type: " + setSquareType2);
        System.out.println("SetSquare Material: " + setSquareMaterial2);
        System.out.println("SetSquare Brand: " + setSquareBrand2);
        System.out.println("SetSquare Usage: " + setSquareUsage2);
        System.out.println("SetSquare Angle: " + setSquareAngle2);
        System.out.println("SetSquare Price: " + setSquarePrice2);
        System.out.println("\n");

        SetSquaresDto ref3 = new SetSquaresDto();
        ref3.setSetSquareId(3);
        ref3.setSetSquareType("Adjustable Set Square");
        ref3.setSetSquareMaterial("Metal & Plastic Blend");
        ref3.setSetSquareBrand("Faber-Castell");
        ref3.setSetSquareUsage("Architectural & Custom Angle Drawing");
        ref3.setSetSquareAngle("Adjustable");
        ref3.setSetSquarePrice(250.00);

        int setSquareId3 = ref3.getSetSquareId();
        String setSquareType3 = ref3.getSetSquareType();
        String setSquareMaterial3 = ref3.getSetSquareMaterial();
        String setSquareBrand3 = ref3.getSetSquareBrand();
        String setSquareUsage3 = ref3.getSetSquareUsage();
        String setSquareAngle3 = ref3.getSetSquareAngle();
        double setSquarePrice3 = ref3.getSetSquarePrice();

        System.out.println("SetSquare ID: " + setSquareId3);
        System.out.println("SetSquare Type: " + setSquareType3);
        System.out.println("SetSquare Material: " + setSquareMaterial3);
        System.out.println("SetSquare Brand: " + setSquareBrand3);
        System.out.println("SetSquare Usage: " + setSquareUsage3);
        System.out.println("SetSquare Angle: " + setSquareAngle3);
        System.out.println("SetSquare Price: " + setSquarePrice3);
        System.out.println("\n");

        SetSquaresDto ref33 = new SetSquaresDto();
        ref33.setSetSquareId(3);
        ref33.setSetSquareType("Adjustable Set Square");
        ref33.setSetSquareMaterial("Metal & Plastic Blend");
        ref33.setSetSquareBrand("Faber-Castell");
        ref33.setSetSquareUsage("Architectural & Custom Angle Drawing");
        ref33.setSetSquareAngle("Adjustable");
        ref33.setSetSquarePrice(250.00);

        System.out.println(ref3.toString());
        System.out.println(ref33.equals(ref3));
        System.out.println(ref2.hashCode());
    }
}
