package com.xworkz.incometaxapp;

import com.xworkz.incometaxapp.incometax.IncomeTaxDto;
import com.xworkz.incometaxapp.incometaxcreation.IncomeTaxCreation;
import com.xworkz.incometaxapp.constants.Gender;

public class IncomeTaxRunner {
    public static void main(String[] args) {

        IncomeTaxDto incomeTaxDto = new IncomeTaxDto();

        incomeTaxDto.setPan("ABCDE1234F");
        incomeTaxDto.setFullName("Radha Nagaraj");
        incomeTaxDto.setDateOfBirth("01-12-2003");
        incomeTaxDto.setGender(Gender.Female);
        incomeTaxDto.setMobileNumber("9876543210");
        incomeTaxDto.setEmailId("radha@gmail.com");

        IncomeTaxCreation incomeTaxCreation = new IncomeTaxCreation();
        boolean ref = incomeTaxCreation.registerUser(incomeTaxDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
