package com.xworkz.walmartapp.walmartcreation;

import com.xworkz.walmartapp.walmart.WalmartDto;

public class WalmartCreation {

    WalmartDto walmartDto;

    public boolean registerUser(WalmartDto walmartDto) {
        boolean isUserRegistered = false;

        this.walmartDto = walmartDto;

        boolean userValidated = validateUser(walmartDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(WalmartDto walmartDto) {
        boolean userValidated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isShippingAddressValid = false;

        // Validate First Name
        String firstName = walmartDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = walmartDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = walmartDto.getEmailAddress();
        if (emailAddress != null && emailAddress.contains("@")) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = walmartDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Mobile Number (optional)
        String mobileNumber = walmartDto.getMobileNumber();
        if (mobileNumber == null) { // Validate 10-digit phone number if present
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Shipping Address
        String shippingAddress = walmartDto.getShippingAddress();
        if (shippingAddress != null && !shippingAddress.isEmpty()) {
            isShippingAddressValid = true;
        } else {
            System.out.println("Invalid Shipping Address");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isMobileNumberValid && isShippingAddressValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("The first name is :"+this.walmartDto.getFirstName());
        System.out.println("the last name is :"+this.walmartDto.getLastName());
        System.out.println("the password is :"+this.walmartDto.getPassword());
        System.out.println("The email adress is :"+this.walmartDto.getEmailAddress());
        System.out.println("The mobile number is :"+this.walmartDto.getMobileNumber());
        System.out.println("the shipping address is :"+this.walmartDto.getShippingAddress());
    }
}
