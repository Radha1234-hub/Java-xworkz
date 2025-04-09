package com.xworkz.nestleapp;

import com.xworkz.nestleapp.nestle.NestleDto;
import com.xworkz.nestleapp.generatenestle.GenerateNestle;
import com.xworkz.nestleapp.constants.Gender;
import com.xworkz.nestleapp.constants.Country;

public class NestleRunner {
    public static void main(String[] args) {


        NestleDto nestleDto = new NestleDto();

        nestleDto.setFullName("Radha Nagaraj");
        nestleDto.setEmailAddress("radha@gmail.com");
        nestleDto.setPassword("Radha@12345");
        nestleDto.setAge(29);
        nestleDto.setGender(Gender.FEMALE);
        nestleDto.setCountry(Country.INDIA);
        nestleDto.setMobileNumber("9876543210");


        GenerateNestle generateNestle = new GenerateNestle();
        boolean isUserRegistered = generateNestle.registerUser(nestleDto);

   
        if (isUserRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful.");
        }
    }
}
