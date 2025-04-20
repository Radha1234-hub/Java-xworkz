package com.xworkz.bloodcellapp.whitebooldcell;

import com.xworkz.bloodcellapp.bloodcell.BloodCell;

public class WhiteBloodCell extends BloodCell {
    @Override
    public void type() {
        System.out.println("White blood cells (WBCs) are part of the immune system and include types like neutrophils, lymphocytes, and macrophages.");
    }

    @Override
    public void function() {
        System.out.println("White blood cells fight infections, destroy harmful pathogens, and promote tissue repair.");
    }

    @Override
    public void production() {
        System.out.println("White blood cells are produced in the bone marrow and lymphatic organs.");
    }

    @Override
    public void lifespan() {
        System.out.println("White blood cells have varying lifespans, from hours to years depending on their type and function.");
    }

    @Override
    public void structure() {
        System.out.println("White blood cells have a nucleus and may be granular or agranular depending on the subtype.");
    }

    public void defenseMechanism() {
        System.out.println("White blood cells use mechanisms like phagocytosis and antibody production for immune defense.");
    }

    public void responseToInfection() {
        System.out.println("White blood cells increase in number during infections or inflammation, a process called leukocytosis.");
    }
}
