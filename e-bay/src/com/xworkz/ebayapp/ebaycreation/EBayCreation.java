package com.xworkz.ebayapp.ebaycreation;

import com.xworkz.ebayapp.ebay.EBayDto;

public class EBayCreation {


        public boolean registerUser(EBayDto eBayDto) {
            boolean isUserRegistered = false;

            boolean userValidated = validateUser(eBayDto);
            if (userValidated) {
                isUserRegistered = true;
            } else {
                System.out.println("User is not registered...! Try again later.");
            }
            return isUserRegistered;
        }

        public boolean validateUser(EBayDto eBayDto) {
            boolean userValidated = false;
            boolean isEmailAddressValid = false;
            boolean isUsernameValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;
            boolean isPhoneNumberValid = false;

            // Validate Email Address
            String emailAddress = eBayDto.getEmailAddress();
            if (emailAddress != null && emailAddress.contains("@")) {
                isEmailAddressValid = true;
            } else {
                System.out.println("Invalid Email Address");
            }

            // Validate Username
            String username = eBayDto.getUsername();
            if (username != null && username.length() >= 3 && username.length() <= 35) {
                isUsernameValid = true;
            } else {
                System.out.println("Invalid Username");
            }

            // Validate Password
            String password = eBayDto.getPassword();
            if (password != null && password.length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password");
            }

            // Validate Confirm Password
            String confirmPassword = eBayDto.getConfirmPassword();
            if (confirmPassword != null && confirmPassword.equals(password)) {
                isConfirmPasswordValid = true;
            } else {
                System.out.println("Confirm Password does not match Password");
            }

            // Validate Phone Number
            String phoneNumber = eBayDto.getPhoneNumber();
            if (phoneNumber != null && phoneNumber.matches("\\d{10}")) { // Validate 10-digit phone number
                isPhoneNumberValid = true;
            } else {
                System.out.println("Invalid Phone Number");
            }

            // Check all validations
            if (isEmailAddressValid && isUsernameValid && isPasswordValid &&
                    isConfirmPasswordValid && isPhoneNumberValid) {
                userValidated = true;
            }

            return userValidated;
        }
    }


