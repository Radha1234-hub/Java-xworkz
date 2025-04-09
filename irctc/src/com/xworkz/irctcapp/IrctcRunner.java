package com.xworkz.irctcapp;

import com.xworkz.irctcapp.irctc.IrctcDto;
import com.xworkz.irctcapp.irctccreation.IrctcCreation;
import com.xworkz.irctcapp.constants.Gender;
import com.xworkz.irctcapp.constants.Nationality;

public class IrctcRunner {
    public static void main(String[] args) {

        IrctcDto irctcDto = new IrctcDto();

        irctcDto.setUsername("Radha123");
        irctcDto.setPassword("Radha@12345");
        irctcDto.setSecurityQuestion("What is your favorite color?");
        irctcDto.setSecurityAnswer("Purple");
        irctcDto.setFullName("Radha Nagaraj");
        irctcDto.setDateOfBirth("01-12-2003");
        irctcDto.setGender(Gender.Female);
        irctcDto.setMobileNumber("9876543210");
        irctcDto.setEmailId("radha@gmail.com");
        irctcDto.setResidentialAddress("Bengaluru, Karnataka");
        irctcDto.setNationality(Nationality.Indian);

        IrctcCreation irctcCreation = new IrctcCreation();
        boolean ref = irctcCreation.registerUser(irctcDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
