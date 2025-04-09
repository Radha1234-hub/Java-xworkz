package com.xworkz.urbanladderapp;

import com.xworkz.urbanladderapp.urbanladder.UrbanLadderDto;
import com.xworkz.urbanladderapp.urbanladdercreation.GenerateUrbanLadder;

public class UrbanLadderRunner {
    public static void main(String[] args) {


        UrbanLadderDto urbanLadderDto = new UrbanLadderDto();

        urbanLadderDto.setName("Radha");
        urbanLadderDto.setAddress("Chhindwara, Madhya Pradesh");
        urbanLadderDto.setEmailAddress("radha@gmail.com");
        urbanLadderDto.setPassword("Radha@12345");


        GenerateUrbanLadder generateUrbanLadder = new GenerateUrbanLadder();
        boolean isUserRegistered = generateUrbanLadder.registerUser(urbanLadderDto);

        generateUrbanLadder.getDetails();

        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
