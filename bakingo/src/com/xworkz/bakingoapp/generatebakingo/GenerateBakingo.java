package com.xworkz.bakingoapp.generatebakingo;

import com.xworkz.bakingoapp.bakingo.BakingoDto;

public class GenerateBakingo {

    public boolean registerUser(BakingoDto bakingoDto) {
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(bakingoDto);
        if (userValidated) {
            isUserRegistered = true;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration unsuccessful...! Please try again.");
        }
        return isUserRegistered;
    }

    public boolean validateUser(BakingoDto bakingoDto) {
        boolean userValidated = false;

        boolean isFullNameValid = false;
        boolean isEmailAddressValid = false;
        boolean isPasswordValid = false;
        boolean isAddressValid = false;
        boolean isMobileNumberValid = false;

        // Validate Full Name
        String fullName = bakingoDto.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Full Name");
        }

        // Validate Email Address
        String emailAddress = bakingoDto.getEmailAddress();
        if (emailAddress != null ) {
            isEmailAddressValid = true;
        } else {
            System.out.println("Invalid Email Address");
        }

        // Validate Password
        String password = bakingoDto.getPassword();
        if (password != null && password.length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password");
        }

        // Validate Address
        String address = bakingoDto.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address");
        }

        // Validate Mobile Number
        String mobileNumber = bakingoDto.getMobileNumber();
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
}
