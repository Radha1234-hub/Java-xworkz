package com.xworkz.hospitalapp.patient;

public class Patient {

    private String patientName ;
    private int bedNumber;
    private long phoneNumber;
    private String illness;

    //name


    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName(){
        return patientName;
    }


  //bed number
    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    //phone number

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    //illness


    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }
}
