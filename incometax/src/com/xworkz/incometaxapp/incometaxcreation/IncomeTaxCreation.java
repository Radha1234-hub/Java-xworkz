package com.xworkz.incometaxapp.incometaxcreation;

import com.xworkz.incometaxapp.incometax.IncomeTaxDto;

public class IncomeTaxCreation {

    public boolean registerUser(IncomeTaxDto incomeTaxDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(incomeTaxDto);
        if (userValidated)
            isUserRegistered = true;
        else
            System.out.println("User is not registered...! Try again later.");
        return isUserRegistered;
    }

    public boolean validateUser(IncomeTaxDto incomeTaxDto) {
        boolean userValidated = false;
        boolean isPanValid = false;
        boolean isFullNameValid = false;
        boolean isDateOfBirthValid = false;
        boolean isGenderValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailIdValid = false;

        // Validate PAN
        String pan = incomeTaxDto.getPan();
        if (pan != null ) { // PAN Format: 5 letters, 4 digits, 1 letter
            isPanValid = true;
        } else {
            System.out.println("Invalid PAN");
        }

        // Validate Full Name
        String fullName = incomeTaxDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Date of Birth
        String dateOfBirth = incomeTaxDto.getDateOfBirth();
        if (dateOfBirth != null) { // DOB Format: DD-MM-YYYY
            isDateOfBirthValid = true;
        } else {
            System.out.println("Invalid Date of Birth");
        }

        // Validate Gender
        if (incomeTaxDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Invalid Gender");
        }

        // Validate Mobile Number
        String mobileNumber = incomeTaxDto.getMobileNumber();
        if (mobileNumber != null) { // 10-digit mobile number
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Email ID
        String emailId = incomeTaxDto.getEmailId();
        if (emailId != null) {
            isEmailIdValid = true;
        } else {
            System.out.println("Invalid Email ID");
        }

        // Check all validations
        if (isPanValid && isFullNameValid && isDateOfBirthValid && isGenderValid &&
                isMobileNumberValid && isEmailIdValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
