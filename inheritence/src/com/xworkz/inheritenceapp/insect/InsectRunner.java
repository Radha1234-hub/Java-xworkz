package com.xworkz.inheritenceapp.insect;

public class InsectRunner {


        public static void main(String[] args) {
            // Creating a copy of the parent class and invoking 5 methods
            Inscet inscet = new Inscet();
            inscet.insectDetails();
            inscet.inscetRole();
            inscet.inscetDiversity();
            inscet.inscetFeatures();
            inscet.inscetSurvival();

            System.out.println("\n");

            // Creating a copy of the subclass using parent reference type and invoking 5 methods
            Inscet ref = new ButterFly();
            ref.insectDetails();
            ref.inscetRole();
            ref.inscetDiversity();
            ref.inscetFeatures();
            ref.inscetSurvival();

            System.out.println("\n");

            // Creating a copy of the subclass using subclass reference type and invoking 5 methods
            ButterFly butterfly = new ButterFly();
            butterfly.insectDetails();
            butterfly.butterflyWings();
            butterfly.butterflyLifeCycle();
            butterfly.butterflyPollination();
            butterfly.butterflyHabitat();
        }
    }