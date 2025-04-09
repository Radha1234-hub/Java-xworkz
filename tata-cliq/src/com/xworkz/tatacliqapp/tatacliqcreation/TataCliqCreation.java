package com.xworkz.tatacliqapp.tatacliqcreation;

import com.xworkz.tatacliqapp.tatacliq.TataCliqDto;

public class TataCliqCreation {

    TataCliqDto tataCliqDto;

    public boolean registerUser(TataCliqDto tataCliqDto) {
        boolean isUserRegistered = false;

        this.tataCliqDto = tataCliqDto;

        boolean userValidated = validateUser(tataCliqDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(TataCliqDto tataCliqDto) {
        boolean userValidated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;

        // Validate First Name
        String firstName = tataCliqDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = tataCliqDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = tataCliqDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = tataCliqDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Mobile Number
        String mobileNumber = tataCliqDto.getMobileNumber();
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

    public  void getDetails(){
        System.out.println("the first name is:"+this.tataCliqDto.getFirstName());
        System.out.println("the last name is :"+this.tataCliqDto.getLastName());
        System.out.println("the password is :"+this.tataCliqDto.getPassword());
        System.out.println("the email address is :"+this.tataCliqDto.getEmailAddress());
        System.out.println("the mobile number is :"+this.tataCliqDto.getMobileNumber());
    }
}
