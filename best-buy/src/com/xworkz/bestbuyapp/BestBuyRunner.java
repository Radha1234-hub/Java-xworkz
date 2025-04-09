package com.xworkz.bestbuyapp;

import com.xworkz.bestbuyapp.bestbuy.BestBuyDto;
import com.xworkz.bestbuyapp.bestcreation.BestBuyCreation;

public class BestBuyRunner {
    public static void main(String[] args) {

        BestBuyDto bestBuyDto = new BestBuyDto();

        bestBuyDto.setFirstName("Radha");
        bestBuyDto.setLastName("Nagaraj");
        bestBuyDto.setEmailAddress("radha@gmail.com");
        bestBuyDto.setPassword("Radha@12345");
        bestBuyDto.setMobileNumber("9876543210");

        BestBuyCreation bestBuyCreation = new BestBuyCreation();
        boolean ref = bestBuyCreation.registerUser(bestBuyDto);

        if (ref == true)
            System.out.println("User registration successful!");
        else
            System.out.println("User registration unsuccessful.");
    }
}
