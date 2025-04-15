package com.xworkz.inheritenceapp.stone;

public class StoneRunner {
    public static void main(String[] args) {
        Stone stone = new Stone();
        stone.stoneDetails();
        stone.stoneFormation();
        stone.stoneTypes();
        stone.stoneApplications();
        stone.stoneDurability();

        System.out.println("\n");

        Stone ref = new Granite();
        ref.stoneDetails();
        ref.stoneFormation();
        ref.stoneTypes();
        ref.stoneApplications();
        ref.stoneDurability();

        System.out.println("\n");

        Granite granite = new Granite();
        granite.stoneDetails();
        granite.graniteAppearance();
        granite.graniteUses();
        granite.graniteProperties();
        granite.graniteMaintenance();


    }
}
