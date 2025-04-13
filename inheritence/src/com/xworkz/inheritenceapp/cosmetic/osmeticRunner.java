package com.xworkz.inheritenceapp.cosmetic;

public class osmeticRunner {
    public static void main(String[] args) {
        Cosmetic cosmetic = new Cosmetic();
        cosmetic.cosmeticDetails();

        LipStick lipstick = new LipStick();
        lipstick.cosmeticDetails();

        Cosmetic ref = new LipStick();
        ref.cosmeticDetails();

        LipStick downcasted = (LipStick) ref;
        downcasted.cosmeticDetails();

    }
}
