package com.xworkz.homecenterapp;

import com.xworkz.homecenterapp.homecenter.HomeCenterDto;
import com.xworkz.homecenterapp.generatehomecenter.GenerateHomeCenter;

public class HomeCenterRunner {
    public static void main(String[] args) {


        HomeCenterDto homeCenterDto = new HomeCenterDto();

        homeCenterDto.setFirstName("Radha");
        homeCenterDto.setLastName("Nagaraj");
        homeCenterDto.setEmailAddress("radha@gmail.com");
        homeCenterDto.setPassword("Radha@12345");
        homeCenterDto.setMobileNumber("9876543210");


        GenerateHomeCenter generateHomeCenter = new GenerateHomeCenter();
        boolean isUserRegistered = generateHomeCenter.registerUser(homeCenterDto);

        generateHomeCenter.getDetails();
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
