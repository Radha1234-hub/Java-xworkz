package com.xworkz.overrideapp.multimeterapp;

import com.xworkz.overrideapp.multimeterapp.multimeter.MultimeterDto;

public class MultimeterRunner {
    public static void main(String[] args) {

        MultimeterDto ref1 = new MultimeterDto();
        ref1.setMultimeterId(1);
        ref1.setMultimeterBrand("Fluke");
        ref1.setMultimeterType("Digital");
        ref1.setMultimeterMeasurement("Voltage, Current, Resistance");
        ref1.setMultimeterAccuracy("±0.5%");
        ref1.setMultimeterDisplay("LCD");
        ref1.setMultimeterPrice(8500.00);

        int multimeterId1 = ref1.getMultimeterId();
        String multimeterBrand1 = ref1.getMultimeterBrand();
        String multimeterType1 = ref1.getMultimeterType();
        String multimeterMeasurement1 = ref1.getMultimeterMeasurement();
        String multimeterAccuracy1 = ref1.getMultimeterAccuracy();
        String multimeterDisplay1 = ref1.getMultimeterDisplay();
        double multimeterPrice1 = ref1.getMultimeterPrice();

        System.out.println("Multimeter ID: " + multimeterId1);
        System.out.println("Multimeter Brand: " + multimeterBrand1);
        System.out.println("Multimeter Type: " + multimeterType1);
        System.out.println("Multimeter Measurement: " + multimeterMeasurement1);
        System.out.println("Multimeter Accuracy: " + multimeterAccuracy1);
        System.out.println("Multimeter Display: " + multimeterDisplay1);
        System.out.println("Multimeter Price: " + multimeterPrice1);
        System.out.println("\n");

        MultimeterDto ref2 = new MultimeterDto();
        ref2.setMultimeterId(2);
        ref2.setMultimeterBrand("Extech");
        ref2.setMultimeterType("Analog");
        ref2.setMultimeterMeasurement("Voltage, Current");
        ref2.setMultimeterAccuracy("±1.0%");
        ref2.setMultimeterDisplay("Analog Needle");
        ref2.setMultimeterPrice(4500.00);

        int multimeterId2 = ref2.getMultimeterId();
        String multimeterBrand2 = ref2.getMultimeterBrand();
        String multimeterType2 = ref2.getMultimeterType();
        String multimeterMeasurement2 = ref2.getMultimeterMeasurement();
        String multimeterAccuracy2 = ref2.getMultimeterAccuracy();
        String multimeterDisplay2 = ref2.getMultimeterDisplay();
        double multimeterPrice2 = ref2.getMultimeterPrice();

        System.out.println("Multimeter ID: " + multimeterId2);
        System.out.println("Multimeter Brand: " + multimeterBrand2);
        System.out.println("Multimeter Type: " + multimeterType2);
        System.out.println("Multimeter Measurement: " + multimeterMeasurement2);
        System.out.println("Multimeter Accuracy: " + multimeterAccuracy2);
        System.out.println("Multimeter Display: " + multimeterDisplay2);
        System.out.println("Multimeter Price: " + multimeterPrice2);
        System.out.println("\n");

        MultimeterDto ref3 = new MultimeterDto();
        ref3.setMultimeterId(3);
        ref3.setMultimeterBrand("Klein Tools");
        ref3.setMultimeterType("Auto-Ranging");
        ref3.setMultimeterMeasurement("Voltage, Capacitance, Frequency");
        ref3.setMultimeterAccuracy("±0.8%");
        ref3.setMultimeterDisplay("Backlit LCD");
        ref3.setMultimeterPrice(6000.00);

        int multimeterId3 = ref3.getMultimeterId();
        String multimeterBrand3 = ref3.getMultimeterBrand();
        String multimeterType3 = ref3.getMultimeterType();
        String multimeterMeasurement3 = ref3.getMultimeterMeasurement();
        String multimeterAccuracy3 = ref3.getMultimeterAccuracy();
        String multimeterDisplay3 = ref3.getMultimeterDisplay();
        double multimeterPrice3 = ref3.getMultimeterPrice();

        System.out.println("Multimeter ID: " + multimeterId3);
        System.out.println("Multimeter Brand: " + multimeterBrand3);
        System.out.println("Multimeter Type: " + multimeterType3);
        System.out.println("Multimeter Measurement: " + multimeterMeasurement3);
        System.out.println("Multimeter Accuracy: " + multimeterAccuracy3);
        System.out.println("Multimeter Display: " + multimeterDisplay3);
        System.out.println("Multimeter Price: " + multimeterPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
