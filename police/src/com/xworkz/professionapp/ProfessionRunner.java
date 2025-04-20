package com.xworkz.professionapp;

import com.xworkz.professionapp.police.Police;
import com.xworkz.professionapp.profession.Profession;

public class ProfessionRunner {

    public static void main(String[] args) {

        Profession ref = new Profession();
        ref.name();
        ref.skills();
        ref.purpose();
        ref.workplace();
        ref.uniform();

        Profession ref1 = new Police();
        ref1.name();
        ref1.skills();
        ref1.purpose();
        ref1.workplace();
        ref1.uniform();

        Police ref2 = new Police();
        ref2.name();
        ref2.skills();
        ref2.purpose();
        ref2.workplace();
        ref2.uniform();
        ref2.rankSystem();
        ref2.tools();
    }
}
