package com.xworkz.showroom.showroomapp.manager;

import com.xworkz.showroom.showroomapp.staff.Staff;

public class Manager {

    public int managerId;
    public String managerName;
    public Staff staff[];

    public void displayManagerInfo() {
        System.out.println("Manager ID: " + managerId);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Staff Info:");
        for (Staff staffMember : staff) {
            staffMember.displayStaffInfo();
        }
    }
}

