package com.xworkz.inheritenceapp.bird;

public class BirdRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Bird bird = new Bird();
        bird.birdDetails();
        bird.birdMovement();
        bird.birdHabitat();
        bird.birdDiet();
        bird.birdCommunication();

        System.out.println("\n");

        // Creating a copy of the subclass using the parent reference type and invoking 5 methods
        Bird ref = new Eagle();
        ref.birdDetails();
        ref.birdMovement();
        ref.birdHabitat();
        ref.birdDiet();
        ref.birdCommunication();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        Eagle eagle = new Eagle();
        eagle.birdDetails();
        eagle.eagleHunting();
        eagle.eagleFlight();
        eagle.eagleSymbolism();
        eagle.eagleSpecies();

    }
}
