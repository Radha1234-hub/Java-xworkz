package com.xworkz.overrideapp.architectapp;

import com.xworkz.overrideapp.architectapp.architect.ArchitectDto;

public class ArchitectRunner {
    public static void main(String[] args) {

        ArchitectDto ref1 = new ArchitectDto();
        ref1.setArchitectId(1);
        ref1.setArchitectName("Arjun");
        ref1.setArchitectSpecialization("Residential Design");
        ref1.setArchitectExperience("12 years");
        ref1.setArchitectFirm("Hiranandani Architects");
        ref1.setArchitectLocation("Mumbai");
        ref1.setArchitectSalary(1800000.00);

        int architectId1 = ref1.getArchitectId();
        String architectName1 = ref1.getArchitectName();
        String architectSpecialization1 = ref1.getArchitectSpecialization();
        String architectExperience1 = ref1.getArchitectExperience();
        String architectFirm1 = ref1.getArchitectFirm();
        String architectLocation1 = ref1.getArchitectLocation();
        double architectSalary1 = ref1.getArchitectSalary();

        System.out.println("Architect ID: " + architectId1);
        System.out.println("Architect Name: " + architectName1);
        System.out.println("Architect Specialization: " + architectSpecialization1);
        System.out.println("Architect Experience: " + architectExperience1);
        System.out.println("Architect Firm: " + architectFirm1);
        System.out.println("Architect Location: " + architectLocation1);
        System.out.println("Architect Salary: " + architectSalary1);
        System.out.println("\n");

        ArchitectDto ref2 = new ArchitectDto();
        ref2.setArchitectId(2);
        ref2.setArchitectName("Meera");
        ref2.setArchitectSpecialization("Commercial Spaces");
        ref2.setArchitectExperience("10 years");
        ref2.setArchitectFirm("Lodha Design Studio");
        ref2.setArchitectLocation("Bengaluru");
        ref2.setArchitectSalary(2000000.00);

        int architectId2 = ref2.getArchitectId();
        String architectName2 = ref2.getArchitectName();
        String architectSpecialization2 = ref2.getArchitectSpecialization();
        String architectExperience2 = ref2.getArchitectExperience();
        String architectFirm2 = ref2.getArchitectFirm();
        String architectLocation2 = ref2.getArchitectLocation();
        double architectSalary2 = ref2.getArchitectSalary();

        System.out.println("Architect ID: " + architectId2);
        System.out.println("Architect Name: " + architectName2);
        System.out.println("Architect Specialization: " + architectSpecialization2);
        System.out.println("Architect Experience: " + architectExperience2);
        System.out.println("Architect Firm: " + architectFirm2);
        System.out.println("Architect Location: " + architectLocation2);
        System.out.println("Architect Salary: " + architectSalary2);
        System.out.println("\n");

        ArchitectDto ref3 = new ArchitectDto();
        ref3.setArchitectId(3);
        ref3.setArchitectName("Ravi");
        ref3.setArchitectSpecialization("Urban Planning");
        ref3.setArchitectExperience("15 years");
        ref3.setArchitectFirm("Prestige Architects");
        ref3.setArchitectLocation("Delhi");
        ref3.setArchitectSalary(2500000.00);

        int architectId3 = ref3.getArchitectId();
        String architectName3 = ref3.getArchitectName();
        String architectSpecialization3 = ref3.getArchitectSpecialization();
        String architectExperience3 = ref3.getArchitectExperience();
        String architectFirm3 = ref3.getArchitectFirm();
        String architectLocation3 = ref3.getArchitectLocation();
        double architectSalary3 = ref3.getArchitectSalary();

        System.out.println("Architect ID: " + architectId3);
        System.out.println("Architect Name: " + architectName3);
        System.out.println("Architect Specialization: " + architectSpecialization3);
        System.out.println("Architect Experience: " + architectExperience3);
        System.out.println("Architect Firm: " + architectFirm3);
        System.out.println("Architect Location: " + architectLocation3);
        System.out.println("Architect Salary: " + architectSalary3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
