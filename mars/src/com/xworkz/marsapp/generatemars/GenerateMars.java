package com.xworkz.marsapp.generatemars;

import com.xworkz.marsapp.mars.MarsDto;


public class GenerateMars {
    MarsDto marsDto;

    public boolean registerUser(MarsDto marsDto) {
        boolean isUserRegistered = false;

        this.marsDto = marsDto;


        boolean userValidated = validateUser(marsDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(MarsDto marsDto) {
        boolean userValidated = false;

        boolean isFullNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isAddressValid = false;
        boolean isMobileNumberValid = false;

        // Validate Full Name
        String fullName = marsDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }


        // Validate Email Address
        String emailAddress = marsDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = marsDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Address
        String address = marsDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Mobile Number
        String mobileNumber = marsDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Check all validations
        if (isFullNameValid && isEmailAddressValid && isPasswordValid &&
                isAddressValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getMarsDetails(){
        System.out.println("The full name is"+this.marsDto.getFullName());
        System.out.println("The email address is :"+this.marsDto.getEmailAddress());
        System.out.println("The password is :"+this.marsDto.getPassword());
        System.out.println("The address is :"+this.marsDto.getAddress());
        System.out.println("The mobile number is :"+this.marsDto.getMobileNumber());
    }
}
