package com.xworkz.showroom;
import com.xworkz.showroom.showroomapp.manager.Manager;

public class ShowRoom {

    public int showroomId;
    public String showroomBranches[];
    public String location;
    public Manager managers[];

    public void displayShowRoomInfo() {
        System.out.println("ShowRoom ID: " + showroomId);
        System.out.println("ShowRoom Branches:");
        for (String branch : showroomBranches) {
            System.out.println(branch);
        }
        System.out.println("Location: " + location);
        for (Manager manager : managers) {
            manager.displayManagerInfo();
        }
    }
}
