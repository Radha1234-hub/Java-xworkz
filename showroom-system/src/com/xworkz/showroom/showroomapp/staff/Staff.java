package com.xworkz.showroom.showroomapp.staff;



public class Staff {

    public int staffId;
    public String staffName;
    public String staffAddress;

    public void displayStaffInfo() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Address: " + staffAddress);
    }
}
