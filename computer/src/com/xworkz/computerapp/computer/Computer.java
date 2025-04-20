package com.xworkz.computerapp.computer;

import com.xworkz.computerapp.electronicdevice.ElectronicDevice;

public class Computer extends ElectronicDevice {

    @Override
    public void power() {
        System.out.println("Computers typically require a stable power supply through electricity, and laptops use rechargeable batteries.");
    }

    @Override
    public void function() {
        System.out.println("Computers handle data processing, multitasking, and running software for diverse applications.");
    }

    @Override
    public void durability() {
        System.out.println("Durability of computers depends on hardware quality, proper cooling systems, and regular maintenance.");
    }

    @Override
    public void portability() {
        System.out.println("Desktop computers are stationary, while laptops and tablets offer high portability.");
    }

    @Override
    public void connectivity() {
        System.out.println("Computers feature multiple connectivity options including Wi-Fi, Bluetooth, USB ports, Ethernet, and external devices.");
    }
}
