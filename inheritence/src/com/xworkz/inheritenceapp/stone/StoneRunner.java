package com.xworkz.inheritenceapp.stone;

public class StoneRunner {
    public static void main(String[] args) {
        Stone stone = new Stone();
        stone.stoneDetails();

        Granite granite = new Granite();
        granite.stoneDetails();

        Stone ref = new Granite();
        ref.stoneDetails();

        Granite downcasted = (Granite) ref;
        downcasted.stoneDetails();


    }
}
