package com.xworkz.chocoloveapp.generatechocolove;

import com.xworkz.chocoloveapp.chocolove.ChocoloveDto;

public class GenerateChocolove {

    public boolean registerUser(ChocoloveDto chocoloveDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(chocoloveDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(ChocoloveDto chocoloveDto) {
        boolean userValidated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isStreetAddressValid = false;
        boolean isCityValid = false;
        boolean isStateValid = false;
        boolean isPostalCodeValid = false;

        // Validate First Name
        String firstName = chocoloveDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = chocoloveDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = chocoloveDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = chocoloveDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Street Address
        String streetAddress = chocoloveDto.getStreetAddress();
        if (streetAddress != null && !streetAddress.isEmpty()) {
            isStreetAddressValid = true;
        } else {
            System.out.println("Invalid Street Address");
        }

        // Validate City
        String city = chocoloveDto.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        } else {
            System.out.println("Invalid City");
        }

        // Validate State
        String state = chocoloveDto.getState();
        if (state != null && !state.isEmpty()) {
            isStateValid = true;
        } else {
            System.out.println("Invalid State");
        }

        // Validate Postal Code
        String postalCode = chocoloveDto.getPostalCode();
        if (postalCode != null ) {
            isPostalCodeValid = true;
        } else {
            System.out.println("Invalid Postal Code");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isStreetAddressValid && isCityValid &&
                isStateValid && isPostalCodeValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
