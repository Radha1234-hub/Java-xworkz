package com.xworkz.virusapp;

import com.xworkz.virusapp.influenza.Influenza;
import com.xworkz.virusapp.virus.Virus;

public class VirusRunner {
    public static void main(String[] args) {

        Virus ref = new Virus();
        ref.type();
        ref.structure();
        ref.transmission();
        ref.impact();
        ref.replication();

        Virus ref1 = new Influenza();
        ref1.type();
        ref1.structure();
        ref1.transmission();
        ref1.impact();
        ref1.replication();

        Influenza ref2 = new Influenza();
        ref2.type();
        ref2.structure();
        ref2.transmission();
        ref2.impact();
        ref2.replication();
        ref2.subtypes();
        ref2.prevention();
    }
}
