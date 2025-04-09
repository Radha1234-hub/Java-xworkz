package com.xworkz.packlaneapp;

import com.xworkz.packlaneapp.packlane.PacklaneDto;
import com.xworkz.packlaneapp.generatepacklane.GeneratePacklane;

public class PacklaneRunner {
    public static void main(String[] args) {


        PacklaneDto packlaneDto = new PacklaneDto();

        packlaneDto.setFullName("Radha Nagaraj");
        packlaneDto.setEmailAddress("radha@gmail.com");
        packlaneDto.setPassword("Radha@12345");
        packlaneDto.setAddress("Suite 401, Packaging World");
        packlaneDto.setCompanyName("Radha Industries");


        GeneratePacklane generatePacklane = new GeneratePacklane();
        boolean isUserRegistered = generatePacklane.registerUser(packlaneDto);

        
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
