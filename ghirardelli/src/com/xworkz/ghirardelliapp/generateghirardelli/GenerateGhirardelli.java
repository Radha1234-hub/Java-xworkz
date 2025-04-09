package com.xworkz.ghirardelliapp.generateghirardelli;

import com.xworkz.ghirardelliapp.ghirardelli.GhirardelliDto;

public class GenerateGhirardelli {

    GhirardelliDto ghirardelliDto;

    public boolean registerUser(GhirardelliDto ghirardelliDto) {
        boolean isUserRegistered = false;

        this.ghirardelliDto = ghirardelliDto;

        boolean userValidated = validateUser(ghirardelliDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(GhirardelliDto ghirardelliDto) {
        boolean userValidated = false;

        boolean isFullNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isAddressValid = false;
        boolean isMobileNumberValid = false;

        // Validate Full Name
        String fullName = ghirardelliDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Email Address
        String emailAddress = ghirardelliDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = ghirardelliDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Address
        String address = ghirardelliDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Mobile Number
        String mobileNumber = ghirardelliDto.getMobileNumber();
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

    public void getDetails(){
        System.out.println("the name is :"+this.ghirardelliDto.getFullName());
        System.out.println("the password is :"+this.ghirardelliDto.getPassword());
        System.out.println("the address is :"+this.ghirardelliDto.getAddress());
        System.out.println("the email address is:"+this.ghirardelliDto.getEmailAddress());
        System.out.println("the mobile number is :"+this.ghirardelliDto.getMobileNumber());
    }
}
