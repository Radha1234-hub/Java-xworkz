package com.xworkz.irctcapp.irctc;

import com.xworkz.irctcapp.constants.Gender;
import com.xworkz.irctcapp.constants.Nationality;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IrctcDto {

    private String username;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private String fullName;
    private String dateOfBirth;
    private Gender gender;
    private String mobileNumber;
    private String emailId;
    private String residentialAddress;
    private Nationality nationality;

    /*
    // Username
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Password
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    // Security Question
    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    // Security Answer
    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
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
    }

    // Residential Address
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    // Nationality
    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Nationality getNationality() {
        return nationality;
    }*/
}
