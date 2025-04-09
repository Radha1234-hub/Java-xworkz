package com.xworkz.aliexpressapp.aliexpresscreation;

import com.xworkz.aliexpressapp.aliexpress.AliExpressDto;

public class AliExpressCreation {

    AliExpressDto aliExpressDto;

    public boolean registerUser(AliExpressDto aliExpressDto) {
        boolean isUserRegistered = false;

        this.aliExpressDto = aliExpressDto;
        boolean userValidated = validateUser(aliExpressDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(AliExpressDto aliExpressDto) {
        boolean userValidated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;

        // Validate First Name
        String firstName = aliExpressDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = aliExpressDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = aliExpressDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = aliExpressDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Mobile Number (optional)
        String mobileNumber = aliExpressDto.getMobileNumber();
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

    public void getDetails(){
        System.out.println("the firstname is :"+this.aliExpressDto.getFirstName());
        System.out.println("the lastName is :"+this.aliExpressDto.getLastName());
        System.out.println("the password is :"+this.aliExpressDto.getPassword());
        System.out.println("the eamil address is :"+this.aliExpressDto.getEmailAddress());
        System.out.println("the mobile number is :"+this.aliExpressDto.getMobileNumber());

    }
}
