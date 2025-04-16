package com.xworkz.digilockerapp.digilockercreation;

import com.xworkz.digilockerapp.digilocker.DigiLockerDto;

public class DigiLockerCreation {

    public boolean registerUser(DigiLockerDto digiLockerDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(digiLockerDto);
        if (userValidated)
            isUserRegistered = true;
        else
            System.out.println("User is not registered...! Try again later.");
        return isUserRegistered;
    }

    public boolean validateUser(DigiLockerDto digiLockerDto) {
        boolean userValidated = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isSecurityPinValid = false;
        boolean isEmailIdValid = false;
        boolean isAadhaarNumberValid = false;

        // Validate Full Name
        String fullName = digiLockerDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Mobile Number
        String mobileNumber = digiLockerDto.getMobileNumber();
        if (mobileNumber != null) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Security PIN
        long securityPin = digiLockerDto.getSecurityPin();
        if (securityPin > 1 && securityPin <= 10) { // Assuming 6-digit PIN
            isSecurityPinValid = true;
        } else {
            System.out.println("Invalid Security PIN");
        }

        // Validate Email ID
        String emailId = digiLockerDto.getEmailId();
        if (emailId != null ) {
            isEmailIdValid = true;
        } else {
            System.out.println("Invalid Email ID");
        }

        // Validate Aadhaar Number
        String aadhaarNumber = digiLockerDto.getAadhaarNumber();
        if (aadhaarNumber !=null) { // Aadhaar should have 12 digits
            isAadhaarNumberValid = true;
        } else {
            System.out.println("Invalid Aadhaar Number");
        }

        // Check all validations
        if (isFullNameValid && isMobileNumberValid && isSecurityPinValid && isEmailIdValid && isAadhaarNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }
}

