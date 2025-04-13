package com.xworkz.inheritenceapp.machine;

public class MachineRunner {
    public static void main(String[] args) {
        Machine computer = new Machine();
        computer.machineDetails();

        Computer ref= new Computer();
        ref.machineDetails();

        Machine ref1 = new Computer();
        ref1.machineDetails();

        Computer downcasted = (Computer) ref1;
        downcasted.machineDetails();

    }
}
