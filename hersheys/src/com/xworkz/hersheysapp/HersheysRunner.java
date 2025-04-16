package com.xworkz.hersheysapp;

import com.xworkz.hersheysapp.hersheys.HersheysDto;
import com.xworkz.hersheysapp.generatehersheys.GenerateHersheys;

public class HersheysRunner {
    public static void main(String[] args) {


        HersheysDto hersheysDto = new HersheysDto();

        hersheysDto.setFirstName("Radha");
        hersheysDto.setLastName("Nagaraj");
        hersheysDto.setEmailAddress("radha@gmail.com");
        hersheysDto.setPassword("Radha@12345");
        hersheysDto.setCompanyName("Radha's Sweet Ventures");
        hersheysDto.setAddressLine("789 Hershey Street, Cocoa City");
        hersheysDto.setCity("Chocolateville");
        hersheysDto.setPostalCode("560001");
        hersheysDto.setMobileNumber("9876543210");


        GenerateHersheys generateHersheys = new GenerateHersheys();
        boolean isUserRegistered = generateHersheys.registerUser(hersheysDto);


        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
