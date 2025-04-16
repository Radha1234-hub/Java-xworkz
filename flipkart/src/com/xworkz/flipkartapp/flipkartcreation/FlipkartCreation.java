package com.xworkz.flipkartapp.flipkartcreation;

import com.xworkz.flipkartapp.flipkart.FlipkartDto;

public class FlipkartCreation {

    FlipkartDto flipkartDto;

    public boolean registerUser(FlipkartDto flipkartDto) {
        boolean isUserRegistered = false;
        this.flipkartDto = flipkartDto;

        boolean userValidated = validateUser(flipkartDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(FlipkartDto flipkartDto) {
        boolean userValidated = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;

        // Validate Full Name
        String fullName = flipkartDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Mobile Number
        String mobileNumber = flipkartDto.getMobileNumber();
        if (mobileNumber != null ) { // Validate 10-digit number
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Email Address
        String emailAddress = flipkartDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = flipkartDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Check all validations
        if (isFullNameValid && isMobileNumberValid && isEmailAddressValid && isPasswordValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("the name is :"+this.flipkartDto.getFullName());
        System.out.println("the email is :"+this.flipkartDto.getEmailAddress());
        System.out.println("the password is :"+this.flipkartDto.getPassword());
        System.out.println("the mobile number is:"+this.flipkartDto.getMobileNumber());
    }
}
