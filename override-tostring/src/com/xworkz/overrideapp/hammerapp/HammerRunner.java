package com.xworkz.overrideapp.hammerapp;
import com.xworkz.overrideapp.hammerapp.hammer.HammerDto;

public class HammerRunner {
    public static void main(String[] args) {

        HammerDto ref1 = new HammerDto();
        ref1.setHammerId(1);
        ref1.setHammerType("Claw Hammer");
        ref1.setHammerMaterial("Steel");
        ref1.setHammerBrand("Stanley");
        ref1.setHammerUsage("Woodworking & Construction");
        ref1.setHammerWeight("16 oz");
        ref1.setHammerPrice(800.00);

        int hammerId1 = ref1.getHammerId();
        String hammerType1 = ref1.getHammerType();
        String hammerMaterial1 = ref1.getHammerMaterial();
        String hammerBrand1 = ref1.getHammerBrand();
        String hammerUsage1 = ref1.getHammerUsage();
        String hammerWeight1 = ref1.getHammerWeight();
        double hammerPrice1 = ref1.getHammerPrice();

        System.out.println("Hammer ID: " + hammerId1);
        System.out.println("Hammer Type: " + hammerType1);
        System.out.println("Hammer Material: " + hammerMaterial1);
        System.out.println("Hammer Brand: " + hammerBrand1);
        System.out.println("Hammer Usage: " + hammerUsage1);
        System.out.println("Hammer Weight: " + hammerWeight1);
        System.out.println("Hammer Price: " + hammerPrice1);
        System.out.println("\n");

        HammerDto ref2 = new HammerDto();
        ref2.setHammerId(2);
        ref2.setHammerType("Ball Peen Hammer");
        ref2.setHammerMaterial("Carbon Steel");
        ref2.setHammerBrand("DeWalt");
        ref2.setHammerUsage("Metalworking");
        ref2.setHammerWeight("24 oz");
        ref2.setHammerPrice(1200.00);

        int hammerId2 = ref2.getHammerId();
        String hammerType2 = ref2.getHammerType();
        String hammerMaterial2 = ref2.getHammerMaterial();
        String hammerBrand2 = ref2.getHammerBrand();
        String hammerUsage2 = ref2.getHammerUsage();
        String hammerWeight2 = ref2.getHammerWeight();
        double hammerPrice2 = ref2.getHammerPrice();

        System.out.println("Hammer ID: " + hammerId2);
        System.out.println("Hammer Type: " + hammerType2);
        System.out.println("Hammer Material: " + hammerMaterial2);
        System.out.println("Hammer Brand: " + hammerBrand2);
        System.out.println("Hammer Usage: " + hammerUsage2);
        System.out.println("Hammer Weight: " + hammerWeight2);
        System.out.println("Hammer Price: " + hammerPrice2);
        System.out.println("\n");

        HammerDto ref3 = new HammerDto();
        ref3.setHammerId(3);
        ref3.setHammerType("Sledgehammer");
        ref3.setHammerMaterial("Fiberglass Handle, Steel Head");
        ref3.setHammerBrand("Estwing");
        ref3.setHammerUsage("Demolition & Heavy Duty Work");
        ref3.setHammerWeight("10 lbs");
        ref3.setHammerPrice(2500.00);

        int hammerId3 = ref3.getHammerId();
        String hammerType3 = ref3.getHammerType();
        String hammerMaterial3 = ref3.getHammerMaterial();
        String hammerBrand3 = ref3.getHammerBrand();
        String hammerUsage3 = ref3.getHammerUsage();
        String hammerWeight3 = ref3.getHammerWeight();
        double hammerPrice3 = ref3.getHammerPrice();

        System.out.println("Hammer ID: " + hammerId3);
        System.out.println("Hammer Type: " + hammerType3);
        System.out.println("Hammer Material: " + hammerMaterial3);
        System.out.println("Hammer Brand: " + hammerBrand3);
        System.out.println("Hammer Usage: " + hammerUsage3);
        System.out.println("Hammer Weight: " + hammerWeight3);
        System.out.println("Hammer Price: " + hammerPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
