package com.xworkz.ferrerorocherapp;

import com.xworkz.ferrerorocherapp.ferrerorocher.FerreroRocherDto;
import com.xworkz.ferrerorocherapp.generateferrerorocher.GenerateFerreroRocher;

public class FerreroRocherRunner {
    public static void main(String[] args) {


        FerreroRocherDto ferreroRocherDto = new FerreroRocherDto();

        ferreroRocherDto.setFullName("Radha Nagaraj");
        ferreroRocherDto.setEmailAddress("radha@gmail.com");
        ferreroRocherDto.setPassword("Radha@12345");
        ferreroRocherDto.setAddress("21 Golden Lane, Chocolate Town");
        ferreroRocherDto.setMobileNumber("9876543210");


        GenerateFerreroRocher generateFerreroRocher = new GenerateFerreroRocher();
        boolean isUserRegistered = generateFerreroRocher.registerUser(ferreroRocherDto);

      
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
