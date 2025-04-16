package com.xworkz.aadhaarapp;

import com.xworkz.aadhaarapp.aadhaar.AadharDto;
import com.xworkz.aadhaarapp.aadhaarcreation.AadharCreation;
import com.xworkz.aadhaarapp.constants.Gender;

public class AadhaarRunner {
    public static void main(String[] args) {

        AadharDto aadhaarDto = new AadharDto();

        aadhaarDto.setFullName("Radha Nagaraj");
        aadhaarDto.setDateOfBirth("01-12-2003");
        aadhaarDto.setGender(Gender.Female);
        aadhaarDto.setMobileNumber("9876543210");
        aadhaarDto.setEmailId("radha@gmail.com");
        aadhaarDto.setResidentialAddress("Bengaluru, Karnataka");
        aadhaarDto.setBiometricData("Sample Biometric Data");

        AadharCreation aadhaarCreation = new AadharCreation();
        boolean ref = aadhaarCreation.registerUser(aadhaarDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
