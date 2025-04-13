package com.xworkz.inheritenceapp.dessert;

public class DessertRunner {
    public static void main(String[] args) {
        Dessert dessert = new Dessert();
        dessert.dessertDetails();

        IceCream iceCream = new IceCream();
        iceCream.dessertDetails();

        Dessert ref = new IceCream();
        ref.dessertDetails();

        IceCream downcasted = (IceCream) ref;
        downcasted.dessertDetails();
    }

}
