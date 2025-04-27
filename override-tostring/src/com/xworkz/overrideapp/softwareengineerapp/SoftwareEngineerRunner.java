package com.xworkz.overrideapp.softwareengineerapp;

import com.xworkz.overrideapp.softwareengineerapp.softwareengineer.SoftwareEngineerDto;



public class SoftwareEngineerRunner {

    public static void main(String[] args) {

        SoftwareEngineerDto ref1 = new SoftwareEngineerDto();
        ref1.setEngineerId(1);
        ref1.setEngineerName("Rahul");
        ref1.setEngineerSpecialization("Java Development");
        ref1.setEngineerExperience("5 years");
        ref1.setEngineerCompany("Infosys");
        ref1.setEngineerLocation("Bengaluru");
        ref1.setEngineerSalary(1500000.00);

        int engineerId1 = ref1.getEngineerId();
        String engineerName1 = ref1.getEngineerName();
        String engineerSpecialization1 = ref1.getEngineerSpecialization();
        String engineerExperience1 = ref1.getEngineerExperience();
        String engineerCompany1 = ref1.getEngineerCompany();
        String engineerLocation1 = ref1.getEngineerLocation();
        double engineerSalary1 = ref1.getEngineerSalary();

        System.out.println("Engineer ID: " + engineerId1);
        System.out.println("Engineer Name: " + engineerName1);
        System.out.println("Engineer Specialization: " + engineerSpecialization1);
        System.out.println("Engineer Experience: " + engineerExperience1);
        System.out.println("Engineer Company: " + engineerCompany1);
        System.out.println("Engineer Location: " + engineerLocation1);
        System.out.println("Engineer Salary: " + engineerSalary1);
        System.out.println("\n");

        SoftwareEngineerDto ref2 = new SoftwareEngineerDto();
        ref2.setEngineerId(2);
        ref2.setEngineerName("Priya");
        ref2.setEngineerSpecialization("Data Science");
        ref2.setEngineerExperience("7 years");
        ref2.setEngineerCompany("TCS");
        ref2.setEngineerLocation("Mumbai");
        ref2.setEngineerSalary(1800000.00);

        int engineerId2 = ref2.getEngineerId();
        String engineerName2 = ref2.getEngineerName();
        String engineerSpecialization2 = ref2.getEngineerSpecialization();
        String engineerExperience2 = ref2.getEngineerExperience();
        String engineerCompany2 = ref2.getEngineerCompany();
        String engineerLocation2 = ref2.getEngineerLocation();
        double engineerSalary2 = ref2.getEngineerSalary();

        System.out.println("Engineer ID: " + engineerId2);
        System.out.println("Engineer Name: " + engineerName2);
        System.out.println("Engineer Specialization: " + engineerSpecialization2);
        System.out.println("Engineer Experience: " + engineerExperience2);
        System.out.println("Engineer Company: " + engineerCompany2);
        System.out.println("Engineer Location: " + engineerLocation2);
        System.out.println("Engineer Salary: " + engineerSalary2);
        System.out.println("\n");

        SoftwareEngineerDto ref3 = new SoftwareEngineerDto();
        ref3.setEngineerId(3);
        ref3.setEngineerName("Vikram");
        ref3.setEngineerSpecialization("Cybersecurity");
        ref3.setEngineerExperience("6 years");
        ref3.setEngineerCompany("Wipro");
        ref3.setEngineerLocation("Hyderabad");
        ref3.setEngineerSalary(1600000.00);

        int engineerId3 = ref3.getEngineerId();
        String engineerName3 = ref3.getEngineerName();
        String engineerSpecialization3 = ref3.getEngineerSpecialization();
        String engineerExperience3 = ref3.getEngineerExperience();
        String engineerCompany3 = ref3.getEngineerCompany();
        String engineerLocation3 = ref3.getEngineerLocation();
        double engineerSalary3 = ref3.getEngineerSalary();

        System.out.println("Engineer ID: " + engineerId3);
        System.out.println("Engineer Name: " + engineerName3);
        System.out.println("Engineer Specialization: " + engineerSpecialization3);
        System.out.println("Engineer Experience: " + engineerExperience3);
        System.out.println("Engineer Company: " + engineerCompany3);
        System.out.println("Engineer Location: " + engineerLocation3);
        System.out.println("Engineer Salary: " + engineerSalary3);
        System.out.println("\n");

        SoftwareEngineerDto ref11 = new SoftwareEngineerDto();
        ref11.setEngineerId(1);
        ref11.setEngineerName("Rahul");
        ref11.setEngineerSpecialization("Java Development");
        ref11.setEngineerExperience("5 years");
        ref11.setEngineerCompany("Infosys");
        ref11.setEngineerLocation("Bengaluru");
        ref11.setEngineerSalary(1500000.00);

        System.out.println(ref3.toString());
        System.out.println(ref11.equals(ref1));
        System.out.println(ref2.hashCode());
    }
}
