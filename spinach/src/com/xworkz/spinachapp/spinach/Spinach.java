package com.xworkz.spinachapp.spinach;

import com.xworkz.spinachapp.leaf.Leaf;

public class Spinach extends Leaf {

    @Override
    public void type() {
        System.out.println("Spinach leaves are edible, dark green, and rich in nutrients.");
    }

    @Override
    public void color() {
        System.out.println("Spinach leaves are deep green due to their high chlorophyll content.");
    }

    @Override
    public void shape() {
        System.out.println("Spinach leaves are oval or elongated with a slightly crinkled texture.");
    }

    @Override
    public void function() {
        System.out.println("Spinach leaves are used as a food source, providing essential vitamins and minerals.");
    }

    @Override
    public void significance() {
        System.out.println("Spinach is significant for its health benefits, including high levels of iron and antioxidants.");
    }

    public void culinaryUses() {
        System.out.println("Spinach is widely used in salads, soups, smoothies, and cooked dishes.");
    }

    public void growthRequirements() {
        System.out.println("Spinach grows best in cool climates with moist, fertile soil.");
    }
}
