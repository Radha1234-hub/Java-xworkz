package com.xworkz.overrideapp.linenapp;

import com.xworkz.overrideapp.linenapp.linen.LinenDto;

public class LinenRunner {

    public static void main(String[] args) {

        LinenDto ref1 = new LinenDto();
        ref1.setLinenId(1);
        ref1.setLinenType("Belgian Linen");
        ref1.setLinenOrigin("Belgium");
        ref1.setLinenTexture("Smooth and Soft");
        ref1.setLinenUsage("Luxury Bedding");
        ref1.setLinenColor("White");
        ref1.setLinenPrice(3500.00);

        int linenId1 = ref1.getLinenId();
        String linenType1 = ref1.getLinenType();
        String linenOrigin1 = ref1.getLinenOrigin();
        String linenTexture1 = ref1.getLinenTexture();
        String linenUsage1 = ref1.getLinenUsage();
        String linenColor1 = ref1.getLinenColor();
        double linenPrice1 = ref1.getLinenPrice();

        System.out.println("Linen ID: " + linenId1);
        System.out.println("Linen Type: " + linenType1);
        System.out.println("Linen Origin: " + linenOrigin1);
        System.out.println("Linen Texture: " + linenTexture1);
        System.out.println("Linen Usage: " + linenUsage1);
        System.out.println("Linen Color: " + linenColor1);
        System.out.println("Linen Price: " + linenPrice1);
        System.out.println("\n");

        LinenDto ref2 = new LinenDto();
        ref2.setLinenId(2);
        ref2.setLinenType("Irish Linen");
        ref2.setLinenOrigin("Ireland");
        ref2.setLinenTexture("Fine and Durable");
        ref2.setLinenUsage("Clothing");
        ref2.setLinenColor("Cream");
        ref2.setLinenPrice(4000.00);

        int linenId2 = ref2.getLinenId();
        String linenType2 = ref2.getLinenType();
        String linenOrigin2 = ref2.getLinenOrigin();
        String linenTexture2 = ref2.getLinenTexture();
        String linenUsage2 = ref2.getLinenUsage();
        String linenColor2 = ref2.getLinenColor();
        double linenPrice2 = ref2.getLinenPrice();

        System.out.println("Linen ID: " + linenId2);
        System.out.println("Linen Type: " + linenType2);
        System.out.println("Linen Origin: " + linenOrigin2);
        System.out.println("Linen Texture: " + linenTexture2);
        System.out.println("Linen Usage: " + linenUsage2);
        System.out.println("Linen Color: " + linenColor2);
        System.out.println("Linen Price: " + linenPrice2);
        System.out.println("\n");

        LinenDto ref3 = new LinenDto();
        ref3.setLinenId(3);
        ref3.setLinenType("Flax Linen");
        ref3.setLinenOrigin("India");
        ref3.setLinenTexture("Textured and Breathable");
        ref3.setLinenUsage("Home Upholstery");
        ref3.setLinenColor("Beige");
        ref3.setLinenPrice(2800.00);

        int linenId3 = ref3.getLinenId();
        String linenType3 = ref3.getLinenType();
        String linenOrigin3 = ref3.getLinenOrigin();
        String linenTexture3 = ref3.getLinenTexture();
        String linenUsage3 = ref3.getLinenUsage();
        String linenColor3 = ref3.getLinenColor();
        double linenPrice3 = ref3.getLinenPrice();

        System.out.println("Linen ID: " + linenId3);
        System.out.println("Linen Type: " + linenType3);
        System.out.println("Linen Origin: " + linenOrigin3);
        System.out.println("Linen Texture: " + linenTexture3);
        System.out.println("Linen Usage: " + linenUsage3);
        System.out.println("Linen Color: " + linenColor3);
        System.out.println("Linen Price: " + linenPrice3);
        System.out.println("\n");

        LinenDto ref33 = new LinenDto();
        ref33.setLinenId(3);
        ref33.setLinenType("Flax Linen");
        ref33.setLinenOrigin("India");
        ref33.setLinenTexture("Textured and Breathable");
        ref33.setLinenUsage("Home Upholstery");
        ref33.setLinenColor("Beige");
        ref33.setLinenPrice(2800.00);

        System.out.println(ref3.toString());
        System.out.println(ref3.equals(ref3));
        System.out.println(ref1.hashCode());
    }
}
