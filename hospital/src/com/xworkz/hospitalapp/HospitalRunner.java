package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.floor.Floor;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.rooms.Rooms;

public class HospitalRunner {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.hospitalName = "Appolo";
        hospital.hospitalLocation = "Bangalore";

        Floor floors[]=new Floor[2];

        Floor floors1 = new Floor();
        floors1.floorNumber = 1;
        floors1.noOfRooms = 2;

        Rooms rooms[]= new Rooms[2];

        Rooms rooms1 = new Rooms();
        rooms1.roomNumber = 1;
        rooms1.typeOfRoom = "superdelux";
        rooms1.noOfPatients = 1;

        Patient patients[] = new Patient[3];

        Patient patient1 = new Patient();

        patient1.setPatientName("Raju");
        patient1.setBedNumber(1);
        patient1.setPhoneNumber(6767676767L);
        patient1.setIllness("Heart attack");

         patients[0]=patient1;
        rooms1.patients=patients;
        rooms[0] = rooms1;

        floors1.rooms = rooms;
        floors[0] = floors1;


        Rooms rooms2 = new Rooms();
        rooms2.roomNumber = 2;
        rooms2.typeOfRoom = "Semi";
        rooms2.noOfPatients = 2;

        Patient patient2 = new Patient();

        patient2.setPatientName("Rama");
        patient2.setBedNumber(2);
        patient2.setPhoneNumber(8888888888L);
        patient2.setIllness("Leg fracture");
        patients[1]=patient2;

        Patient patient3 = new Patient();

        patient3.setPatientName("Ramya");
        patient3.setBedNumber(3);
        patient3.setPhoneNumber(9999999888L);
        patient3.setIllness("Head injury");

        patients[2]=patient3;

        rooms2.patients=patients;


        rooms[1] = rooms2;



        //2nd floor

        Floor floors2 = new Floor();
        floors2.floorNumber = 2;
        floors2.noOfRooms = 2;

        Rooms roomss1 []= new Rooms[2];

        Rooms rooms3 = new Rooms();
        rooms3.roomNumber = 1;
        rooms3.typeOfRoom = "superdelux";
        rooms3.noOfPatients = 1;

        Patient patients1[] = new Patient[3];

        Patient patient4 = new Patient();

        patient4.setPatientName("Rajanna");
        patient4.setBedNumber(1);
        patient4.setPhoneNumber(667431357687L);
        patient4.setIllness("Ear bleeding");


        patients1[0]=patient1;
        rooms3.patients=patients;
        roomss1[0] = rooms3;



        Rooms rooms4 = new Rooms();
        rooms4.roomNumber = 2;
        rooms4.typeOfRoom = "Semi";
        rooms4.noOfPatients = 2;

        Patient patient5 = new Patient();

        patient5.setPatientName("Ravana");
        patient5.setBedNumber(2);
        patient5.setPhoneNumber(8888888888L);
        patient5.setIllness("Kidney surgery");
        patients[1]=patient5;

        Patient patient6 = new Patient();

        patient6.setPatientName("Lavan");
        patient6.setBedNumber(3);
        patient6.setPhoneNumber(99564577L);
        patient6.setIllness("Lung issue");
        patients[2] = patient6;

        rooms4.patients=patients;


        roomss1[1] = rooms4;
        floors[1]=floors2;














        hospital.floors = floors;

        hospital.getHospitalInfo();








    }
}
