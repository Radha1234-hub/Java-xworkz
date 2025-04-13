package com.xworkz.inheritenceapp.electronicmachine;

public class ElectronicMachineRunner {
    public static void main(String[] args) {
        ElectronicMachine electronicMachine = new ElectronicMachine();
        electronicMachine.machineDetails();

        Laptop laptop = new Laptop();
        laptop.machineDetails();

        ElectronicMachine ref = new Laptop();
        ref.machineDetails();

        Laptop downcasted = (Laptop) ref;
        downcasted.machineDetails();
    }
}
