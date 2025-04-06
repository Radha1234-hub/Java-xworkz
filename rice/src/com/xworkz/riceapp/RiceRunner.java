package com.xworkz.riceapp;

import com.xworkz.riceapp.rice.Rice;

public class RiceRunner {

    public static void main(String[] args) {

        // 1
        Rice ref1 = new Rice();
        ref1.setRiceId(1);
        ref1.setRiceType("Basmati");
        ref1.setRiceBrand("India Gate");
        ref1.setRiceOrigin("Punjab");
        ref1.setRiceQuantity("5kg");
        ref1.setRiceQuality("Premium");
        ref1.setRicePrice("Rs600");

        int riceId1 = ref1.getRiceId();
        String riceType1 = ref1.getRiceType();
        String riceBrand1 = ref1.getRiceBrand();
        String riceOrigin1 = ref1.getRiceOrigin();
        String riceQuantity1 = ref1.getRiceQuantity();
        String riceQuality1 = ref1.getRiceQuality();
        String ricePrice1 = ref1.getRicePrice();

        System.out.println("Rice ID: " + riceId1);
        System.out.println("Rice Type: " + riceType1);
        System.out.println("Rice Brand: " + riceBrand1);
        System.out.println("Rice Origin: " + riceOrigin1);
        System.out.println("Rice Quantity: " + riceQuantity1);
        System.out.println("Rice Quality: " + riceQuality1);
        System.out.println("Rice Price: " + ricePrice1);
        System.out.println("\n");

        // 2
        Rice ref2 = new Rice();
        ref2.setRiceId(2);
        ref2.setRiceType("Sona Masoori");
        ref2.setRiceBrand("Lal Qilla");
        ref2.setRiceOrigin("Karnataka");
        ref2.setRiceQuantity("10kg");
        ref2.setRiceQuality("Fine");
        ref2.setRicePrice("Rs450");

        int riceId2 = ref2.getRiceId();
        String riceType2 = ref2.getRiceType();
        String riceBrand2 = ref2.getRiceBrand();
        String riceOrigin2 = ref2.getRiceOrigin();
        String riceQuantity2 = ref2.getRiceQuantity();
        String riceQuality2 = ref2.getRiceQuality();
        String ricePrice2 = ref2.getRicePrice();

        System.out.println("Rice ID: " + riceId2);
        System.out.println("Rice Type: " + riceType2);
        System.out.println("Rice Brand: " + riceBrand2);
        System.out.println("Rice Origin: " + riceOrigin2);
        System.out.println("Rice Quantity: " + riceQuantity2);
        System.out.println("Rice Quality: " + riceQuality2);
        System.out.println("Rice Price: " + ricePrice2);
        System.out.println("\n");

        // 3
        Rice ref3 = new Rice();
        ref3.setRiceId(3);
        ref3.setRiceType("Ponni");
        ref3.setRiceBrand("Rajdhani");
        ref3.setRiceOrigin("Tamil Nadu");
        ref3.setRiceQuantity("5kg");
        ref3.setRiceQuality("Standard");
        ref3.setRicePrice("Rs400");

        int riceId3 = ref3.getRiceId();
        String riceType3 = ref3.getRiceType();
        String riceBrand3 = ref3.getRiceBrand();
        String riceOrigin3 = ref3.getRiceOrigin();
        String riceQuantity3 = ref3.getRiceQuantity();
        String riceQuality3 = ref3.getRiceQuality();
        String ricePrice3 = ref3.getRicePrice();

        System.out.println("Rice ID: " + riceId3);
        System.out.println("Rice Type: " + riceType3);
        System.out.println("Rice Brand: " + riceBrand3);
        System.out.println("Rice Origin: " + riceOrigin3);
        System.out.println("Rice Quantity: " + riceQuantity3);
        System.out.println("Rice Quality: " + riceQuality3);
        System.out.println("Rice Price: " + ricePrice3);
        System.out.println("\n");

        // 4
        Rice ref4 = new Rice();
        ref4.setRiceId(4);
        ref4.setRiceType("Brown Rice");
        ref4.setRiceBrand("Daawat");
        ref4.setRiceOrigin("Uttar Pradesh");
        ref4.setRiceQuantity("2kg");
        ref4.setRiceQuality("Healthy");
        ref4.setRicePrice("Rs250");

        int riceId4 = ref4.getRiceId();
        String riceType4 = ref4.getRiceType();
        String riceBrand4 = ref4.getRiceBrand();
        String riceOrigin4 = ref4.getRiceOrigin();
        String riceQuantity4 = ref4.getRiceQuantity();
        String riceQuality4 = ref4.getRiceQuality();
        String ricePrice4 = ref4.getRicePrice();

        System.out.println("Rice ID: " + riceId4);
        System.out.println("Rice Type: " + riceType4);
        System.out.println("Rice Brand: " + riceBrand4);
        System.out.println("Rice Origin: " + riceOrigin4);
        System.out.println("Rice Quantity: " + riceQuantity4);
        System.out.println("Rice Quality: " + riceQuality4);
        System.out.println("Rice Price: " + ricePrice4);
        System.out.println("\n");

        // 5
        Rice ref5 = new Rice();
        ref5.setRiceId(5);
        ref5.setRiceType("Jasmine Rice");
        ref5.setRiceBrand("Fortune");
        ref5.setRiceOrigin("Chhattisgarh");
        ref5.setRiceQuantity("5kg");
        ref5.setRiceQuality("Aromatic");
        ref5.setRicePrice("Rs700");

        int riceId5 = ref5.getRiceId();
        String riceType5 = ref5.getRiceType();
        String riceBrand5 = ref5.getRiceBrand();
        String riceOrigin5 = ref5.getRiceOrigin();
        String riceQuantity5 = ref5.getRiceQuantity();
        String riceQuality5 = ref5.getRiceQuality();
        String ricePrice5 = ref5.getRicePrice();

        System.out.println("Rice ID: " + riceId5);
        System.out.println("Rice Type: " + riceType5);
        System.out.println("Rice Brand: " + riceBrand5);
        System.out.println("Rice Origin: " + riceOrigin5);
        System.out.println("Rice Quantity: " + riceQuantity5);
        System.out.println("Rice Quality: " + riceQuality5);
        System.out.println("Rice Price: " + ricePrice5);
        System.out.println("\n");
    }
}
