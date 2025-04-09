package com.xworkz.digilockerapp.digilocker;

import com.xworkz.digilockerapp.constants.Gender;

public class DigiLockerDto {

    private Gender gender;
    private String fullName;
    private String mobileNumber;
    private long securityPin;
    private String emailId;
    private String aadhaarNumber;

    //fullName

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public String getFullName() {

        return fullName;
    }

    //mobileNumber

    public void setMobileNumber(String mobileNumber) {

        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {

        return mobileNumber;
    }

    //securitypin

    public void setSecurityPin(long securityPin) {

        this.securityPin = securityPin;
    }

    public long getSecurityPin() {

        return securityPin;
    }

    //emailId


    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {

        return emailId;
    }

    //AadharNumber

    public void setAadhaarNumber(String aadhaarNumber) {

        this.aadhaarNumber = aadhaarNumber;
    }

    public String getAadhaarNumber() {

        return aadhaarNumber;
    }
}
