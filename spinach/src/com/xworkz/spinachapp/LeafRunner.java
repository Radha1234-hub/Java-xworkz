package com.xworkz.spinachapp;

import com.xworkz.spinachapp.leaf.Leaf;
import com.xworkz.spinachapp.spinach.Spinach;

public class LeafRunner {
    public static void main(String[] args) {

        Leaf ref = new Leaf();
        ref.type();
        ref.color();
        ref.shape();
        ref.function();
        ref.significance();

        Leaf ref1 = new Spinach();
        ref1.type();
        ref1.color();
        ref1.shape();
        ref1.function();
        ref1.significance();

        Spinach ref2 = new Spinach();
        ref2.type();
        ref2.color();
        ref2.shape();
        ref2.function();
        ref2.significance();
        ref2.culinaryUses();
        ref2.growthRequirements();
    }
}
