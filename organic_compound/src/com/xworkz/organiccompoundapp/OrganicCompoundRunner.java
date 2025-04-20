package com.xworkz.organiccompoundapp;

import com.xworkz.organiccompoundapp.organiccompound.OrganicCompound;
import com.xworkz.organiccompoundapp.phenol.Phenol;

public class OrganicCompoundRunner {

    public static void main(String[] args) {

        OrganicCompound ref = new OrganicCompound();
        ref.definition();
        ref.structure();
        ref.classification();
        ref.uses();
        ref.importance();

        OrganicCompound ref1 = new Phenol();
        ref1.definition();
        ref1.structure();
        ref1.classification();
        ref1.uses();
        ref1.importance();

        Phenol ref2 = new Phenol();
        ref2.definition();
        ref2.structure();
        ref2.classification();
        ref2.uses();
        ref2.importance();
        ref2.chemicalProperties();
        ref2.healthEffects();
    }
}
