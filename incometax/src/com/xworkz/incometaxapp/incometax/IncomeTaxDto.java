package com.xworkz.incometaxapp.incometax;

import lombok.Getter;
import lombok.Setter;


import com.xworkz.incometaxapp.constants.Gender;
@Getter
@Setter

public class IncomeTaxDto {
    private String pan;
    private String fullName;
    private String dateOfBirth;
    private Gender gender;
    private String mobileNumber;
    private String emailId;
/*
    // PAN
    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPan() {
        return pan;
    }

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
    }*/
}
