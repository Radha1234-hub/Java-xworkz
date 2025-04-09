package com.xworkz.irctcapp.irctccreation;

import com.xworkz.irctcapp.irctc.IrctcDto;

public class IrctcCreation {

    public boolean registerUser(IrctcDto irctcDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(irctcDto);
        if (userValidated) {
            isUserRegistered = true;
        } else {
            System.out.println("User is not registered...! Try again later.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(IrctcDto irctcDto) {
        boolean userValidated = false;
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;
        boolean isSecurityQuestionValid = false;
        boolean isSecurityAnswerValid = false;
        boolean isFullNameValid = false;
        boolean isDateOfBirthValid = false;
        boolean isGenderValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailIdValid = false;
        boolean isResidentialAddressValid = false;
        boolean isNationalityValid = false;

        // Validate Username
        String username = irctcDto.getUsername();
        if (username != null && username.length() >= 3 && username.length() <= 35) {
            isUsernameValid = true;
        } else {
            System.out.println("Invalid Username");
        }

        // Validate Password
        String password = irctcDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Security Question
        String securityQuestion = irctcDto.getSecurityQuestion();
        if (securityQuestion != null && !securityQuestion.isEmpty()) {
            isSecurityQuestionValid = true;
        } else {
            System.out.println("Invalid Security Question");
        }

        // Validate Security Answer
        String securityAnswer = irctcDto.getSecurityAnswer();
        if (securityAnswer != null && !securityAnswer.isEmpty()) {
            isSecurityAnswerValid = true;
        } else {
            System.out.println("Invalid Security Answer");
        }

        // Validate Full Name
        String fullName = irctcDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Date of Birth
        String dateOfBirth = irctcDto.getDateOfBirth();
        if (dateOfBirth != null) { // Format check (e.g., DD-MM-YYYY) can be added later
            isDateOfBirthValid = true;
        } else {
            System.out.println("Invalid Date of Birth");
        }

        // Validate Gender
        if (irctcDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Invalid Gender");
        }

        // Validate Mobile Number
        String mobileNumber = irctcDto.getMobileNumber();
        if (mobileNumber != null) { // 10-digit number
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Validate Email ID
        String emailId = irctcDto.getEmailId();
        if (emailId != null) {
            isEmailIdValid = true;
        } else {
            System.out.println("Invalid Email ID");
        }

        // Validate Residential Address
        String residentialAddress = irctcDto.getResidentialAddress();
        if (residentialAddress != null && !residentialAddress.isEmpty()) {
            isResidentialAddressValid = true;
        } else {
            System.out.println("Invalid Residential Address");
        }

        // Validate Nationality
        if (irctcDto.getNationality() != null) {
            isNationalityValid = true;
        } else {
            System.out.println("Invalid Nationality");
        }

        // Check all validations
        if (isUsernameValid && isPasswordValid && isSecurityQuestionValid && isSecurityAnswerValid &&
                isFullNameValid && isDateOfBirthValid && isGenderValid && isMobileNumberValid &&
                isEmailIdValid && isResidentialAddressValid && isNationalityValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
