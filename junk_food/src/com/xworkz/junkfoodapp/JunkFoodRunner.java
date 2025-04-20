package com.xworkz.junkfoodapp;

import com.xworkz.junkfoodapp.junkfood.JunkFood;
import com.xworkz.junkfoodapp.pizza.Pizza;

public class JunkFoodRunner {

    public static void main(String[] args) {

        JunkFood ref = new JunkFood();
        ref.ingredients();
        ref.preparation();
        ref.taste();
        ref.popularity();
        ref.healthImpact();

        JunkFood ref1 = new Pizza();
        ref1.ingredients();
        ref1.preparation();
        ref1.taste();
        ref1.popularity();
        ref1.healthImpact();

        Pizza ref2 = new Pizza();
        ref2.ingredients();
        ref2.preparation();
        ref2.taste();
        ref2.popularity();
        ref2.healthImpact();
        ref2.types();
        ref2.crustVarieties();
    }
}