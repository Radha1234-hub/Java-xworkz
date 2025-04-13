package com.xworkz.inheritenceapp.plastic;

public class PlasticRunner {
    public static void main(String[] args) {

        Plastic plastic = new Plastic();
        plastic.propertyOfPlastic();


        Bottle bottle = new Bottle();
        bottle.propertyOfPlastic();

        Plastic ref = new Bottle();
        ref.propertyOfPlastic();

        Bottle downcasted = (Bottle) ref;
        downcasted.propertyOfPlastic();

    }

}
