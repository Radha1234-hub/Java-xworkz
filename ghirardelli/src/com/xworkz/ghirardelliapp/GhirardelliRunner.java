package com.xworkz.ghirardelliapp;

import com.xworkz.ghirardelliapp.ghirardelli.GhirardelliDto;
import com.xworkz.ghirardelliapp.generateghirardelli.GenerateGhirardelli;

public class GhirardelliRunner {
    public static void main(String[] args) {


        GhirardelliDto ghirardelliDto = new GhirardelliDto();

        ghirardelliDto.setFullName("Radha Nagaraj");
        ghirardelliDto.setEmailAddress("radha@gmail.com");
        ghirardelliDto.setPassword("Radha@12345");
        ghirardelliDto.setAddress("456 Chocolate Avenue, Candyland");
        ghirardelliDto.setMobileNumber("9876543210");


        GenerateGhirardelli generateGhirardelli = new GenerateGhirardelli();
        boolean isUserRegistered = generateGhirardelli.registerUser(ghirardelliDto);

       
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
