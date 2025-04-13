package com.xworkz.inheritenceapp.civilization;

public class CivilizationRunner {
    public static void main(String[] args) {
        Civilization civilization = new Civilization();
        civilization.civilizationDetails();

        Indus indus = new Indus();
        indus.civilizationDetails();

        Civilization ref = new Indus();
        ref.civilizationDetails();

        Indus downcasted = (Indus) ref;
        downcasted.civilizationDetails();
    }
}
