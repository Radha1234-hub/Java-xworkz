package com.xworkz.inheritenceapp.river;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new River();
        river.riverDetails();

        Ganga ganga = new Ganga();
        ganga.riverDetails();

        River ref = new Ganga();
        ref.riverDetails();

        Ganga downcasted = (Ganga) ref;
        downcasted.riverDetails();

    }
}
