package com.xworkz.inheritenceapp.leather;

public class LeatherRunner {
    public static void main(String[] args) {

                // Create a copy of Parent and invoke 5 methods
                Leather leather = new Leather();
                leather.shoeDetails();
                leather.materialDetails();
                leather.maintenanceTips();
                leather.usageDetails();
                leather.manufacturingProcess();

                System.out.println("\n");

                // Create a copy of Subclass using Parent reference type and invoke 5 methods
                Leather ref = new Shoe();
                ref.shoeDetails();
                ref.materialDetails();
                ref.maintenanceTips();
                ref.usageDetails();
                ref.manufacturingProcess();

                System.out.println("\n");

                // Create a copy of Subclass using same class reference type and invoke 5 methods
                Shoe shoe = new Shoe();
                shoe.shoeDetails();
                shoe.shoeType();
                shoe.shoeCare();
                shoe.shoeDurability();
                shoe.shoeStyle();

    }
}
