package com.xworkz.godivaapp;

import com.xworkz.godivaapp.godiva.GodivaDto;
import com.xworkz.godivaapp.generategodiva.GenerateGodiva;

public class GodivaRunner {
    public static void main(String[] args) {


        GodivaDto godivaDto = new GodivaDto();

        godivaDto.setEmailAddress("radha@gmail.com");
        godivaDto.setPassword("Radha@12345");
        godivaDto.setName("Radha Nagaraj");
        godivaDto.setAddress("123 Chocolate Street, Dreamland");
        godivaDto.setMobileNumber("9876543210");


        GenerateGodiva generateGodiva = new GenerateGodiva();
        boolean isUserRegistered = generateGodiva.registerUser(godivaDto);

        generateGodiva.getDetails();
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
