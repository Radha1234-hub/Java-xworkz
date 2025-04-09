package com.xworkz.targetapp.targetcreation;

import com.xworkz.targetapp.target.TargetDto;

public class TargetCreation {

    public boolean registerUser(TargetDto targetDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(targetDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(TargetDto targetDto) {
        boolean userValidated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isMobilePhoneNumberValid = false;

        // Validate First Name
        String firstName = targetDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = targetDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = targetDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = targetDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Mobile Phone Number (optional)
        String mobilePhoneNumber = targetDto.getMobilePhoneNumber();
        if (mobilePhoneNumber == null) { // Validate 10-digit phone number if present
            isMobilePhoneNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Phone Number");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isMobilePhoneNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
