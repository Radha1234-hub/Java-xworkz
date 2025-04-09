package com.xworkz.urbanladderapp.urbanladdercreation;

import com.xworkz.urbanladderapp.urbanladder.UrbanLadderDto;

public class GenerateUrbanLadder {

    UrbanLadderDto urbanLadderDto;

    public boolean registerUser(UrbanLadderDto urbanLadderDto) {
        boolean isUserRegistered = false;

        this.urbanLadderDto = urbanLadderDto;

        boolean userValidated = validateUser(urbanLadderDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(UrbanLadderDto urbanLadderDto) {
        boolean userValidated = false;

        boolean isNameValid = false;
        boolean isAddressValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;

        // Validate Name
        String name = urbanLadderDto.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }

        // Validate Address
        String address = urbanLadderDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Email Address
        String emailAddress = urbanLadderDto.getEmailAddress();
        if (emailAddress != null && emailAddress.contains("@")) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = urbanLadderDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Check all validations
        if (isNameValid && isAddressValid && isEmailAddressValid && isPasswordValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("The name is:"+this.urbanLadderDto.getName());
        System.out.println("the address is:"+this.urbanLadderDto.getAddress());
        System.out.println("the eamil address is:"+this.urbanLadderDto.getEmailAddress());
        System.out.println("the password is :"+this.urbanLadderDto.getPassword());
    }
}
