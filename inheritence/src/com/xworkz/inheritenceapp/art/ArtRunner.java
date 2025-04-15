package com.xworkz.inheritenceapp.art;

public class ArtRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Art art = new Art();
        art.artDetails();
        art.artForms();
        art.artHistory();
        art.artPurpose();
        art.artImpact();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Art ref = new Painting();
        ref.artDetails();
        ref.artForms();
        ref.artHistory();
        ref.artPurpose();
        ref.artImpact();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        Painting painting = new Painting();
        painting.artDetails();
        painting.paintingDefinition();
        painting.paintingStyles();
        painting.paintingPurpose();
        painting.famousPaintings();
    }
}
