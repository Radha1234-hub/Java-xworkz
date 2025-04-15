package com.xworkz.inheritenceapp.metal;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Metal();
        metal.metalDetails();
        metal.metalProperties();
        metal.metalUses();
        metal.metalTypes();
        metal.metalSignificance();

        System.out.println("\n");

        Metal ref = new Gold();
        ref.metalDetails();
        ref.metalProperties();
        ref.metalUses();
        ref.metalTypes();
        ref.metalSignificance();

        System.out.println("\n");

        Gold gold = new Gold();
        gold.metalDetails();
        gold.goldPurity();
        gold.goldUses();
        gold.goldValue();
        gold.goldProperties();

    }}
