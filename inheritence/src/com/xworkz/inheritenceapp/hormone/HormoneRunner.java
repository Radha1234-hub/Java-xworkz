package com.xworkz.inheritenceapp.hormone;

public class HormoneRunner {

    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Hormone hormone = new Hormone();
        hormone.hormoneDetails();
        hormone.hormoneFunctions();
        hormone.hormoneTypes();
        hormone.hormoneProduction();
        hormone.hormoneImbalance();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Hormone ref = new Insulin();
        ref.hormoneDetails();
        ref.hormoneFunctions();
        ref.hormoneTypes();
        ref.hormoneProduction();
        ref.hormoneImbalance();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Insulin insulin = new Insulin();
        insulin.hormoneDetails();
        insulin.insulinRole();
        insulin.insulinSecretion();
        insulin.insulinDeficiency();
        insulin.insulinDiscovery();

    }

}
