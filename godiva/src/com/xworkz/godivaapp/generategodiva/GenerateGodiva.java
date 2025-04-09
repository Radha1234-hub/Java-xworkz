package com.xworkz.godivaapp.generategodiva;

import com.xworkz.godivaapp.godiva.GodivaDto;

public class GenerateGodiva {

    GodivaDto godivaDto;

    public boolean registerUser(GodivaDto godivaDto) {
        boolean isUserRegistered = false;

        this.godivaDto = godivaDto;

        boolean userValidated = validateUser(godivaDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(GodivaDto godivaDto) {
        boolean userValidated = false;

        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isNameValid = false;
        boolean isAddressValid = false;
        boolean isMobileNumberValid = false;

        // Validate Email Address
        String emailAddress = godivaDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = godivaDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Name
        String name = godivaDto.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }

        // Validate Address
        String address = godivaDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Mobile Number
        String mobileNumber = godivaDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Check all validations
        if (isEmailAddressValid && isPasswordValid && isNameValid && isAddressValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("The name is :"+this.godivaDto.getName());
        System.out.println("the email address is :"+this.godivaDto.getEmailAddress());
        System.out.println("the address is:"+this.godivaDto.getAddress());
        System.out.println("the password is:"+this.godivaDto.getPassword());
        System.out.println("the mobile number is :"+this.godivaDto.getMobileNumber());
    }
}
