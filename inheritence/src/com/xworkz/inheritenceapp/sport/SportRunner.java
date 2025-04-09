package com.xworkz.inheritenceapp.sport;

public class SportRunner {

    public static void main(String[] args) {
        Sport sport = new Sport();
        sport.sportDetails();

        Cricket cricket = new Cricket();
        cricket.sportDetails();
    }
}
