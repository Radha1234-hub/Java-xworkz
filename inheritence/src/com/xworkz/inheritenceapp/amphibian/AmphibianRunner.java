package com.xworkz.inheritenceapp.amphibian;

public class AmphibianRunner {
    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian();
        amphibian.amphibianDetails();

        Frog frog = new Frog();
        frog.amphibianDetails();

        Amphibian crocodile = new Frog();
        crocodile.amphibianDetails();

        Frog downcasted = (Frog) crocodile;
        downcasted.amphibianDetails();
    }
}
