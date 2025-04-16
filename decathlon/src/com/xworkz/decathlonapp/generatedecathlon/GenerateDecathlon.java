package com.xworkz.decathlonapp.generatedecathlon;

import com.xworkz.decathlonapp.decathlon.DecathlonDto;

public class GenerateDecathlon {

    DecathlonDto decathlonDto;

    public boolean registerUser(DecathlonDto decathlonDto) {
        boolean isUserRegistered = false;
        this.decathlonDto = decathlonDto;

        boolean userValidated = validateUser(decathlonDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(DecathlonDto decathlonDto) {
        boolean userValidated = false;

        boolean isNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;


        String name = decathlonDto.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name");
        }


        String phoneNumber = decathlonDto.getPhoneNumber();
        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } else {
            System.out.println("Invalid Phone Number");
        }


        String emailAddress = decathlonDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }


        String password = decathlonDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }


        if (isNameValid && isPhoneNumberValid && isEmailAddressValid && isPasswordValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("the name is :"+this.decathlonDto.getName());
        System.out.println("the email is :"+this.decathlonDto.getEmailAddress());
        System.out.println("the password is :"+this.decathlonDto.getPassword());
        System.out.println("the phone number is :"+this.decathlonDto.getPhoneNumber());
    }
}
