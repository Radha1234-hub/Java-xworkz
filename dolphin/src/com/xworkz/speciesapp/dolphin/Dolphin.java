package com.xworkz.speciesapp.dolphin;

import com.xworkz.speciesapp.mammal.Mammal;

public class Dolphin extends Mammal {

    @Override
    public void habitat() {
        System.out.println("Dolphins live in aquatic environments like oceans and rivers.");
    }

    @Override
    public void characteristics() {
        System.out.println("Dolphins are marine mammals known for their intelligence and sleek bodies.");
    }

    @Override
    public void locomotion() {
        System.out.println("Dolphins swim efficiently using their tail flukes and fins.");
    }

    @Override
    public void feeding() {
        System.out.println("Dolphins primarily feed on fish and squid, using echolocation to hunt.");
    }

    @Override
    public void communication() {
        System.out.println("Dolphins communicate through clicks, whistles, and body language.");
    }

    public void echolocation() {
        System.out.println("Dolphins use echolocation to navigate and hunt in dark or murky waters.");
    }

    public void socialBehavior() {
        System.out.println("Dolphins are highly social and often travel in pods.");
    }
}
