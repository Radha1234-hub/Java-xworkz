package com.xworkz.hospitalapp.rooms;


import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import com.xworkz.hospitalapp.patient.Patient;

public class Rooms {

    public int roomNumber;
    public String typeOfRoom;
    public int noOfPatients;
    public Patient patients[];

    public void getRoomInfo(){
        System.out.println("The room number is "+roomNumber);
        System.out.println("The type of room is "+typeOfRoom);
        System.out.println("Number patients are:"+noOfPatients);

        for(Patient patient:patients){

            System.out.println("The name of the patients is :"+patient.getPatientName());
            System.out.println("The bed number of the patient is :"+patient.getBedNumber());
            System.out.println("The phone number of the patient is:"+patient.getPhoneNumber());
            System.out.println("The illness of the patient is:"+patient.getIllness());
        }
    }
}
