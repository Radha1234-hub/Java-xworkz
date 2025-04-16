package com.xworkz.nestleapp.nestle;

import com.xworkz.nestleapp.constants.Gender;
import com.xworkz.nestleapp.constants.Country;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NestleDto {

    private String fullName;
    private String emailAddress;
    private String password;
    private int age;
    private Gender gender;
    private Country country;
    private String mobileNumber;

    /*
    // Full Name
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    // Email Address
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Password
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    // Age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Gender
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    // Country
    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    // Mobile Number
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }*/
}
