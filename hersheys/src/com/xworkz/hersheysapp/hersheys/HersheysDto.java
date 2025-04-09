package com.xworkz.hersheysapp.hersheys;

public class HersheysDto {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String companyName;
    private String addressLine;
    private String city;
    private String postalCode;
    private String mobileNumber;

    // First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
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

    // Company Name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    // Address Line
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getAddressLine() {
        return addressLine;
    }

    // City
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // Postal Code
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Mobile Number
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
