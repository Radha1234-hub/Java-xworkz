package com.xworkz.indiamartapp;

import com.xworkz.indiamartapp.indiamart.IndiaMartDto;
import com.xworkz.indiamartapp.generateindiamart.GenerateIndiaMart;

public class IndiaMartRunner {
    public static void main(String[] args) {


        IndiaMartDto indiaMartDto = new IndiaMartDto();

        indiaMartDto.setMobileNumber("9876543210");
        indiaMartDto.setEmailAddress("radha@gmail.com");
        indiaMartDto.setName("Radha Nagaraj");
        indiaMartDto.setProductDetail("Handcrafted Wooden Furniture");


        GenerateIndiaMart generateIndiaMart = new GenerateIndiaMart();
        boolean isUserRegistered = generateIndiaMart.registerUser(indiaMartDto);

        
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
