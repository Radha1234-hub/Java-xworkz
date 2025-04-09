package com.xworkz.decathlonapp;

import com.xworkz.decathlonapp.decathlon.DecathlonDto;
import com.xworkz.decathlonapp.generatedecathlon.GenerateDecathlon;

public class DecathlonRunner {
    public static void main(String[] args) {

        // Creating a DecathlonDto object and setting user details
        DecathlonDto decathlonDto = new DecathlonDto();

        decathlonDto.setName("Radha Nagaraj");
        decathlonDto.setPhoneNumber("9876543210");
        decathlonDto.setEmailAddress("radha@gmail.com");
        decathlonDto.setPassword("Radha@12345");

        // Creating GenerateDecathlon object and registering the user
        GenerateDecathlon generateDecathlon = new GenerateDecathlon();
        boolean isUserRegistered = generateDecathlon.registerUser(decathlonDto);

        // Displaying the result of the registration
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
