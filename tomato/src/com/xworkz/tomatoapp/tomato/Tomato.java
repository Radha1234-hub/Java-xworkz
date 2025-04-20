package com.xworkz.tomatoapp.tomato;

import com.xworkz.tomatoapp.fruit.Fruit;

public class Tomato extends Fruit {
    @Override
    public void type() {
        System.out.println("Tomato is a fruit that is botanically classified as a berry but is often treated as a vegetable in culinary practices.");
    }

    @Override
    public void color() {
        System.out.println("Tomatoes are typically red but can also be yellow, orange, green, or purple.");
    }

    @Override
    public void taste() {
        System.out.println("Tomatoes have a tangy and slightly sweet taste.");
    }

    @Override
    public void nutritionalValue() {
        System.out.println("Tomatoes are a good source of vitamin C, potassium, and lycopene, an antioxidant.");
    }

    @Override
    public void usage() {
        System.out.println("Tomatoes are used in salads, sauces, soups, and countless culinary dishes.");
    }

    public void growthConditions() {
        System.out.println("Tomatoes require warm temperatures, well-drained soil, and adequate sunlight for growth.");
    }

    public void varieties() {
        System.out.println("Tomatoes come in various varieties, including cherry tomatoes, beefsteak tomatoes, and plum tomatoes.");
    }
}
