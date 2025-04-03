package com.xworkz.showroom;

import com.xworkz.showroom.ShowRoom;
import com.xworkz.showroom.showroomapp.manager.Manager;
import com.xworkz.showroom.showroomapp.staff.Staff;

public class ShowRoomRunner {

    public static void main(String[] args) {
        String branches[] = {"Jayanagar", "Rajajinagar", "JP Nagar"};

        ShowRoom showroom = new ShowRoom();
        showroom.showroomId = 1;
        showroom.showroomBranches = branches;
        showroom.location = "Bangalore";

        Manager managers[] = new Manager[2];

        // Manager 1
        Manager manager1 = new Manager();
        manager1.managerId = 101;
        manager1.managerName = "Ramesh";
        Staff staff1[] = new Staff[2];

        Staff staffMember1 = new Staff();
        staffMember1.staffId = 1;
        staffMember1.staffName = "Suresh";
        staffMember1.staffAddress = "Jayanagar";

        Staff staffMember2 = new Staff();
        staffMember2.staffId = 2;
        staffMember2.staffName = "Mahesh";
        staffMember2.staffAddress = "Rajajinagar";

        staff1[0] = staffMember1;
        staff1[1] = staffMember2;
        manager1.staff = staff1;

        // Manager 2
        Manager manager2 = new Manager();
        manager2.managerId = 102;
        manager2.managerName = "Ganesh";
        Staff staff2[] = new Staff[2];

        Staff staffMember3 = new Staff();
        staffMember3.staffId = 3;
        staffMember3.staffName = "Naresh";
        staffMember3.staffAddress = "JP Nagar";

        Staff staffMember4 = new Staff();
        staffMember4.staffId = 4;
        staffMember4.staffName = "Rakesh";
        staffMember4.staffAddress = "Whitefield";

        staff2[0] = staffMember3;
        staff2[1] = staffMember4;
        manager2.staff = staff2;

        managers[0] = manager1;
        managers[1] = manager2;

        showroom.managers = managers;

        showroom.displayShowRoomInfo();
    }
}

