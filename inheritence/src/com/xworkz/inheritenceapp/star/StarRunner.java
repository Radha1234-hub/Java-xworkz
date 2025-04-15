package com.xworkz.inheritenceapp.star;

public class StarRunner {
    public static void main(String[] args) {
        Star star = new Star();
        star.starDetails();
        star.fusionProcess();
        star.lifeCycle();
        star.constellationFormation();
        star.stellarTemperature();

        System.out.println("\n");

        Star ref = new Sun();
        ref.starDetails();
        ref.fusionProcess();
        ref.lifeCycle();
        ref.constellationFormation();
        ref.stellarTemperature();

        System.out.println("\n");

        Sun sun = new Sun();
        sun.starDetails();
        sun.solarSystemSupport();
        sun.energyRadiation();
        sun.sunspots();
        sun.solarFlareImpact();

    }
}
