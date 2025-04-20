package com.xworkz.milkapp;

import com.xworkz.milkapp.cheese.Cheese;
import com.xworkz.milkapp.milk.Milk;

public class MilkRunner {
    public static void main(String[] args) {

        Milk ref = new Milk();
        ref.source();
        ref.composition();
        ref.uses();
        ref.storage();
        ref.nutritionalValue();

        Milk ref1 = new Cheese();
        ref1.source();
        ref1.composition();
        ref1.uses();
        ref1.storage();
        ref1.nutritionalValue();

        Cheese ref2 = new Cheese();
        ref2.source();
        ref2.composition();
        ref2.uses();
        ref2.storage();
        ref2.nutritionalValue();
        ref2.varieties();
        ref2.agingProcess();
    }
}
