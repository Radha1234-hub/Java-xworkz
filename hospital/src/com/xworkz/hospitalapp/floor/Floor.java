package com.xworkz.hospitalapp.floor;

import com.xworkz.hospitalapp.rooms.Rooms;

public class Floor {

    public int floorNumber;
    public int noOfRooms;
    public Rooms rooms[];

    public void getFloorInfo(){
        System.out.println("The floor number is "+floorNumber);
        System.out.println("The no of rooms in the floor is"+noOfRooms);

        for(Rooms room:rooms){
            room.getRoomInfo();
        }
    }
}
