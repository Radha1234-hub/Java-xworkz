package com.xworkz.grofersapp;

import com.xworkz.grofersapp.grofers.GrofersDto;
import com.xworkz.grofersapp.generategrofers.GenerateGrofers;

public class GrofersRunner {
    public static void main(String[] args) {


        GrofersDto grofersDto = new GrofersDto();

        grofersDto.setUsername("Radha Nagaraj");
        grofersDto.setMobileNumber("9876543210");
        grofersDto.setEmailAddress("radha@gmail.com");
        grofersDto.setPassword("Radha@12345");


        GenerateGrofers generateGrofers = new GenerateGrofers();
        boolean isUserRegistered = generateGrofers.registerUser(grofersDto);

        // Displaying the result of the registration
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
