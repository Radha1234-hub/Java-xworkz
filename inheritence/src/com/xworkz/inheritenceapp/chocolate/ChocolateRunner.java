package com.xworkz.inheritenceapp.chocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        chocolate.chocolateDetails();

        Cadbury cadbury = new Cadbury();
        cadbury.chocolateDetails();

        Chocolate ref = new Cadbury();
        ref.chocolateDetails();


        Cadbury downcasted = (Cadbury) ref;
        downcasted.chocolateDetails();}
}
