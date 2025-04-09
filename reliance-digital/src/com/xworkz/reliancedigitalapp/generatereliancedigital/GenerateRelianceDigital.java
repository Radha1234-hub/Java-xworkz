package com.xworkz.reliancedigitalapp.generatereliancedigital;

import com.xworkz.reliancedigitalapp.reliancedigital.RelianceDigitalDto;

public class GenerateRelianceDigital {

    public boolean registerUser(RelianceDigitalDto relianceDigitalDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(relianceDigitalDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(RelianceDigitalDto relianceDigitalDto) {
        boolean userValidated = false;

        boolean isUsernameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;

        // Validate Username
        String username = relianceDigitalDto.getUsername();
        if (username != null && !username.isEmpty()) {
            isUsernameValid = true;
        } else {
            System.out.println("Invalid Username");
        }

        // Validate Mobile Number
        String mobileNumber = relianceDigitalDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Email Address
        String emailAddress = relianceDigitalDto.getEmailAddress();
        if (emailAddress != null && emailAddress.contains("@")) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = relianceDigitalDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Check all validations
        if (isUsernameValid && isMobileNumberValid && isEmailAddressValid && isPasswordValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
