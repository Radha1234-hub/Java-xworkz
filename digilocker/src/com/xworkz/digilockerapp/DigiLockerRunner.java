package com.xworkz.digilockerapp;

import com.xworkz.digilockerapp.digilocker.DigiLockerDto;
import com.xworkz.digilockerapp.digilockercreation.DigiLockerCreation;

public class DigiLockerRunner {
    public static void main(String[] args) {

        DigiLockerDto digiLockerDto = new DigiLockerDto();

        digiLockerDto.setFullName("Radha Nagaraj");
        digiLockerDto.setMobileNumber("9876543210");
        digiLockerDto.setSecurityPin(4);
        digiLockerDto.setEmailId("radha@gmail.com");
        digiLockerDto.setAadhaarNumber("123456789012");

        DigiLockerCreation digiLockerCreation = new DigiLockerCreation();
        boolean ref = digiLockerCreation.registerUser(digiLockerDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
