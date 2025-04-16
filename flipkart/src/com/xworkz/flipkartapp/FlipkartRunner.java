package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.flipkart.FlipkartDto;
import com.xworkz.flipkartapp.flipkartcreation.FlipkartCreation;

public class FlipkartRunner {
    public static void main(String[] args) {

        FlipkartDto flipkartDto = new FlipkartDto();

        flipkartDto.setFullName("Radha Nagaraj");
        flipkartDto.setMobileNumber("9876543210");
        flipkartDto.setEmailAddress("radha@gmail.com");
        flipkartDto.setPassword("Radha@12345");

        FlipkartCreation flipkartCreation = new FlipkartCreation();
        boolean ref = flipkartCreation.registerUser(flipkartDto);

        flipkartCreation.getDetails();

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
