package com.xworkz.inheritenceapp.amphibian;

public class AmphibianRunner {
    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian();
        amphibian.amphibianDetails();
        amphibian.liveInWater();
        amphibian.liveOnLand();
        amphibian.regulateTemperature();
        amphibian.ecosystemIndicators();

        Frog frog = new Frog();
        frog.amphibianDetails();
        frog.frogSound();
        frog.jump();
        frog.camouflage();
        frog.layEggs();

        Amphibian amphibianReference = new Frog();
        amphibianReference.amphibianDetails();
        amphibianReference.liveInWater();
        amphibianReference.liveOnLand();
        amphibianReference.regulateTemperature();
        amphibianReference.ecosystemIndicators();

        Frog downcastedFrog = (Frog) amphibianReference;
        downcastedFrog.amphibianDetails();
        downcastedFrog.frogSound();
        downcastedFrog.jump();
        downcastedFrog.camouflage();
        downcastedFrog.layEggs();
    }
    }

