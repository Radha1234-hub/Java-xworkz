package com.xworkz.inheritenceapp.fruit;

import com.xworkz.inheritenceapp.machine.Machine;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.fruitDetails();

        Mango mango = new Mango();
        mango.fruitDetails();

        Fruit ref = new Mango();
        ref.fruitDetails();

        Mango downcasted = (Mango) ref;
        downcasted.fruitDetails();
    }

}
