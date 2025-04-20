package com.xworkz.courtapp.criminalcourt;

import com.xworkz.courtapp.court.Court;

public class CriminalCourt extends Court {
    @Override
    public void type() {
        System.out.println("Criminal courts handle cases related to crimes such as theft, assault, or murder.");
    }

    @Override
    public void jurisdiction() {
        System.out.println("Criminal courts have jurisdiction over criminal cases within a specific region or district.");
    }

    @Override
    public void procedure() {
        System.out.println("Criminal courts follow procedures such as arraignment, trials, sentencing, and appeals.");
    }

    @Override
    public void judges() {
        System.out.println("Criminal courts are presided over by judges specializing in criminal law.");
    }

    @Override
    public void purpose() {
        System.out.println("The purpose of criminal courts is to uphold laws, punish offenders, and deliver justice to victims.");
    }

    public void sentencing() {
        System.out.println("Criminal courts determine sentencing based on the severity of the crime and applicable laws.");
    }

    public void bail() {
        System.out.println("Criminal courts handle bail requests, allowing defendants to await trial outside custody.");
    }
}
