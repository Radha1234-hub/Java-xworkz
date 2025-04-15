package com.xworkz.inheritenceapp.machine;

public class MachineRunner {
    public static void main(String[] args) {

                Machine machine = new Machine();
                machine.machineDetails();
                machine.powerOn();
                machine.performTask();
                machine.maintenance();
                machine.powerOff();

                System.out.println("\n");

                Machine ref = new Computer();
                ref.machineDetails();
                ref.powerOn();
                ref.performTask();
                ref.maintenance();
                ref.powerOff();

                System.out.println("\n");

                Computer computer = new Computer();
                computer.machineDetails();
                computer.executeProgram();
                computer.storeData();
                computer.connectToInternet();
                computer.shutDown();

    }
}
