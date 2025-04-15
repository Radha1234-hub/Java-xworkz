package com.xworkz.inheritenceapp.bone;

public class BoneRunner {

    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Bone bone = new Bone();
        bone.boneDetails();
        bone.boneComposition();
        bone.boneFunctionality();
        bone.boneRegeneration();
        bone.boneHealth();

        System.out.println("\n");

        // Creating a copy of the subclass using the parent reference type and invoking 5 methods
        Bone ref = new Femur();
        ref.boneDetails();
        ref.boneComposition();
        ref.boneFunctionality();
        ref.boneRegeneration();
        ref.boneHealth();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        Femur femur = new Femur();
        femur.boneDetails();
        femur.femurDetails();
        femur.femurStrength();
        femur.femurLocation();
        femur.femurFunctionality();
    }
}
