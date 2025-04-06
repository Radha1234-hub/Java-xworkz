package com.xworkz.steelapp;

import com.xworkz.steelapp.steel.Steel;

public class SteelRunner {

    public static void main(String[] args) {

        // 1
        Steel ref1 = new Steel();
        ref1.setSteelId(1);
        ref1.setSteelType("Carbon Steel");
        ref1.setSteelGrade("A36");
        ref1.setSteelLength(200.5);
        ref1.setSteelWidth(100.3);
        ref1.setSteelThickness(10.2);
        ref1.setSteelApplication("Construction");

        int steelId1 = ref1.getSteelId();
        String steelType1 = ref1.getSteelType();
        String steelGrade1 = ref1.getSteelGrade();
        double steelLength1 = ref1.getSteelLength();
        double steelWidth1 = ref1.getSteelWidth();
        double steelThickness1 = ref1.getSteelThickness();
        String steelApplication1 = ref1.getSteelApplication();

        System.out.println("Steel ID: " + steelId1);
        System.out.println("Steel Type: " + steelType1);
        System.out.println("Steel Grade: " + steelGrade1);
        System.out.println("Steel Length: " + steelLength1);
        System.out.println("Steel Width: " + steelWidth1);
        System.out.println("Steel Thickness: " + steelThickness1);
        System.out.println("Steel Application: " + steelApplication1);
        System.out.println("\n");

        // 2
        Steel ref2 = new Steel();
        ref2.setSteelId(2);
        ref2.setSteelType("Stainless Steel");
        ref2.setSteelGrade("304");
        ref2.setSteelLength(150.75);
        ref2.setSteelWidth(75.25);
        ref2.setSteelThickness(8.5);
        ref2.setSteelApplication("Kitchenware");

        int steelId2 = ref2.getSteelId();
        String steelType2 = ref2.getSteelType();
        String steelGrade2 = ref2.getSteelGrade();
        double steelLength2 = ref2.getSteelLength();
        double steelWidth2 = ref2.getSteelWidth();
        double steelThickness2 = ref2.getSteelThickness();
        String steelApplication2 = ref2.getSteelApplication();

        System.out.println("Steel ID: " + steelId2);
        System.out.println("Steel Type: " + steelType2);
        System.out.println("Steel Grade: " + steelGrade2);
        System.out.println("Steel Length: " + steelLength2);
        System.out.println("Steel Width: " + steelWidth2);
        System.out.println("Steel Thickness: " + steelThickness2);
        System.out.println("Steel Application: " + steelApplication2);
        System.out.println("\n");

        // 3
        Steel ref3 = new Steel();
        ref3.setSteelId(3);
        ref3.setSteelType("Alloy Steel");
        ref3.setSteelGrade("4340");
        ref3.setSteelLength(300.0);
        ref3.setSteelWidth(150.0);
        ref3.setSteelThickness(12.7);
        ref3.setSteelApplication("Automotive Parts");

        int steelId3 = ref3.getSteelId();
        String steelType3 = ref3.getSteelType();
        String steelGrade3 = ref3.getSteelGrade();
        double steelLength3 = ref3.getSteelLength();
        double steelWidth3 = ref3.getSteelWidth();
        double steelThickness3 = ref3.getSteelThickness();
        String steelApplication3 = ref3.getSteelApplication();

        System.out.println("Steel ID: " + steelId3);
        System.out.println("Steel Type: " + steelType3);
        System.out.println("Steel Grade: " + steelGrade3);
        System.out.println("Steel Length: " + steelLength3);
        System.out.println("Steel Width: " + steelWidth3);
        System.out.println("Steel Thickness: " + steelThickness3);
        System.out.println("Steel Application: " + steelApplication3);
        System.out.println("\n");

        // 4
        Steel ref4 = new Steel();
        ref4.setSteelId(4);
        ref4.setSteelType("Tool Steel");
        ref4.setSteelGrade("D2");
        ref4.setSteelLength(250.45);
        ref4.setSteelWidth(120.6);
        ref4.setSteelThickness(15.0);
        ref4.setSteelApplication("Cutting Tools");

        int steelId4 = ref4.getSteelId();
        String steelType4 = ref4.getSteelType();
        String steelGrade4 = ref4.getSteelGrade();
        double steelLength4 = ref4.getSteelLength();
        double steelWidth4 = ref4.getSteelWidth();
        double steelThickness4 = ref4.getSteelThickness();
        String steelApplication4 = ref4.getSteelApplication();

        System.out.println("Steel ID: " + steelId4);
        System.out.println("Steel Type: " + steelType4);
        System.out.println("Steel Grade: " + steelGrade4);
        System.out.println("Steel Length: " + steelLength4);
        System.out.println("Steel Width: " + steelWidth4);
        System.out.println("Steel Thickness: " + steelThickness4);
        System.out.println("Steel Application: " + steelApplication4);
        System.out.println("\n");

        // 5
        Steel ref5 = new Steel();
        ref5.setSteelId(5);
        ref5.setSteelType("Galvanized Steel");
        ref5.setSteelGrade("G90");
        ref5.setSteelLength(180.5);
        ref5.setSteelWidth(90.2);
        ref5.setSteelThickness(5.5);
        ref5.setSteelApplication("Roofing Sheets");

        int steelId5 = ref5.getSteelId();
        String steelType5 = ref5.getSteelType();
        String steelGrade5 = ref5.getSteelGrade();
        double steelLength5 = ref5.getSteelLength();
        double steelWidth5 = ref5.getSteelWidth();
        double steelThickness5 = ref5.getSteelThickness();
        String steelApplication5 = ref5.getSteelApplication();

        System.out.println("Steel ID: " + steelId5);
        System.out.println("Steel Type: " + steelType5);
        System.out.println("Steel Grade: " + steelGrade5);
        System.out.println("Steel Length: " + steelLength5);
        System.out.println("Steel Width: " + steelWidth5);
        System.out.println("Steel Thickness: " + steelThickness5);
        System.out.println("Steel Application: " + steelApplication5);
        System.out.println("\n");
    }
}
