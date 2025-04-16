package com.xworkz.grofersapp.generategrofers;

import com.xworkz.grofersapp.grofers.GrofersDto;

public class GenerateGrofers {

    GrofersDto grofersDto;

    public boolean registerUser(GrofersDto grofersDto) {
        boolean isUserRegistered = false;
        this.grofersDto = grofersDto;

        boolean userValidated = validateUser(grofersDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(GrofersDto grofersDto) {
        boolean userValidated = false;

        boolean isUsernameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;

        // Validate Username
        String username = grofersDto.getUsername();
        if (username != null && !username.isEmpty()) {
            isUsernameValid = true;
        } else {
            System.out.println("Invalid Username");
        }

        // Validate Mobile Number
        String mobileNumber = grofersDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Email Address
        String emailAddress = grofersDto.getEmailAddress();
        if (emailAddress != null && emailAddress.contains("@")) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = grofersDto.getPassword();
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

    public void getDetails(){
        System.out.println("the user name is:"+this.grofersDto.getUsername());
        System.out.println("the password is :"+this.grofersDto.getPassword());
        System.out.println("the email address is :"+this.grofersDto.getEmailAddress());
        System.out.println("the mobile number is :"+this.grofersDto.getMobileNumber());
    }
}
