package com.xworkz.computerapp;

import com.xworkz.computerapp.electronicdevice.ElectronicDevice;
import com.xworkz.computerapp.computer.Computer;

public class ComputerRunner {

    public static void main(String[] args) {



    ElectronicDevice ref = new ElectronicDevice();

    ref.power();
    ref.connectivity();
    ref.durability();
    ref.function();
    ref.portability();

    ElectronicDevice ref1 = new Computer();

    ref1.portability();
    ref1.power();
    ref1.function();
    ref1.durability();
    ref1.connectivity();

    Computer ref2 = new Computer();

    ref2.connectivity();
    ref2.function();
    ref2.portability();
    ref2.power();
    ref2.durability();

}
}