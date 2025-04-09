package com.xworkz.bestbuyapp.bestcreation;

import com.xworkz.bestbuyapp.bestbuy.BestBuyDto;

public class BestBuyCreation {

    public boolean registerUser(BestBuyDto bestBuyDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(bestBuyDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(BestBuyDto bestBuyDto) {
        boolean userValidated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;

        // Validate First Name
        String firstName = bestBuyDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = bestBuyDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = bestBuyDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = bestBuyDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Mobile Number (optional)
        String mobileNumber = bestBuyDto.getMobileNumber();
        if (mobileNumber == null) { // Validate 10-digit number if present
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
