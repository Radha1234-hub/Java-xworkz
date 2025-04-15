package com.xworkz.inheritenceapp.electronicmachine;

public class ElectronicMachineRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        ElectronicMachine electronicMachine = new ElectronicMachine();
        electronicMachine.machineDetails();
        electronicMachine.powerConsumption();
        electronicMachine.functionality();
        electronicMachine.components();
        electronicMachine.industrialApplications();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        ElectronicMachine ref = new Laptop();
        ref.machineDetails();
        ref.powerConsumption();
        ref.functionality();
        ref.components();
        ref.industrialApplications();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Laptop laptop = new Laptop();
        laptop.machineDetails();
        laptop.portability();
        laptop.performance();
        laptop.batteryLife();
        laptop.connectivity();
    }
}
