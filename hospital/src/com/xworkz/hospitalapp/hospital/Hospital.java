package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.floor.Floor;

public class Hospital {

    public String hospitalName;
    public String hospitalLocation;
    public Floor floors[];

    public void getHospitalInfo(){

        System.out.println("The hospital name is :"+hospitalName);
        System.out.println("The hospital locations is:"+hospitalLocation);

        for(Floor floor:floors){
            floor.getFloorInfo();
        }
    }

}
