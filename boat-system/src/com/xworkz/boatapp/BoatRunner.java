package com.xworkz.boatapp;

import com.xworkz.boatapp.boat.Boat;

public class BoatRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

         Boat ref = new Boat();

         ref.setBoatId(1);
         ref.setBoatName("Santhosh boat");
         ref.setBoatOwner("Santhosh");
         ref.setBoatType("Sail boat");

         int boatId = ref.getBoatId();
        System.out.println("The boat id is :"+boatId);

        String boatName = ref.getBoatName();
        System.out.println("The boat name is :"+boatName);

        String boatOwner = ref.getBoatOwner();
        System.out.println("The boat owner is :"+boatOwner);

        String boatType = ref.getBoatType();
        System.out.println("The boat type is :"+boatType);



        System.out.println("Main ended ");

    }
}
