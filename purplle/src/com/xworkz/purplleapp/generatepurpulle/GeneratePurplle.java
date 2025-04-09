package com.xworkz.purplleapp.purpllecreation;

import com.xworkz.purplleapp.purplle.PurplleDto;

public class GeneratePurplle {

    PurplleDto purplleDto;

    public boolean registerUser(PurplleDto purplleDto) {
        boolean isUserRegistered = false;
        this.purplleDto = purplleDto;
        boolean userValidated = validateUser(purplleDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(PurplleDto purplleDto) {
        boolean userValidated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isAddressValid = false;
        boolean isEmailAddressOrMobileValid = false;
        boolean isPasswordValid = false;

        // Validate First Name
        String firstName = purplleDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = purplleDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Address
        String address = purplleDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Email Address or Mobile Number
        String emailAddress = purplleDto.getEmailAddress();
        String mobileNumber = purplleDto.getMobileNumber();
        if ((emailAddress != null && emailAddress.contains("@")) ||
                (mobileNumber != null && mobileNumber.length() == 10)) {
            isEmailAddressOrMobileValid = true;
        } else {
            System.out.println("Invalid Email Address or Mobile Number");
        }

        // Validate Password
        String password = purplleDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isAddressValid &&
                isEmailAddressOrMobileValid && isPasswordValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getDetails(){
        System.out.println("the first name is :"+this.purplleDto.getFirstName());
        System.out.println("the last name is :"+this.purplleDto.getLastName());
        System.out.println("the address is :"+this.purplleDto.getAddress());
        System.out.println("the email address is :"+this.purplleDto.getEmailAddress());
        System.out.println("the mobile number is:"+this.purplleDto.getMobileNumber());
        System.out.println("the password is :"+this.purplleDto.getPassword());
    }
}
