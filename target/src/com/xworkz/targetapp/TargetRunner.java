package com.xworkz.targetapp;

import com.xworkz.targetapp.target.TargetDto;
import com.xworkz.targetapp.targetcreation.TargetCreation;

public class TargetRunner {
    public static void main(String[] args) {

        TargetDto targetDto = new TargetDto();

        targetDto.setFirstName("Radha");
        targetDto.setLastName("Nagaraj");
        targetDto.setEmailAddress("radha@gmail.com");
        targetDto.setPassword("Radha@12345");
        targetDto.setMobilePhoneNumber("9876543210");

        TargetCreation targetCreation = new TargetCreation();
        boolean ref = targetCreation.registerUser(targetDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
