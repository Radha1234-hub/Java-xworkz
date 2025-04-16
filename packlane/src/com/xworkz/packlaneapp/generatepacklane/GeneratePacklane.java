package com.xworkz.packlaneapp.generatepacklane;

import com.xworkz.packlaneapp.packlane.PacklaneDto;

public class GeneratePacklane {

    PacklaneDto packlaneDto;

    public boolean registerUser(PacklaneDto packlaneDto) {
        boolean isUserRegistered = false;

        this.packlaneDto = packlaneDto;

        boolean userValidated = validateUser(packlaneDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(PacklaneDto packlaneDto) {
        boolean userValidated = false;

        boolean isFullNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isAddressValid = false;
        boolean isCompanyNameValid = false;

        // Validate Full Name
        String fullName = packlaneDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Email Address
        String emailAddress = packlaneDto.getEmailAddress();
        if (emailAddress != null && emailAddress.contains("@")) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = packlaneDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Address
        String address = packlaneDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Company Name
        String companyName = packlaneDto.getCompanyName();
        if (companyName == null || companyName.isEmpty()) {
            isCompanyNameValid = true; // Optional field
        } else {
            isCompanyNameValid = true;
        }

        // Check all validations
        if (isFullNameValid && isEmailAddressValid && isPasswordValid &&
                isAddressValid && isCompanyNameValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("the full name is :"+this.packlaneDto.getFullName());
        System.out.println("the password is :"+this.packlaneDto.getPassword());
        System.out.println("the address is :"+this.packlaneDto.getAddress());
        System.out.println("the email is :"+this.packlaneDto.getEmailAddress());
        System.out.println("the company name is :"+this.packlaneDto.getCompanyName());
    }
}
