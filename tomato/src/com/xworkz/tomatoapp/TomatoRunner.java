package com.xworkz.tomatoapp;

import com.xworkz.tomatoapp.fruit.Fruit;
import com.xworkz.tomatoapp.tomato.Tomato;

public class TomatoRunner {
    public static void main(String[] args) {

        Fruit ref = new Fruit();
        ref.type();
        ref.color();
        ref.taste();
        ref.nutritionalValue();
        ref.usage();

        Fruit ref1 = new Tomato();
        ref1.type();
        ref1.color();
        ref1.taste();
        ref1.nutritionalValue();
        ref1.usage();

        Tomato ref2 = new Tomato();
        ref2.type();
        ref2.color();
        ref2.taste();
        ref2.nutritionalValue();
        ref2.usage();
        ref2.growthConditions();
        ref2.varieties();
    }
}
