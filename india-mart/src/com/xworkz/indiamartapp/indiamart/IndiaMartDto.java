package com.xworkz.indiamartapp.indiamart;

public class IndiaMartDto {

    private String mobileNumber;     // Mobile Number
    private String emailAddress;     // Registered Email Address
    private String name;             // User Name or Company Name
    private String productDetail;    // Details about the Product

    // Mobile Number
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Email Address
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Product Detail
    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductDetail() {
        return productDetail;
    }
}
