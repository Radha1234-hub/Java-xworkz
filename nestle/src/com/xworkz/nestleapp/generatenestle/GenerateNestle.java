package com.xworkz.nestleapp.generatenestle;

import com.xworkz.nestleapp.nestle.NestleDto;
import com.xworkz.nestleapp.constants.Gender;
import com.xworkz.nestleapp.constants.Country;

public class GenerateNestle {

    public boolean registerUser(NestleDto nestleDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(nestleDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(NestleDto nestleDto) {
        boolean userValidated = false;

        boolean isFullNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isAgeValid = false;
        boolean isGenderValid = false;
        boolean isCountryValid = false;
        boolean isMobileNumberValid = false;

        // Validate Full Name
        String fullName = nestleDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Email Address
        String emailAddress = nestleDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = nestleDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Age
        int age = nestleDto.getAge();
        if (age > 0) {
            isAgeValid = true;
        } else {
            System.out.println("Invalid Age");
        }

        // Validate Gender
        Gender gender = nestleDto.getGender();
        if (gender != null) {
            isGenderValid = true;
        } else {
            System.out.println("Invalid Gender");
        }

        // Validate Country
        Country country = nestleDto.getCountry();
        if (country != null) {
            isCountryValid = true;
        } else {
            System.out.println("Invalid Country");
        }

        // Validate Mobile Number
        String mobileNumber = nestleDto.getMobileNumber();
        if (mobileNumber != null && mobileNumber.length() == 10) {
            isMobileNumberValid = true;
        } else {
            System.out.println("Invalid Mobile Number");
        }

        // Check all validations
        if (isFullNameValid && isEmailAddressValid && isPasswordValid &&
                isAgeValid && isGenderValid && isCountryValid && isMobileNumberValid) {
            userValidated = true;
        }

        return userValidated;
    }
}
