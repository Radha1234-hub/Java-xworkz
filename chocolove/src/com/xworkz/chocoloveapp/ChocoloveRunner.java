package com.xworkz.chocoloveapp;

import com.xworkz.chocoloveapp.chocolove.ChocoloveDto;
import com.xworkz.chocoloveapp.generatechocolove.GenerateChocolove;

public class ChocoloveRunner {
    public static void main(String[] args) {


        ChocoloveDto chocoloveDto = new ChocoloveDto();

        chocoloveDto.setFirstName("Radha");
        chocoloveDto.setLastName("Nagaraj");
        chocoloveDto.setEmailAddress("radha@gmail.com");
        chocoloveDto.setPassword("Radha@12345");
        chocoloveDto.setStreetAddress("123 Sweet Lane");
        chocoloveDto.setCity("Chocolate City");
        chocoloveDto.setState("Cocoa State");
        chocoloveDto.setPostalCode("456789");


        GenerateChocolove generateChocolove = new GenerateChocolove();
        boolean isUserRegistered = generateChocolove.registerUser(chocoloveDto);


        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
