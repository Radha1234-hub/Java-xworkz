package com.xworkz.purplleapp;

import com.xworkz.purplleapp.purplle.PurplleDto;
import com.xworkz.purplleapp.purpllecreation.GeneratePurplle;

public class PurplleRunner {
    public static void main(String[] args) {


        PurplleDto purplleDto = new PurplleDto();

        purplleDto.setFirstName("Radha");
        purplleDto.setLastName("Nagaraj");
        purplleDto.setAddress("Chhindwara, Madhya Pradesh");
        purplleDto.setEmailAddress("radha@gmail.com");
        purplleDto.setPassword("Radha@12345");


        GeneratePurplle generatePurplle = new GeneratePurplle();
        boolean isUserRegistered = generatePurplle.registerUser(purplleDto);

       
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
