package com.xworkz.inheritenceapp.leather;

public class LeatherRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe();
        shoe.shoeDetails();

        Leather leather = new Leather();
        leather.shoeDetails();

        Leather ref = new Shoe();
        ref.shoeDetails();

        Shoe downcasted = (Shoe) ref;
        downcasted.shoeDetails();

    }
}
