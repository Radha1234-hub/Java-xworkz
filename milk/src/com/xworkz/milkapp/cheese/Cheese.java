package com.xworkz.milkapp.cheese;


import com.xworkz.milkapp.milk.Milk;

public class Cheese extends Milk {
    @Override
    public void source() {
        System.out.println("Cheese is derived from milk through processes like curdling and fermentation.");
    }

    @Override
    public void composition() {
        System.out.println("Cheese contains proteins, fats, calcium, and may have added salts and enzymes.");
    }

    @Override
    public void uses() {
        System.out.println("Cheese is used in dishes like pizza, pasta, sandwiches, and as a topping or ingredient.");
    }

    @Override
    public void storage() {
        System.out.println("Cheese is stored in cool, dry conditions, often wrapped or in airtight containers.");
    }

    @Override
    public void nutritionalValue() {
        System.out.println("Cheese is high in calcium and protein but can also be high in fat and sodium.");
    }

    public void varieties() {
        System.out.println("Cheese comes in many varieties such as cheddar, mozzarella, gouda, and brie.");
    }

    public void agingProcess() {
        System.out.println("Cheese gains its flavor and texture through aging processes that vary by type.");
    }
}
