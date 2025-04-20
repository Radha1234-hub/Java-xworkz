package com.xworkz.researchapp;

import com.xworkz.researchapp.nasa.Nasa;
import com.xworkz.researchapp.research.ReserachCenter;

public class ResearchCenterRunner {
    public static void main(String[] args) {

        ReserachCenter  ref = new ReserachCenter ();
        ref.focusArea();
        ref.funding();
        ref.achievements();
        ref.location();
        ref.collaborations();

        ReserachCenter  ref1 = new Nasa();
        ref1.focusArea();
        ref1.funding();
        ref1.achievements();
        ref1.location();
        ref1.collaborations();

        Nasa ref2 = new Nasa();
        ref2.focusArea();
        ref2.funding();
        ref2.achievements();
        ref2.location();
        ref2.collaborations();
        ref2.missions();
        ref2.educationPrograms();
    }
}
