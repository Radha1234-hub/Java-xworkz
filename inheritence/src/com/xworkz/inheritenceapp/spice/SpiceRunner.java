package com.xworkz.inheritenceapp.spice;

public class SpiceRunner {
    public static void main(String[] args) {
        Spice spice = new Spice();
        spice.spiceDetails();

        Pepper pepper = new Pepper();
        pepper.spiceDetails();

    Spice ref = new Pepper();
    ref.spiceDetails();

        Pepper downcasted = (Pepper) ref;
        downcasted.spiceDetails();

    }
}
