package com.xworkz.inheritenceapp.stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();
        stationery.stationeryDetails();

        Pencil pencil = new Pencil();
        pencil.stationeryDetails();

        Stationery ref = new Pencil();
        ref.stationeryDetails();

        Pencil downcasted = (Pencil) ref;
        downcasted.stationeryDetails();

    }
}
