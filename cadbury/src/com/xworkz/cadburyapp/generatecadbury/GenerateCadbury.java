package com.xworkz.cadburyapp.generatecadbury;

import com.xworkz.cadburyapp.cadbury.CadburyDto;

public class GenerateCadbury {

    public boolean registerUser(CadburyDto cadburyDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(cadburyDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(CadburyDto cadburyDto) {
        boolean userValidated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isStreetAddressValid = false;
        boolean isCityValid = false;
        boolean isStateValid = false;
        boolean isPostalCodeValid = false;
        boolean isMobileNumberValid = false;

        // Validate First Name
        String firstName = cadburyDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = cadburyDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = cadburyDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = cadburyDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Street Address
        String streetAddress = cadburyDto.getStreetAddress();
        if (streetAddress != null && !streetAddress.isEmpty()) {
            isStreetAddressValid = true;
        } else {
            System.out.println("Invalid Street Address");
        }

        // Validate City
        String city = cadburyDto.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        } else {
            System.out.println("Invalid City");
        }

        // Validate State
        String state = cadburyDto.getState();
        if (state != null && !state.isEmpty()) {
            isStateValid = true;
        } else {
            System.out.println("Invalid State");
        }

        // Validate Postal Code
        String postalCode = cadburyDto.getPostalCode();
        if (postalCode != null) {
            isPostalCodeValid = true;
        } else {
            System.out.println("Invalid Postal Code");
        }

        // Validate Mobile Number
        String mobileNumber = cadburyDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isStreetAddressValid && isCityValid &&
                isStateValid && isPostalCodeValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
