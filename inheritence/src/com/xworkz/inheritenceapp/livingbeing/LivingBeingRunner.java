package com.xworkz.inheritenceapp.livingbeing;

public class LivingBeingRunner {
    public static void main(String[] args) {
        LivingBeing livingBeing = new LivingBeing();
        livingBeing.livingBeingDetails();

        Human human = new Human();
        human.livingBeingDetails();

        LivingBeing ref = new Human();
        ref.livingBeingDetails();

        Human downcasted = (Human) ref;
        downcasted.livingBeingDetails();


    }
}
