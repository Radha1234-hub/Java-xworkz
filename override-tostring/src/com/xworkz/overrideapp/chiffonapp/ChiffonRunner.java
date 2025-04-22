package com.xworkz.overrideapp.chiffonapp;

import com.xworkz.overrideapp.chiffonapp.chiffon.ChiffonDto;

public class ChiffonRunner {
    public static void main(String[] args) {

        ChiffonDto ref1 = new ChiffonDto();
        ref1.setChiffonId(1);
        ref1.setChiffonType("Silk Chiffon");
        ref1.setChiffonOrigin("France");
        ref1.setChiffonTexture("Soft and Sheer");
        ref1.setChiffonUsage("Luxury Dresses");
        ref1.setChiffonColor("Red");
        ref1.setChiffonPrice(4500.00);

        int chiffonId1 = ref1.getChiffonId();
        String chiffonType1 = ref1.getChiffonType();
        String chiffonOrigin1 = ref1.getChiffonOrigin();
        String chiffonTexture1 = ref1.getChiffonTexture();
        String chiffonUsage1 = ref1.getChiffonUsage();
        String chiffonColor1 = ref1.getChiffonColor();
        double chiffonPrice1 = ref1.getChiffonPrice();

        System.out.println("Chiffon ID: " + chiffonId1);
        System.out.println("Chiffon Type: " + chiffonType1);
        System.out.println("Chiffon Origin: " + chiffonOrigin1);
        System.out.println("Chiffon Texture: " + chiffonTexture1);
        System.out.println("Chiffon Usage: " + chiffonUsage1);
        System.out.println("Chiffon Color: " + chiffonColor1);
        System.out.println("Chiffon Price: " + chiffonPrice1);
        System.out.println("\n");

        ChiffonDto ref2 = new ChiffonDto();
        ref2.setChiffonId(2);
        ref2.setChiffonType("Polyester Chiffon");
        ref2.setChiffonOrigin("China");
        ref2.setChiffonTexture("Light and Flowing");
        ref2.setChiffonUsage("Scarves and Casual Wear");
        ref2.setChiffonColor("Blue");
        ref2.setChiffonPrice(2500.00);

        int chiffonId2 = ref2.getChiffonId();
        String chiffonType2 = ref2.getChiffonType();
        String chiffonOrigin2 = ref2.getChiffonOrigin();
        String chiffonTexture2 = ref2.getChiffonTexture();
        String chiffonUsage2 = ref2.getChiffonUsage();
        String chiffonColor2 = ref2.getChiffonColor();
        double chiffonPrice2 = ref2.getChiffonPrice();

        System.out.println("Chiffon ID: " + chiffonId2);
        System.out.println("Chiffon Type: " + chiffonType2);
        System.out.println("Chiffon Origin: " + chiffonOrigin2);
        System.out.println("Chiffon Texture: " + chiffonTexture2);
        System.out.println("Chiffon Usage: " + chiffonUsage2);
        System.out.println("Chiffon Color: " + chiffonColor2);
        System.out.println("Chiffon Price: " + chiffonPrice2);
        System.out.println("\n");

        ChiffonDto ref3 = new ChiffonDto();
        ref3.setChiffonId(3);
        ref3.setChiffonType("Cotton Chiffon");
        ref3.setChiffonOrigin("India");
        ref3.setChiffonTexture("Soft and Breathable");
        ref3.setChiffonUsage("Casual Clothing");
        ref3.setChiffonColor("Yellow");
        ref3.setChiffonPrice(3000.00);

        int chiffonId3 = ref3.getChiffonId();
        String chiffonType3 = ref3.getChiffonType();
        String chiffonOrigin3 = ref3.getChiffonOrigin();
        String chiffonTexture3 = ref3.getChiffonTexture();
        String chiffonUsage3 = ref3.getChiffonUsage();
        String chiffonColor3 = ref3.getChiffonColor();
        double chiffonPrice3 = ref3.getChiffonPrice();

        System.out.println("Chiffon ID: " + chiffonId3);
        System.out.println("Chiffon Type: " + chiffonType3);
        System.out.println("Chiffon Origin: " + chiffonOrigin3);
        System.out.println("Chiffon Texture: " + chiffonTexture3);
        System.out.println("Chiffon Usage: " + chiffonUsage3);
        System.out.println("Chiffon Color: " + chiffonColor3);
        System.out.println("Chiffon Price: " + chiffonPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
