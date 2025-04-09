package com.xworkz.ebayapp;

import com.xworkz.ebayapp.ebay.EBayDto;
import com.xworkz.ebayapp.ebaycreation.EBayCreation;

public class EBayRunner {
    public static void main(String[] args) {

        EBayDto eBayDto = new EBayDto();

        eBayDto.setEmailAddress("radha@gmail.com");
        eBayDto.setUsername("Radha123");
        eBayDto.setPassword("Radha@12345");
        eBayDto.setConfirmPassword("Radha@12345");
        eBayDto.setPhoneNumber("9876543210");

        EBayCreation eBayCreation = new EBayCreation();
        boolean ref = eBayCreation.registerUser(eBayDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
