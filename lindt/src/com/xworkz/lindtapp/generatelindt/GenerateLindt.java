package com.xworkz.lindtapp.generatelindt;

import com.xworkz.lindtapp.lindt.LindtDto;

public class GenerateLindt {

    LindtDto lindtDto;

    public boolean registerUser(LindtDto lindtDto) {
        boolean isUserRegistered = false;

        this.lindtDto = lindtDto;

        boolean userValidated = validateUser(lindtDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(LindtDto lindtDto) {
        boolean userValidated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isDateOfBirthValid = false;
        boolean isMobileNumberValid = false;


        String firstName = lindtDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }


        String lastName = lindtDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }


        String emailAddress = lindtDto.getEmailAddress();
        if (emailAddress != null) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }


        String password = lindtDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }


        String dateOfBirth = lindtDto.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        } else {
            System.out.println("Invalid Date of Birth");
        }


        String mobileNumber = lindtDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }


        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isDateOfBirthValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetais(){
        System.out.println("the first name is :"+this.lindtDto.getFirstName());
        System.out.println("the lastname is :"+this.lindtDto.getLastName());
        System.out.println("the password is :"+this.lindtDto.getPassword());
        System.out.println("the mobile number is :"+this.lindtDto.getMobileNumber());
        System.out.println("the email address is :"+this.lindtDto.getEmailAddress());
        System.out.println("the date of birth:"+this.lindtDto.getDateOfBirth());
    }
}
