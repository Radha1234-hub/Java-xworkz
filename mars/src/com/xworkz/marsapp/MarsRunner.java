package com.xworkz.marsapp;

import com.xworkz.marsapp.mars.MarsDto;
import com.xworkz.marsapp.generatemars.GenerateMars;

public class MarsRunner {
    public static void main(String[] args) {


        MarsDto marsDto = new MarsDto();

        marsDto.setFullName("Radha Nagaraj");
        marsDto.setEmailAddress("radha@gmail.com");
        marsDto.setPassword("Radha@12345");
        marsDto.setAddress("101 Chocolate Galaxy, Milky Way");
        marsDto.setMobileNumber("9876543210");


        GenerateMars generateMars = new GenerateMars();
        boolean isUserRegistered = generateMars.registerUser(marsDto);

      
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
