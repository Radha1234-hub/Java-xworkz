package com.xworkz.inheritenceapp.art;

public class ArtRunner {
    public static void main(String[] args) {
        Art art = new Art();
        art.artDetails();

        Painting painting = new Painting();
        painting.artDetails();

        Art ref = new Painting();
        ref.artDetails();

        Painting downcasted = (Painting) ref;
        downcasted.artDetails();
    }
}
