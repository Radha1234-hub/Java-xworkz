package com.xworkz.bakingoapp;

import com.xworkz.bakingoapp.bakingo.BakingoDto;
import com.xworkz.bakingoapp.generatebakingo.GenerateBakingo;

public class BakingoRunner {
    public static void main(String[] args) {


        BakingoDto bakingoDto = new BakingoDto();

        bakingoDto.setFullName("Radha Nagaraj");
        bakingoDto.setEmailAddress("radha@gmail.com");
        bakingoDto.setPassword("Radha@12345");
        bakingoDto.setAddress("Cake Lane, Sweet Town");
        bakingoDto.setMobileNumber("9876543210");


        GenerateBakingo generateBakingo = new GenerateBakingo();
        boolean isUserRegistered = generateBakingo.registerUser(bakingoDto);

        generateBakingo.getDetails();


        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
