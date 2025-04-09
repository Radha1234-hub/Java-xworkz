package com.xworkz.indiamartapp.generateindiamart;

import com.xworkz.indiamartapp.indiamart.IndiaMartDto;

public class GenerateIndiaMart {

    public boolean registerUser(IndiaMartDto indiaMartDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(indiaMartDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(IndiaMartDto indiaMartDto) {
        boolean userValidated = false;

        boolean isMobileNumberValid = false;
        boolean isEmailAddressValid = false;
        boolean isNameValid = false;
        boolean isProductDetailValid = false;

        // Validate Mobile Number
        String mobileNumber = indiaMartDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Email Address
        String emailAddress = indiaMartDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Name
        String name = indiaMartDto.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }

        // Validate Product Detail
        String productDetail = indiaMartDto.getProductDetail();
        if (productDetail != null && !productDetail.isEmpty()) {
            isProductDetailValid = true;
        } else {
            System.out.println("Invalid Product Detail");
        }

        // Check all validations
        if (isMobileNumberValid && isEmailAddressValid && isNameValid && isProductDetailValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
