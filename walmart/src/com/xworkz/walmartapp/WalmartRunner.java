package com.xworkz.walmartapp;

import com.xworkz.walmartapp.walmart.WalmartDto;
import com.xworkz.walmartapp.walmartcreation.WalmartCreation;

public class WalmartRunner {
    public static void main(String[] args) {

        WalmartDto walmartDto = new WalmartDto();

        walmartDto.setFirstName("Radha");
        walmartDto.setLastName("Nagaraj");
        walmartDto.setEmailAddress("radha@gmail.com");
        walmartDto.setPassword("Radha@12345");
        walmartDto.setMobileNumber("9876543210");
        walmartDto.setShippingAddress("Bengaluru, Karnataka");

        WalmartCreation walmartCreation = new WalmartCreation();
        boolean ref = walmartCreation.registerUser(walmartDto);

        walmartCreation.getDetails();

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
