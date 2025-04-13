package com.xworkz.inheritenceapp.bone;

public class BoneRunner {

    public static void main(String[] args) {
        Bone bone = new Bone();
        bone.boneDetails();

        Femur femur = new Femur();
        femur.boneDetails();

        Bone ref = new Femur();
        ref.boneDetails();

        Femur downcasted = (Femur) ref;
        downcasted.boneDetails();
    }
}
