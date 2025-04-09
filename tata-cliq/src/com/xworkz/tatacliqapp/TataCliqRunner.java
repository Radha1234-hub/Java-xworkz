package com.xworkz.tatacliqapp;

import com.xworkz.tatacliqapp.tatacliq.TataCliqDto;
import com.xworkz.tatacliqapp.tatacliqcreation.TataCliqCreation;

public class TataCliqRunner {
    public static void main(String[] args) {


        TataCliqDto tataCliqDto = new TataCliqDto();

        tataCliqDto.setFirstName("Radha");
        tataCliqDto.setLastName("Nagaraj");
        tataCliqDto.setEmailAddress("radha@gmail.com");
        tataCliqDto.setPassword("Radha@12345");
        tataCliqDto.setMobileNumber("9876543210");


        TataCliqCreation tataCliqCreation = new TataCliqCreation();
        boolean isUserRegistered = tataCliqCreation.registerUser(tataCliqDto);

        tataCliqCreation.getDetails();
        if (isUserRegistered)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
