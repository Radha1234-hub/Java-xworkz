package com.xworkz.overrideapp.compassapp;
import com.xworkz.overrideapp.compassapp.compass.CompassDto;

public class CompassRunner {

    public static void main(String[] args) {

        CompassDto ref1 = new CompassDto();
        ref1.setCompassId(1);
        ref1.setCompassType("Magnetic Compass");
        ref1.setCompassMaterial("Brass");
        ref1.setCompassBrand("Silva");
        ref1.setCompassUsage("Navigation & Orienteering");
        ref1.setCompassSize("2 inches");
        ref1.setCompassPrice(800.00);

        int compassId1 = ref1.getCompassId();
        String compassType1 = ref1.getCompassType();
        String compassMaterial1 = ref1.getCompassMaterial();
        String compassBrand1 = ref1.getCompassBrand();
        String compassUsage1 = ref1.getCompassUsage();
        String compassSize1 = ref1.getCompassSize();
        double compassPrice1 = ref1.getCompassPrice();

        System.out.println("Compass ID: " + compassId1);
        System.out.println("Compass Type: " + compassType1);
        System.out.println("Compass Material: " + compassMaterial1);
        System.out.println("Compass Brand: " + compassBrand1);
        System.out.println("Compass Usage: " + compassUsage1);
        System.out.println("Compass Size: " + compassSize1);
        System.out.println("Compass Price: " + compassPrice1);
        System.out.println("\n");

        CompassDto ref2 = new CompassDto();
        ref2.setCompassId(2);
        ref2.setCompassType("Drawing Compass");
        ref2.setCompassMaterial("Stainless Steel");
        ref2.setCompassBrand("Staedtler");
        ref2.setCompassUsage("Technical Drawing & Geometry");
        ref2.setCompassSize("6 inches");
        ref2.setCompassPrice(400.00);

        int compassId2 = ref2.getCompassId();
        String compassType2 = ref2.getCompassType();
        String compassMaterial2 = ref2.getCompassMaterial();
        String compassBrand2 = ref2.getCompassBrand();
        String compassUsage2 = ref2.getCompassUsage();
        String compassSize2 = ref2.getCompassSize();
        double compassPrice2 = ref2.getCompassPrice();

        System.out.println("Compass ID: " + compassId2);
        System.out.println("Compass Type: " + compassType2);
        System.out.println("Compass Material: " + compassMaterial2);
        System.out.println("Compass Brand: " + compassBrand2);
        System.out.println("Compass Usage: " + compassUsage2);
        System.out.println("Compass Size: " + compassSize2);
        System.out.println("Compass Price: " + compassPrice2);
        System.out.println("\n");

        CompassDto ref3 = new CompassDto();
        ref3.setCompassId(3);
        ref3.setCompassType("Military Lensatic Compass");
        ref3.setCompassMaterial("Aluminum Alloy");
        ref3.setCompassBrand("Brunton");
        ref3.setCompassUsage("Survival & Tactical Navigation");
        ref3.setCompassSize("3 inches");
        ref3.setCompassPrice(1200.00);

        int compassId3 = ref3.getCompassId();
        String compassType3 = ref3.getCompassType();
        String compassMaterial3 = ref3.getCompassMaterial();
        String compassBrand3 = ref3.getCompassBrand();
        String compassUsage3 = ref3.getCompassUsage();
        String compassSize3 = ref3.getCompassSize();
        double compassPrice3 = ref3.getCompassPrice();

        System.out.println("Compass ID: " + compassId3);
        System.out.println("Compass Type: " + compassType3);
        System.out.println("Compass Material: " + compassMaterial3);
        System.out.println("Compass Brand: " + compassBrand3);
        System.out.println("Compass Usage: " + compassUsage3);
        System.out.println("Compass Size: " + compassSize3);
        System.out.println("Compass Price: " + compassPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
