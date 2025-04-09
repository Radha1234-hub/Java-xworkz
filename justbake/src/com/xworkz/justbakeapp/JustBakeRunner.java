package com.xworkz.justbakeapp;

import com.xworkz.justbakeapp.justbake.JustBakeDto;
import com.xworkz.justbakeapp.generatejustbake.GenerateJustBake;

public class JustBakeRunner {
    public static void main(String[] args) {


        JustBakeDto justBakeDto = new JustBakeDto();

        justBakeDto.setFullName("Radha Nagaraj");
        justBakeDto.setEmailAddress("radha@gmail.com");
        justBakeDto.setPassword("Radha@12345");
        justBakeDto.setAddress("Cake Avenue, Frosting City");
        justBakeDto.setMobileNumber("9876543210");


        GenerateJustBake generateJustBake = new GenerateJustBake();
        boolean isUserRegistered = generateJustBake.registerUser(justBakeDto);

       
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
