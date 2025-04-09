package com.xworkz.hersheysapp.generatehersheys;

import com.xworkz.hersheysapp.hersheys.HersheysDto;

public class GenerateHersheys {

    public boolean registerUser(HersheysDto hersheysDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(hersheysDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(HersheysDto hersheysDto) {
        boolean userValidated = false;

        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isCompanyNameValid = false;
        boolean isAddressLineValid = false;
        boolean isCityValid = false;
        boolean isPostalCodeValid = false;
        boolean isMobileNumberValid = false;

        // Validate First Name
        String firstName = hersheysDto.getFirstName();
        if (firstName != null && !firstName.isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid First Name");
        }

        // Validate Last Name
        String lastName = hersheysDto.getLastName();
        if (lastName != null && !lastName.isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid Last Name");
        }

        // Validate Email Address
        String emailAddress = hersheysDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = hersheysDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Company Name
        String companyName = hersheysDto.getCompanyName();
        if (companyName != null && !companyName.isEmpty()) {
            isCompanyNameValid = true;
        } else {
            System.out.println("Invalid Company Name");
        }

        // Validate Address Line
        String addressLine = hersheysDto.getAddressLine();
        if (addressLine != null && !addressLine.isEmpty()) {
            isAddressLineValid = true;
        } else {
            System.out.println("Invalid Address Line");
        }

        // Validate City
        String city = hersheysDto.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        } else {
            System.out.println("Invalid City");
        }

        // Validate Postal Code
        String postalCode = hersheysDto.getPostalCode();
        if (postalCode != null && postalCode.matches("\\d+")) {
            isPostalCodeValid = true;
        } else {
            System.out.println("Invalid Postal Code");
        }

        // Validate Mobile Number
        String mobileNumber = hersheysDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Check all validations
        if (isFirstNameValid && isLastNameValid && isEmailAddressValid &&
                isPasswordValid && isCompanyNameValid && isAddressLineValid &&
                isCityValid && isPostalCodeValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
