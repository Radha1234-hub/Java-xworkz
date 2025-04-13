package com.xworkz.inheritenceapp.naturalprocess;

public class NaturalProcessRunner {
    public static void main(String[] args) {
        NaturalProcess naturalProcess = new NaturalProcess();
        naturalProcess.processDetails();

        Photosynthesis photosynthesis = new Photosynthesis();
        photosynthesis.processDetails();

        NaturalProcess ref = new Photosynthesis();
        ref.processDetails();

        Photosynthesis downcasted = (Photosynthesis) ref;
        downcasted.processDetails();

    }
}
