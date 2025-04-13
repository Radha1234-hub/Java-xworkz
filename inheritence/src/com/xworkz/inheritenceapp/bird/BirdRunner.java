package com.xworkz.inheritenceapp.bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.birdDetails();

        Eagle eagle = new Eagle();
        eagle.birdDetails();

        Bird ref = new Eagle();
        ref.birdDetails();

        Eagle downcasted = (Eagle) ref;
        downcasted.birdDetails();

    }
}
