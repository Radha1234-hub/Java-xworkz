package com.xworkz.urbanladderapp.urbanladder;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter


public class UrbanLadderDto {

    private String name;             // Name of the user
    private String address;          // Address of the user
    private String emailAddress;     // Registered Email ID
    private String password;         // Secure Password

    /*
    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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
    }*/
}
