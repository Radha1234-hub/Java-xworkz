package com.xworkz.cadburyapp;

import com.xworkz.cadburyapp.cadbury.CadburyDto;
import com.xworkz.cadburyapp.generatecadbury.GenerateCadbury;

public class CadburyRunner {
    public static void main(String[] args) {

      
        CadburyDto cadburyDto = new CadburyDto();

        cadburyDto.setFirstName("Radha");
        cadburyDto.setLastName("Nagaraj");
        cadburyDto.setEmailAddress("radha@gmail.com");
        cadburyDto.setPassword("Radha@12345");
        cadburyDto.setStreetAddress("123 Sweet Lane");
        cadburyDto.setCity("Chocolate City");
        cadburyDto.setState("Cocoa State");
        cadburyDto.setPostalCode("123456");
        cadburyDto.setMobileNumber("9876543210");


        GenerateCadbury generateCadbury = new GenerateCadbury();
        boolean isUserRegistered = generateCadbury.registerUser(cadburyDto);


        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
