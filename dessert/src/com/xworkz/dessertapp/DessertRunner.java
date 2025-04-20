package com.xworkz.dessertapp;

import com.xworkz.dessertapp.dessert.Dessert;
import com.xworkz.dessertapp.brownie.Brownie;

public class DessertRunner {
    public static void main(String[] args) {



    Dessert ref = new Dessert();

    ref.sweetness();
    ref.appearance();
    ref.flavorComplexity();
    ref.moisture();
    ref.texture();

    Dessert ref1 = new Brownie();

    ref1.texture();
    ref1.moisture();
    ref1.flavorComplexity();
    ref1.appearance();
    ref1.sweetness();

    Brownie ref2 = new Brownie();

    ref2.appearance();
    ref2.moisture();
    ref2.flavorComplexity();
    ref2.texture();
    ref2.sweetness();



}}
