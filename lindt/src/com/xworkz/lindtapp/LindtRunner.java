package com.xworkz.lindtapp;

import com.xworkz.lindtapp.lindt.LindtDto;
import com.xworkz.lindtapp.generatelindt.GenerateLindt;

public class LindtRunner {
    public static void main(String[] args) {


        LindtDto lindtDto = new LindtDto();

        lindtDto.setFirstName("Radha");
        lindtDto.setLastName("Nagaraj");
        lindtDto.setEmailAddress("radha@gmail.com");
        lindtDto.setPassword("Radha@12345");
        lindtDto.setDateOfBirth("1995-04-09");
        lindtDto.setMobileNumber("9876543210");


        GenerateLindt generateLindt = new GenerateLindt();
        boolean isUserRegistered = generateLindt.registerUser(lindtDto);

      
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
