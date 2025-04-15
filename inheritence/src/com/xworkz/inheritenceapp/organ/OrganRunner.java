package com.xworkz.inheritenceapp.organ;

public class OrganRunner {
    public static void main(String[] args) {
        Organ organ = new Organ();
        organ.organDetails();
        organ.organFunctions();
        organ.organTypes();
        organ.organComposition();
        organ.organInteraction();

        System.out.println("\n");

        Organ ref = new Heart();
        ref.organDetails();
        ref.organFunctions();
        ref.organTypes();
        ref.organComposition();
        ref.organInteraction();

        System.out.println("\n");

        Heart heart = new Heart();
        heart.organDetails();
        heart.heartStructure();
        heart.bloodCirculation();
        heart.heartBeat();
        heart.heartHealth();



    }
}
