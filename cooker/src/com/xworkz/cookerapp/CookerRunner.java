package com.xworkz.cookerapp;

import com.xworkz.cookerapp.cooker.Cooker;

public class CookerRunner {

    public static void main(String[] args) {

        // 1
        Cooker ref1 = new Cooker();
        ref1.setCookerId(1);
        ref1.setCookerBrand("Prestige");
        ref1.setCookerType("Pressure Cooker");
        ref1.setCookerCapacity(5);
        ref1.setCookerMaterial("Stainless Steel");
        ref1.setCookerWarranty("5 Years");
        ref1.setCookerPressureLevel(15);
        ref1.setCookerSafetyFeatures("Gasket Release System, Metallic Safety Plug");

        int cookerId1 = ref1.getCookerId();
        String cookerBrand1 = ref1.getCookerBrand();
        String cookerType1 = ref1.getCookerType();
        int cookerCapacity1 = ref1.getCookerCapacity();
        String cookerMaterial1 = ref1.getCookerMaterial();
        String cookerWarranty1 = ref1.getCookerWarranty();
        int cookerPressureLevel1 = ref1.getCookerPressureLevel();
        String cookerSafetyFeatures1 = ref1.getCookerSafetyFeatures();

        System.out.println("Cooker ID: " + cookerId1);
        System.out.println("Cooker Brand: " + cookerBrand1);
        System.out.println("Cooker Type: " + cookerType1);
        System.out.println("Cooker Capacity: " + cookerCapacity1 + " liters");
        System.out.println("Cooker Material: " + cookerMaterial1);
        System.out.println("Cooker Warranty: " + cookerWarranty1);
        System.out.println("Cooker Pressure Level: " + cookerPressureLevel1 + " psi");
        System.out.println("Cooker Safety Features: " + cookerSafetyFeatures1);
        System.out.println("\n");

        // 2
        Cooker ref2 = new Cooker();
        ref2.setCookerId(2);
        ref2.setCookerBrand("Hawkins");
        ref2.setCookerType("Induction Base Cooker");
        ref2.setCookerCapacity(3);
        ref2.setCookerMaterial("Aluminium");
        ref2.setCookerWarranty("2 Years");
        ref2.setCookerPressureLevel(12);
        ref2.setCookerSafetyFeatures("Pressure-Locked Safety Lid");

        int cookerId2 = ref2.getCookerId();
        String cookerBrand2 = ref2.getCookerBrand();
        String cookerType2 = ref2.getCookerType();
        int cookerCapacity2 = ref2.getCookerCapacity();
        String cookerMaterial2 = ref2.getCookerMaterial();
        String cookerWarranty2 = ref2.getCookerWarranty();
        int cookerPressureLevel2 = ref2.getCookerPressureLevel();
        String cookerSafetyFeatures2 = ref2.getCookerSafetyFeatures();

        System.out.println("Cooker ID: " + cookerId2);
        System.out.println("Cooker Brand: " + cookerBrand2);
        System.out.println("Cooker Type: " + cookerType2);
        System.out.println("Cooker Capacity: " + cookerCapacity2 + " liters");
        System.out.println("Cooker Material: " + cookerMaterial2);
        System.out.println("Cooker Warranty: " + cookerWarranty2);
        System.out.println("Cooker Pressure Level: " + cookerPressureLevel2 + " psi");
        System.out.println("Cooker Safety Features: " + cookerSafetyFeatures2);
        System.out.println("\n");

        // 3
        Cooker ref3 = new Cooker();
        ref3.setCookerId(3);
        ref3.setCookerBrand("Butterfly");
        ref3.setCookerType("Handi Cooker");
        ref3.setCookerCapacity(2);
        ref3.setCookerMaterial("Stainless Steel");
        ref3.setCookerWarranty("3 Years");
        ref3.setCookerPressureLevel(10);
        ref3.setCookerSafetyFeatures("Precision Weight Valve");

        int cookerId3 = ref3.getCookerId();
        String cookerBrand3 = ref3.getCookerBrand();
        String cookerType3 = ref3.getCookerType();
        int cookerCapacity3 = ref3.getCookerCapacity();
        String cookerMaterial3 = ref3.getCookerMaterial();
        String cookerWarranty3 = ref3.getCookerWarranty();
        int cookerPressureLevel3 = ref3.getCookerPressureLevel();
        String cookerSafetyFeatures3 = ref3.getCookerSafetyFeatures();

        System.out.println("Cooker ID: " + cookerId3);
        System.out.println("Cooker Brand: " + cookerBrand3);
        System.out.println("Cooker Type: " + cookerType3);
        System.out.println("Cooker Capacity: " + cookerCapacity3 + " liters");
        System.out.println("Cooker Material: " + cookerMaterial3);
        System.out.println("Cooker Warranty: " + cookerWarranty3);
        System.out.println("Cooker Pressure Level: " + cookerPressureLevel3 + " psi");
        System.out.println("Cooker Safety Features: " + cookerSafetyFeatures3);
        System.out.println("\n");

        // 4
        Cooker ref4 = new Cooker();
        ref4.setCookerId(4);
        ref4.setCookerBrand("Prestige");
        ref4.setCookerType("Electric Rice Cooker");
        ref4.setCookerCapacity(1);
        ref4.setCookerMaterial("Plastic");
        ref4.setCookerWarranty("1 Year");
        ref4.setCookerPressureLevel(0); // No pressure for electric rice cookers
        ref4.setCookerSafetyFeatures("Auto-Cut Off");

        int cookerId4 = ref4.getCookerId();
        String cookerBrand4 = ref4.getCookerBrand();
        String cookerType4 = ref4.getCookerType();
        int cookerCapacity4 = ref4.getCookerCapacity();
        String cookerMaterial4 = ref4.getCookerMaterial();
        String cookerWarranty4 = ref4.getCookerWarranty();
        int cookerPressureLevel4 = ref4.getCookerPressureLevel();
        String cookerSafetyFeatures4 = ref4.getCookerSafetyFeatures();

        System.out.println("Cooker ID: " + cookerId4);
        System.out.println("Cooker Brand: " + cookerBrand4);
        System.out.println("Cooker Type: " + cookerType4);
        System.out.println("Cooker Capacity: " + cookerCapacity4 + " liters");
        System.out.println("Cooker Material: " + cookerMaterial4);
        System.out.println("Cooker Warranty: " + cookerWarranty4);
        System.out.println("Cooker Pressure Level: " + cookerPressureLevel4 + " psi");
        System.out.println("Cooker Safety Features: " + cookerSafetyFeatures4);
        System.out.println("\n");

        // 5
        Cooker ref5 = new Cooker();
        ref5.setCookerId(5);
        ref5.setCookerBrand("Pigeon");
        ref5.setCookerType("Outer Lid Cooker");
        ref5.setCookerCapacity(7);
        ref5.setCookerMaterial("Hard-Anodized Aluminium");
        ref5.setCookerWarranty("5 Years");
        ref5.setCookerPressureLevel(20);
        ref5.setCookerSafetyFeatures("Anti-Bulge Base, Precision Weight Valve");

        int cookerId5 = ref5.getCookerId();
        String cookerBrand5 = ref5.getCookerBrand();
        String cookerType5 = ref5.getCookerType();
        int cookerCapacity5 = ref5.getCookerCapacity();
        String cookerMaterial5 = ref5.getCookerMaterial();
        String cookerWarranty5 = ref5.getCookerWarranty();
        int cookerPressureLevel5 = ref5.getCookerPressureLevel();
        String cookerSafetyFeatures5 = ref5.getCookerSafetyFeatures();

        System.out.println("Cooker ID: " + cookerId5);
        System.out.println("Cooker Brand: " + cookerBrand5);
        System.out.println("Cooker Type: " + cookerType5);
        System.out.println("Cooker Capacity: " + cookerCapacity5 + " liters");
        System.out.println("Cooker Material: " + cookerMaterial5);
        System.out.println("Cooker Warranty: " + cookerWarranty5);
        System.out.println("Cooker Pressure Level: " + cookerPressureLevel5 + " psi");
        System.out.println("Cooker Safety Features: " + cookerSafetyFeatures5);
        System.out.println("\n");
    }
}
