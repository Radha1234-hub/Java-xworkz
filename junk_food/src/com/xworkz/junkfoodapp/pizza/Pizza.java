package com.xworkz.junkfoodapp.pizza;

import com.xworkz.junkfoodapp.junkfood.JunkFood;

public class Pizza extends JunkFood {


    @Override
    public void ingredients() {
        System.out.println("Pizza is made from dough, cheese, tomato sauce, and various toppings like vegetables or meats.");
    }

    @Override
    public void preparation() {
        System.out.println("Pizza is prepared by baking in an oven, often with a crispy crust.");
    }

    @Override
    public void taste() {
        System.out.println("Pizza combines savory flavors with cheesy, tangy, and sometimes spicy toppings.");
    }

    @Override
    public void popularity() {
        System.out.println("Pizza is a globally loved junk food, often enjoyed in restaurants or at home.");
    }

    @Override
    public void healthImpact() {
        System.out.println("While pizza can be unhealthy when consumed in excess, homemade or vegetable-heavy pizzas can be healthier alternatives.");
    }

    public void types() {
        System.out.println("Popular types of pizza include Margherita, Pepperoni, BBQ Chicken, and Veggie Supreme.");
    }

    public void crustVarieties() {
        System.out.println("Pizza crusts range from thin crust, deep dish, stuffed crust, to gluten-free options.");
    }
}
