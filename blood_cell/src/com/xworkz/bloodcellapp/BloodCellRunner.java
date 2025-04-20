package com.xworkz.bloodcellapp;

import com.xworkz.bloodcellapp.bloodcell.BloodCell;
import com.xworkz.bloodcellapp.whitebooldcell.WhiteBloodCell;

public class BloodCellRunner {
    public static void main(String[] args) {

        BloodCell ref = new BloodCell();
        ref.type();
        ref.function();
        ref.production();
        ref.lifespan();
        ref.structure();

        BloodCell ref1 = new WhiteBloodCell();
        ref1.type();
        ref1.function();
        ref1.production();
        ref1.lifespan();
        ref1.structure();

        WhiteBloodCell ref2 = new WhiteBloodCell();
        ref2.type();
        ref2.function();
        ref2.production();
        ref2.lifespan();
        ref2.structure();
        ref2.defenseMechanism();
        ref2.responseToInfection();
    }
}
