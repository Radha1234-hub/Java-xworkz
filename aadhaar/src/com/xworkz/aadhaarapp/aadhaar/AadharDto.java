package com.xworkz.aadhaarapp.aadhaar;

import com.xworkz.aadhaarapp.constants.Gender;


public class AadharDto {

    private Gender gender;
    private String fullName;
    private String dateOfBirth;       // Date of Birth
    private String mobileNumber;
    private String emailId;
    private String residentialAddress; // Residential Address
    private String biometricData;      // Biometric Data

    // Full Name
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    // Date of Birth
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Gender
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    // Mobile Number
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Email ID
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    // Residential Address
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    // Biometric Data
    public void setBiometricData(String biometricData) {
        this.biometricData = biometricData;
    }

    public String getBiometricData() {
        return biometricData;
    }
}

