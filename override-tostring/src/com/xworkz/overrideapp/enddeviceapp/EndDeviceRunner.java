package com.xworkz.overrideapp.enddeviceapp;

import com.xworkz.overrideapp.enddeviceapp.enddevice.EndDeviceDto;

public class EndDeviceRunner {
    public static void main(String[] args) {

        EndDeviceDto ref1 = new EndDeviceDto();
        ref1.setDeviceId(1);
        ref1.setDeviceName("Laptop");
        ref1.setDeviceType("Personal Computing");
        ref1.setDeviceManufacturer("Dell");
        ref1.setDeviceUsage("Work & Entertainment");
        ref1.setDeviceConnectivity("Wi-Fi, Bluetooth");
        ref1.setDevicePrice(75000.00);

        int deviceId1 = ref1.getDeviceId();
        String deviceName1 = ref1.getDeviceName();
        String deviceType1 = ref1.getDeviceType();
        String deviceManufacturer1 = ref1.getDeviceManufacturer();
        String deviceUsage1 = ref1.getDeviceUsage();
        String deviceConnectivity1 = ref1.getDeviceConnectivity();
        double devicePrice1 = ref1.getDevicePrice();

        System.out.println("Device ID: " + deviceId1);
        System.out.println("Device Name: " + deviceName1);
        System.out.println("Device Type: " + deviceType1);
        System.out.println("Device Manufacturer: " + deviceManufacturer1);
        System.out.println("Device Usage: " + deviceUsage1);
        System.out.println("Device Connectivity: " + deviceConnectivity1);
        System.out.println("Device Price: " + devicePrice1);
        System.out.println("\n");

        EndDeviceDto ref2 = new EndDeviceDto();
        ref2.setDeviceId(2);
        ref2.setDeviceName("Smartphone");
        ref2.setDeviceType("Communication");
        ref2.setDeviceManufacturer("Apple");
        ref2.setDeviceUsage("Calling, Messaging, Media");
        ref2.setDeviceConnectivity("Wi-Fi, 5G, Bluetooth");
        ref2.setDevicePrice(90000.00);

        int deviceId2 = ref2.getDeviceId();
        String deviceName2 = ref2.getDeviceName();
        String deviceType2 = ref2.getDeviceType();
        String deviceManufacturer2 = ref2.getDeviceManufacturer();
        String deviceUsage2 = ref2.getDeviceUsage();
        String deviceConnectivity2 = ref2.getDeviceConnectivity();
        double devicePrice2 = ref2.getDevicePrice();

        System.out.println("Device ID: " + deviceId2);
        System.out.println("Device Name: " + deviceName2);
        System.out.println("Device Type: " + deviceType2);
        System.out.println("Device Manufacturer: " + deviceManufacturer2);
        System.out.println("Device Usage: " + deviceUsage2);
        System.out.println("Device Connectivity: " + deviceConnectivity2);
        System.out.println("Device Price: " + devicePrice2);
        System.out.println("\n");

        EndDeviceDto ref3 = new EndDeviceDto();
        ref3.setDeviceId(3);
        ref3.setDeviceName("Tablet");
        ref3.setDeviceType("Portable Computing");
        ref3.setDeviceManufacturer("Samsung");
        ref3.setDeviceUsage("Reading, Gaming, Work");
        ref3.setDeviceConnectivity("Wi-Fi, LTE, Bluetooth");
        ref3.setDevicePrice(60000.00);

        int deviceId3 = ref3.getDeviceId();
        String deviceName3 = ref3.getDeviceName();
        String deviceType3 = ref3.getDeviceType();
        String deviceManufacturer3 = ref3.getDeviceManufacturer();
        String deviceUsage3 = ref3.getDeviceUsage();
        String deviceConnectivity3 = ref3.getDeviceConnectivity();
        double devicePrice3 = ref3.getDevicePrice();

        System.out.println("Device ID: " + deviceId3);
        System.out.println("Device Name: " + deviceName3);
        System.out.println("Device Type: " + deviceType3);
        System.out.println("Device Manufacturer: " + deviceManufacturer3);
        System.out.println("Device Usage: " + deviceUsage3);
        System.out.println("Device Connectivity: " + deviceConnectivity3);
        System.out.println("Device Price: " + devicePrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
