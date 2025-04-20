package com.xworkz.organiccompoundapp.phenol;

import com.xworkz.organiccompoundapp.organiccompound.OrganicCompound;

public class Phenol extends OrganicCompound {
    @Override
    public void definition() {
        System.out.println("Phenol is an aromatic organic compound with a hydroxyl group (-OH) attached to a benzene ring.");
    }

    @Override
    public void structure() {
        System.out.println("Phenol has a simple aromatic structure: a benzene ring with one hydroxyl group (-OH) attached.");
    }

    @Override
    public void classification() {
        System.out.println("Phenol belongs to the class of aromatic alcohols or hydroxybenzenes.");
    }

    @Override
    public void uses() {
        System.out.println("Phenol is used in the production of plastics, resins, disinfectants, and as a precursor in organic synthesis.");
    }

    @Override
    public void importance() {
        System.out.println("Phenol is a key raw material in manufacturing and has antimicrobial properties.");
    }

    public void chemicalProperties() {
        System.out.println("Phenol exhibits acidity due to the ability of the hydroxyl group to release hydrogen ions.");
    }

    public void healthEffects() {
        System.out.println("Phenol can be toxic and corrosive to human tissue in concentrated forms.");
    }
}
