package com.xworkz.inheritenceapp.livingbeing;

public class LivingBeingRunner {
    public static void main(String[] args) {
        // Create a copy of Parent and invoke five methods
        LivingBeing livingBeing = new LivingBeing();
        livingBeing.livingBeingDetails();
        livingBeing.energyConsumption();
        livingBeing.reproductionDetails();
        livingBeing.environmentalAdaptation();
        livingBeing.ecologicalRole();

        System.out.println("\n");

        // Create a copy of Subclass using Parent reference type and invoke five methods
        LivingBeing ref = new Human();
        ref.livingBeingDetails();
        ref.energyConsumption();
        ref.reproductionDetails();
        ref.environmentalAdaptation();
        ref.ecologicalRole();

        System.out.println("\n");

        // Create a copy of Subclass using its own class reference type and invoke five methods
        Human human = new Human();
        human.livingBeingDetails();
        human.humanSkills();
        human.humanNeeds();
        human.humanAdaptation();
        human.humanImpact();

    }
}
