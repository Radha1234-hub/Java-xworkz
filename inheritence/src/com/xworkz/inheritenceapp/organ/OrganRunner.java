package com.xworkz.inheritenceapp.organ;

public class OrganRunner {
    public static void main(String[] args) {
    Organ organ = new Organ();
    organ.organDetails();

    Heart heart = new Heart();
    heart.organDetails();

    Organ ref = new Heart();
    ref.organDetails();

        Heart downcasted = (Heart) ref;
        downcasted.organDetails();



    }
}
