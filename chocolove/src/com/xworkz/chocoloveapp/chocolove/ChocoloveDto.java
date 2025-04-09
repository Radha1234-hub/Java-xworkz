package com.xworkz.chocoloveapp.chocolove;

public class ChocoloveDto {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;

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

    // Street Address
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    // City
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // State
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Postal Code
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
