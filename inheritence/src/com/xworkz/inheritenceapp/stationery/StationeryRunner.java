package com.xworkz.inheritenceapp.stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();
        stationery.stationeryDetails();
        stationery.stationeryTypes();
        stationery.usesInEducation();
        stationery.creativeApplications();
        stationery.ecoFriendlyOptions();

        System.out.println("\n");

        Stationery ref = new Pencil();
        ref.stationeryDetails();
        ref.stationeryTypes();
        ref.usesInEducation();
        ref.creativeApplications();
        ref.ecoFriendlyOptions();

        System.out.println("\n");

        Pencil pencil = new Pencil();
        pencil.stationeryDetails();
        pencil.pencilTypes();
        pencil.materialComposition();
        pencil.sharpeningTips();
        pencil.pencilCare();


    }
}
