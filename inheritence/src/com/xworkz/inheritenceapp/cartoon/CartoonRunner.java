package com.xworkz.inheritenceapp.cartoon;

public class CartoonRunner {

    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Cartoon cartoon = new Cartoon();
        cartoon.cartoonDetails();
        cartoon.cartoonCharacters();
        cartoon.cartoonPurpose();
        cartoon.cartoonGenres();
        cartoon.cartoonHistory();

        System.out.println("\n");

        // Creating a copy of the subclass using the parent reference type and invoking 5 methods
        Cartoon ref = new Doremon();
        ref.cartoonDetails();
        ref.cartoonCharacters();
        ref.cartoonPurpose();
        ref.cartoonGenres();
        ref.cartoonHistory();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        Doremon doremon = new Doremon();
        doremon.cartoonDetails();
        doremon.doremonFeatures();
        doremon.doremonMoralValues();
        doremon.doremonPopularity();
        doremon.doremonEpisodes();
    }
    }




