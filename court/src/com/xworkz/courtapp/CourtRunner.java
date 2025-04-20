package com.xworkz.courtapp;

import com.xworkz.courtapp.court.Court;
import com.xworkz.courtapp.criminalcourt.CriminalCourt;

public class CourtRunner {

    public static void main(String[] args) {

        Court ref = new Court();
        ref.type();
        ref.jurisdiction();
        ref.procedure();
        ref.judges();
        ref.purpose();

        Court ref1 = new CriminalCourt();
        ref1.type();
        ref1.jurisdiction();
        ref1.procedure();
        ref1.judges();
        ref1.purpose();

        CriminalCourt ref2 = new CriminalCourt();
        ref2.type();
        ref2.jurisdiction();
        ref2.procedure();
        ref2.judges();
        ref2.purpose();
        ref2.sentencing();
        ref2.bail();
    }
}
