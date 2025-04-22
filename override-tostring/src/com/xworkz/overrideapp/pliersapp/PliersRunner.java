package com.xworkz.overrideapp.pliersapp;

import com.xworkz.overrideapp.pliersapp.pliers.PliersDto;

public class PliersRunner {


    public static void main(String[] args) {

        PliersDto ref1 = new PliersDto();
        ref1.setPlierId(1);
        ref1.setPlierType("Needle Nose Pliers");
        ref1.setPlierMaterial("Carbon Steel");
        ref1.setPlierBrand("Stanley");
        ref1.setPlierUsage("Electrical Work");
        ref1.setPlierSize("6-inch");
        ref1.setPlierPrice(350.00);

        int plierId1 = ref1.getPlierId();
        String plierType1 = ref1.getPlierType();
        String plierMaterial1 = ref1.getPlierMaterial();
        String plierBrand1 = ref1.getPlierBrand();
        String plierUsage1 = ref1.getPlierUsage();
        String plierSize1 = ref1.getPlierSize();
        double plierPrice1 = ref1.getPlierPrice();

        System.out.println("Plier ID: " + plierId1);
        System.out.println("Plier Type: " + plierType1);
        System.out.println("Plier Material: " + plierMaterial1);
        System.out.println("Plier Brand: " + plierBrand1);
        System.out.println("Plier Usage: " + plierUsage1);
        System.out.println("Plier Size: " + plierSize1);
        System.out.println("Plier Price: " + plierPrice1);
        System.out.println("\n");

        PliersDto ref2 = new PliersDto();
        ref2.setPlierId(2);
        ref2.setPlierType("Cutting Pliers");
        ref2.setPlierMaterial("Chrome Vanadium Steel");
        ref2.setPlierBrand("Knipex");
        ref2.setPlierUsage("Wire Cutting");
        ref2.setPlierSize("8-inch");
        ref2.setPlierPrice(600.00);

        int plierId2 = ref2.getPlierId();
        String plierType2 = ref2.getPlierType();
        String plierMaterial2 = ref2.getPlierMaterial();
        String plierBrand2 = ref2.getPlierBrand();
        String plierUsage2 = ref2.getPlierUsage();
        String plierSize2 = ref2.getPlierSize();
        double plierPrice2 = ref2.getPlierPrice();

        System.out.println("Plier ID: " + plierId2);
        System.out.println("Plier Type: " + plierType2);
        System.out.println("Plier Material: " + plierMaterial2);
        System.out.println("Plier Brand: " + plierBrand2);
        System.out.println("Plier Usage: " + plierUsage2);
        System.out.println("Plier Size: " + plierSize2);
        System.out.println("Plier Price: " + plierPrice2);
        System.out.println("\n");

        PliersDto ref3 = new PliersDto();
        ref3.setPlierId(3);
        ref3.setPlierType("Slip Joint Pliers");
        ref3.setPlierMaterial("Alloy Steel");
        ref3.setPlierBrand("Channellock");
        ref3.setPlierUsage("Grip & Hold Objects");
        ref3.setPlierSize("10-inch");
        ref3.setPlierPrice(450.00);

        int plierId3 = ref3.getPlierId();
        String plierType3 = ref3.getPlierType();
        String plierMaterial3 = ref3.getPlierMaterial();
        String plierBrand3 = ref3.getPlierBrand();
        String plierUsage3 = ref3.getPlierUsage();
        String plierSize3 = ref3.getPlierSize();
        double plierPrice3 = ref3.getPlierPrice();

        System.out.println("Plier ID: " + plierId3);
        System.out.println("Plier Type: " + plierType3);
        System.out.println("Plier Material: " + plierMaterial3);
        System.out.println("Plier Brand: " + plierBrand3);
        System.out.println("Plier Usage: " + plierUsage3);
        System.out.println("Plier Size: " + plierSize3);
        System.out.println("Plier Price: " + plierPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
