package com.xworkz.homecenterapp.generatehomecenter;

import com.xworkz.homecenterapp.homecenter.HomeCenterDto;

public class GenerateHomeCenter {

    HomeCenterDto homeCenterDto;

    public boolean registerUser(HomeCenterDto homeCenterDto) {
        boolean isUserRegistered = false;

        this.homeCenterDto = homeCenterDto;

        boolean userValidated = validateUser(homeCenterDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(HomeCenterDto homeCenterDto) {
        boolean userValidated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;

        // Validate First Name
        String firstName = homeCenterDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = homeCenterDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = homeCenterDto.getEmailAddress();
        if (emailAddress != null && emailAddress.contains("@")) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = homeCenterDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Mobile Number
        String mobileNumber = homeCenterDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
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
        System.out.println("the firstname is :"+this.homeCenterDto.getFirstName());
        System.out.println("the lastname is :"+this.homeCenterDto.getLastName());
        System.out.println("the password is :"+this.homeCenterDto.getPassword());
        System.out.println("The eamil address is:"+this.homeCenterDto.getEmailAddress());
        System.out.println("the moblie number is :"+this.homeCenterDto.getMobileNumber());
    }
}
