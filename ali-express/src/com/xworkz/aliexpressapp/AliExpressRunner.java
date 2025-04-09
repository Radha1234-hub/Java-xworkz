package com.xworkz.aliexpressapp;

import com.xworkz.aliexpressapp.aliexpress.AliExpressDto;
import com.xworkz.aliexpressapp.aliexpresscreation.AliExpressCreation;

public class AliExpressRunner {
    public static void main(String[] args) {

        AliExpressDto aliExpressDto = new AliExpressDto();

        aliExpressDto.setFirstName("Radha");
        aliExpressDto.setLastName("Nagaraj");
        aliExpressDto.setEmailAddress("radha@gmail.com");
        aliExpressDto.setPassword("Radha@12345");
        aliExpressDto.setMobileNumber("9876543210");

        AliExpressCreation aliExpressCreation = new AliExpressCreation();
        boolean ref = aliExpressCreation.registerUser(aliExpressDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
