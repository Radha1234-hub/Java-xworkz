package com.xworkz.overrideapp.silkapp;

import com.xworkz.overrideapp.silkapp.silk.SilkDto;

public class SilkRunner {
    public static void main(String[] args) {

        SilkDto ref1 = new SilkDto();
        ref1.setSilkId(1);
        ref1.setSilkType("Mulberry Silk");
        ref1.setSilkOrigin("India");
        ref1.setSilkTexture("Smooth and Lustrous");
        ref1.setSilkUsage("Sarees and Clothing");
        ref1.setSilkColor("Gold");
        ref1.setSilkPrice(2500.00);

        int silkId1 = ref1.getSilkId();
        String silkType1 = ref1.getSilkType();
        String silkOrigin1 = ref1.getSilkOrigin();
        String silkTexture1 = ref1.getSilkTexture();
        String silkUsage1 = ref1.getSilkUsage();
        String silkColor1 = ref1.getSilkColor();
        double silkPrice1 = ref1.getSilkPrice();

        System.out.println("Silk ID: " + silkId1);
        System.out.println("Silk Type: " + silkType1);
        System.out.println("Silk Origin: " + silkOrigin1);
        System.out.println("Silk Texture: " + silkTexture1);
        System.out.println("Silk Usage: " + silkUsage1);
        System.out.println("Silk Color: " + silkColor1);
        System.out.println("Silk Price: " + silkPrice1);
        System.out.println("\n");

        SilkDto ref2 = new SilkDto();
        ref2.setSilkId(2);
        ref2.setSilkType("Tussar Silk");
        ref2.setSilkOrigin("India");
        ref2.setSilkTexture("Coarse and Textured");
        ref2.setSilkUsage("Traditional Wear");
        ref2.setSilkColor("Beige");
        ref2.setSilkPrice(3000.00);

        int silkId2 = ref2.getSilkId();
        String silkType2 = ref2.getSilkType();
        String silkOrigin2 = ref2.getSilkOrigin();
        String silkTexture2 = ref2.getSilkTexture();
        String silkUsage2 = ref2.getSilkUsage();
        String silkColor2 = ref2.getSilkColor();
        double silkPrice2 = ref2.getSilkPrice();

        System.out.println("Silk ID: " + silkId2);
        System.out.println("Silk Type: " + silkType2);
        System.out.println("Silk Origin: " + silkOrigin2);
        System.out.println("Silk Texture: " + silkTexture2);
        System.out.println("Silk Usage: " + silkUsage2);
        System.out.println("Silk Color: " + silkColor2);
        System.out.println("Silk Price: " + silkPrice2);
        System.out.println("\n");

        SilkDto ref3 = new SilkDto();
        ref3.setSilkId(3);
        ref3.setSilkType("Muga Silk");
        ref3.setSilkOrigin("Assam, India");
        ref3.setSilkTexture("Durable and Glossy");
        ref3.setSilkUsage("Luxury Garments");
        ref3.setSilkColor("Yellow");
        ref3.setSilkPrice(5000.00);

        int silkId3 = ref3.getSilkId();
        String silkType3 = ref3.getSilkType();
        String silkOrigin3 = ref3.getSilkOrigin();
        String silkTexture3 = ref3.getSilkTexture();
        String silkUsage3 = ref3.getSilkUsage();
        String silkColor3 = ref3.getSilkColor();
        double silkPrice3 = ref3.getSilkPrice();

        System.out.println("Silk ID: " + silkId3);
        System.out.println("Silk Type: " + silkType3);
        System.out.println("Silk Origin: " + silkOrigin3);
        System.out.println("Silk Texture: " + silkTexture3);
        System.out.println("Silk Usage: " + silkUsage3);
        System.out.println("Silk Color: " + silkColor3);
        System.out.println("Silk Price: " + silkPrice3);
        System.out.println("\n");

        SilkDto ref11 = new SilkDto();
        ref11.setSilkId(1);
        ref11.setSilkType("Mulberry Silk");
        ref11.setSilkOrigin("India");
        ref11.setSilkTexture("Smooth and Lustrous");
        ref11.setSilkUsage("Sarees and Clothing");
        ref11.setSilkColor("Gold");
        ref11.setSilkPrice(2500.00);

        System.out.println(ref3.toString());
        System.out.println(ref1.equals(ref11));
        System.out.println(ref3.hashCode());
    }
}
