package com.xworkz.reliancedigitalapp;

import com.xworkz.reliancedigitalapp.reliancedigital.RelianceDigitalDto;
import com.xworkz.reliancedigitalapp.generatereliancedigital.GenerateRelianceDigital;

public class RelianceDigitalRunner {
    public static void main(String[] args) {


        RelianceDigitalDto relianceDigitalDto = new RelianceDigitalDto();

        relianceDigitalDto.setUsername("Radha Nagaraj");
        relianceDigitalDto.setMobileNumber("9876543210");
        relianceDigitalDto.setEmailAddress("radha@gmail.com");
        relianceDigitalDto.setPassword("Radha@12345");


        GenerateRelianceDigital generateRelianceDigital = new GenerateRelianceDigital();
        boolean isUserRegistered = generateRelianceDigital.registerUser(relianceDigitalDto);

        generateRelianceDigital.getDetails();
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
