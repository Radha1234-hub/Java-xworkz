package com.xworkz.inheritenceapp.monument;

public class MonumentRunner {
    public static void main(String[] args) {
        Monument monument = new Monument();
        monument.monumentDetails();

        TajMahal tajMahal = new TajMahal();
        tajMahal.monumentDetails();

    Monument ref = new TajMahal();
    ref.monumentDetails();

        TajMahal downcasted = (TajMahal) ref;
        downcasted.monumentDetails();

    }
}
