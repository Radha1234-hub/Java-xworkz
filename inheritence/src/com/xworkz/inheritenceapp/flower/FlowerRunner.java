package com.xworkz.inheritenceapp.flower;

public class FlowerRunner {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.flowerDetails();


        Lotus lotus = new Lotus();
        lotus.flowerDetails(); // Inherits the method from Flower
    }
}
