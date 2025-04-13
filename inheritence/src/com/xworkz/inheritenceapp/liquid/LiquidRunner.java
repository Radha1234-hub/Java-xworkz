package com.xworkz.inheritenceapp.liquid;

public class LiquidRunner {

    public static void main(String[] args) {
        Liquid liquid = new Liquid();
        liquid.liquidDetails();

        Water water = new Water();
        water.liquidDetails();

        Liquid ref = new Water();
        ref.liquidDetails();

        Water downcasted = (Water) ref;
        downcasted.liquidDetails();


    }
}