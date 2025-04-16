package com.xworkz.aadhaarapp.aadhaarcreation;
import com.xworkz.aadhaarapp.aadhaar.AadharDto;

public class AadharCreation {


        public boolean registerUser(AadharDto aadhaarDto) {
            boolean isUserRegistered = false;

            boolean userValidated = validateUser(aadhaarDto);
            if (userValidated)
                isUserRegistered = true;
            else
                System.out.println("User is not registered...! Try again later.");
            return isUserRegistered;
        }

        public boolean validateUser(AadharDto aadhaarDto) {
            boolean userValidated = false;
            boolean isFullNameValid = false;
            boolean isDateOfBirthValid = false;
            boolean isGenderValid = false;
            boolean isMobileNumberValid = false;
            boolean isEmailIdValid = false;
            boolean isResidentialAddressValid = false;
            boolean isBiometricDataValid = false;

            // Validate Full Name
            String fullName = aadhaarDto.getFullName();
            if (fullName != null && !fullName.isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name");
            }

            // Validate Date of Birth
            String dateOfBirth = aadhaarDto.getDateOfBirth();
            if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
                isDateOfBirthValid = true;
            } else {
                System.out.println("Invalid Date of Birth");
            }

            // Validate Gender
            if (aadhaarDto.getGender() != null) {
                isGenderValid = true;
            } else {
                System.out.println("Invalid Gender");
            }

            // Validate Mobile Number
            String mobileNumber = aadhaarDto.getMobileNumber();
            if (mobileNumber != null) {
                isMobileNumberValid = true;
            } else {
                System.out.println("Invalid Mobile Number");
            }

            // Validate Email ID
            String emailId = aadhaarDto.getEmailId();
            if (emailId != null && emailId.contains("@")) {
                isEmailIdValid = true;
            } else {
                System.out.println("Invalid Email ID");
            }

            // Validate Residential Address
            String residentialAddress = aadhaarDto.getResidentialAddress();
            if (residentialAddress != null && !residentialAddress.isEmpty()) {
                isResidentialAddressValid = true;
            } else {
                System.out.println("Invalid Residential Address");
            }

            // Validate Biometric Data
            String biometricData = aadhaarDto.getBiometricData();
            if (biometricData != null && !biometricData.isEmpty()) {
                isBiometricDataValid = true;
            } else {
                System.out.println("Invalid Biometric Data");
            }

            // Check all validations
            if (isFullNameValid && isDateOfBirthValid && isGenderValid && isMobileNumberValid &&
                    isEmailIdValid && isResidentialAddressValid && isBiometricDataValid) {
                userValidated = true;
            }

            return userValidated;
        }}

