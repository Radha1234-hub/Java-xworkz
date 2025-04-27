package com.xworkz.overrideapp.doctorapp;

import com.xworkz.overrideapp.doctorapp.doctor.DoctorDto;

public class DoctorRunner {
    public static void main(String[] args) {

        DoctorDto ref1 = new DoctorDto();
        ref1.setDoctorId(1);
        ref1.setDoctorName("Rajesh");
        ref1.setDoctorSpecialization("Cardiology");
        ref1.setDoctorExperience("10 years");
        ref1.setDoctorHospital("Apollo Hospital");
        ref1.setDoctorLocation("Delhi");
        ref1.setDoctorSalary(2500000.00);

        int doctorId1 = ref1.getDoctorId();
        String doctorName1 = ref1.getDoctorName();
        String doctorSpecialization1 = ref1.getDoctorSpecialization();
        String doctorExperience1 = ref1.getDoctorExperience();
        String doctorHospital1 = ref1.getDoctorHospital();
        String doctorLocation1 = ref1.getDoctorLocation();
        double doctorSalary1 = ref1.getDoctorSalary();

        System.out.println("Doctor ID: " + doctorId1);
        System.out.println("Doctor Name: " + doctorName1);
        System.out.println("Doctor Specialization: " + doctorSpecialization1);
        System.out.println("Doctor Experience: " + doctorExperience1);
        System.out.println("Doctor Hospital: " + doctorHospital1);
        System.out.println("Doctor Location: " + doctorLocation1);
        System.out.println("Doctor Salary: " + doctorSalary1);
        System.out.println("\n");

        DoctorDto ref2 = new DoctorDto();
        ref2.setDoctorId(2);
        ref2.setDoctorName("Sneha");
        ref2.setDoctorSpecialization("Neurology");
        ref2.setDoctorExperience("8 years");
        ref2.setDoctorHospital("Fortis Hospital");
        ref2.setDoctorLocation("Mumbai");
        ref2.setDoctorSalary(2300000.00);

        int doctorId2 = ref2.getDoctorId();
        String doctorName2 = ref2.getDoctorName();
        String doctorSpecialization2 = ref2.getDoctorSpecialization();
        String doctorExperience2 = ref2.getDoctorExperience();
        String doctorHospital2 = ref2.getDoctorHospital();
        String doctorLocation2 = ref2.getDoctorLocation();
        double doctorSalary2 = ref2.getDoctorSalary();

        System.out.println("Doctor ID: " + doctorId2);
        System.out.println("Doctor Name: " + doctorName2);
        System.out.println("Doctor Specialization: " + doctorSpecialization2);
        System.out.println("Doctor Experience: " + doctorExperience2);
        System.out.println("Doctor Hospital: " + doctorHospital2);
        System.out.println("Doctor Location: " + doctorLocation2);
        System.out.println("Doctor Salary: " + doctorSalary2);
        System.out.println("\n");

        DoctorDto ref3 = new DoctorDto();
        ref3.setDoctorId(3);
        ref3.setDoctorName("Arun");
        ref3.setDoctorSpecialization("Orthopedics");
        ref3.setDoctorExperience("12 years");
        ref3.setDoctorHospital("Max Healthcare");
        ref3.setDoctorLocation("Bengaluru");
        ref3.setDoctorSalary(2700000.00);

        int doctorId3 = ref3.getDoctorId();
        String doctorName3 = ref3.getDoctorName();
        String doctorSpecialization3 = ref3.getDoctorSpecialization();
        String doctorExperience3 = ref3.getDoctorExperience();
        String doctorHospital3 = ref3.getDoctorHospital();
        String doctorLocation3 = ref3.getDoctorLocation();
        double doctorSalary3 = ref3.getDoctorSalary();

        System.out.println("Doctor ID: " + doctorId3);
        System.out.println("Doctor Name: " + doctorName3);
        System.out.println("Doctor Specialization: " + doctorSpecialization3);
        System.out.println("Doctor Experience: " + doctorExperience3);
        System.out.println("Doctor Hospital: " + doctorHospital3);
        System.out.println("Doctor Location: " + doctorLocation3);
        System.out.println("Doctor Salary: " + doctorSalary3);
        System.out.println("\n");

        DoctorDto ref22 = new DoctorDto();
        ref22.setDoctorId(2);
        ref22.setDoctorName("Sneha");
        ref22.setDoctorSpecialization("Neurology");
        ref22.setDoctorExperience("8 years");
        ref22.setDoctorHospital("Fortis Hospital");
        ref22.setDoctorLocation("Mumbai");
        ref22.setDoctorSalary(2300000.00);



        System.out.println(ref3.toString());
        System.out.println(ref2.equals(ref22));
        System.out.println(ref1.hashCode());
    }
}
