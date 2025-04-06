package com.xworkz.governmentjobsapp;

import com.xworkz.governmentjobsapp.governmentjobs.GovernmentJobs;

 class GovernmentJobsRunner {

    public static void main(String[] args) {

        // 1
        GovernmentJobs ref1 = new GovernmentJobs();
        ref1.setMinimumAge(21);
        ref1.setMaximumAge(32);
        ref1.setNationality("Indian");
        ref1.setEducationalQualification("Graduate Degree");
        ref1.setNumberOfAttempts(6);
        ref1.setPhysicalStandards("Fit as per UPSC norms");
        ref1.setJob("IAS Officer");

        int minimumAge1 = ref1.getMinimumAge();
        int maximumAge1 = ref1.getMaximumAge();
        String nationality1 = ref1.getNationality();
        String educationalQualification1 = ref1.getEducationalQualification();
        int numberOfAttempts1 = ref1.getNumberOfAttempts();
        String physicalStandards1 = ref1.getPhysicalStandards();
        String job1 = ref1.getJob();

        System.out.println("Job Role: " + job1);
        System.out.println("Minimum Age: " + minimumAge1);
        System.out.println("Maximum Age: " + maximumAge1);
        System.out.println("Nationality: " + nationality1);
        System.out.println("Educational Qualification: " + educationalQualification1);
        System.out.println("Number of Attempts: " + numberOfAttempts1);
        System.out.println("Physical Standards: " + physicalStandards1);
        System.out.println("\n");

        // 2
        GovernmentJobs ref2 = new GovernmentJobs();
        ref2.setMinimumAge(20);
        ref2.setMaximumAge(35);
        ref2.setNationality("Indian");
        ref2.setEducationalQualification("Graduate Degree in Law");
        ref2.setNumberOfAttempts(8);
        ref2.setPhysicalStandards("Fit as per Judicial norms");
        ref2.setJob("Judge");

        int minimumAge2 = ref2.getMinimumAge();
        int maximumAge2 = ref2.getMaximumAge();
        String nationality2 = ref2.getNationality();
        String educationalQualification2 = ref2.getEducationalQualification();
        int numberOfAttempts2 = ref2.getNumberOfAttempts();
        String physicalStandards2 = ref2.getPhysicalStandards();
        String job2 = ref2.getJob();

        System.out.println("Job Role: " + job2);
        System.out.println("Minimum Age: " + minimumAge2);
        System.out.println("Maximum Age: " + maximumAge2);
        System.out.println("Nationality: " + nationality2);
        System.out.println("Educational Qualification: " + educationalQualification2);
        System.out.println("Number of Attempts: " + numberOfAttempts2);
        System.out.println("Physical Standards: " + physicalStandards2);
        System.out.println("\n");

        // 3
        GovernmentJobs ref3 = new GovernmentJobs();
        ref3.setMinimumAge(22);
        ref3.setMaximumAge(40);
        ref3.setNationality("Indian");
        ref3.setEducationalQualification("Engineering Degree");
        ref3.setNumberOfAttempts(5);
        ref3.setPhysicalStandards("Medical Fitness Certificate");
        ref3.setJob("Scientist in ISRO");

        int minimumAge3 = ref3.getMinimumAge();
        int maximumAge3 = ref3.getMaximumAge();
        String nationality3 = ref3.getNationality();
        String educationalQualification3 = ref3.getEducationalQualification();
        int numberOfAttempts3 = ref3.getNumberOfAttempts();
        String physicalStandards3 = ref3.getPhysicalStandards();
        String job3 = ref3.getJob();

        System.out.println("Job Role: " + job3);
        System.out.println("Minimum Age: " + minimumAge3);
        System.out.println("Maximum Age: " + maximumAge3);
        System.out.println("Nationality: " + nationality3);
        System.out.println("Educational Qualification: " + educationalQualification3);
        System.out.println("Number of Attempts: " + numberOfAttempts3);
        System.out.println("Physical Standards: " + physicalStandards3);
        System.out.println("\n");

        // 4
        GovernmentJobs ref4 = new GovernmentJobs();
        ref4.setMinimumAge(25);
        ref4.setMaximumAge(45);
        ref4.setNationality("Indian");
        ref4.setEducationalQualification("Chartered Accountant");
        ref4.setNumberOfAttempts(4);
        ref4.setPhysicalStandards("Fit as per RBI norms");
        ref4.setJob("RBI Officer");

        int minimumAge4 = ref4.getMinimumAge();
        int maximumAge4 = ref4.getMaximumAge();
        String nationality4 = ref4.getNationality();
        String educationalQualification4 = ref4.getEducationalQualification();
        int numberOfAttempts4 = ref4.getNumberOfAttempts();
        String physicalStandards4 = ref4.getPhysicalStandards();
        String job4 = ref4.getJob();

        System.out.println("Job Role: " + job4);
        System.out.println("Minimum Age: " + minimumAge4);
        System.out.println("Maximum Age: " + maximumAge4);
        System.out.println("Nationality: " + nationality4);
        System.out.println("Educational Qualification: " + educationalQualification4);
        System.out.println("Number of Attempts: " + numberOfAttempts4);
        System.out.println("Physical Standards: " + physicalStandards4);
        System.out.println("\n");

        // 5
        GovernmentJobs ref5 = new GovernmentJobs();
        ref5.setMinimumAge(26);
        ref5.setMaximumAge(42);
        ref5.setNationality("Indian");
        ref5.setEducationalQualification("MBBS Degree");
        ref5.setNumberOfAttempts(3);
        ref5.setPhysicalStandards("Medical Fitness Certificate");
        ref5.setJob("Chief Medical Officer");

        int minimumAge5 = ref5.getMinimumAge();
        int maximumAge5 = ref5.getMaximumAge();
        String nationality5 = ref5.getNationality();
        String educationalQualification5 = ref5.getEducationalQualification();
        int numberOfAttempts5 = ref5.getNumberOfAttempts();
        String physicalStandards5 = ref5.getPhysicalStandards();
        String job5 = ref5.getJob();

        System.out.println("Job Role: " + job5);
        System.out.println("Minimum Age: " + minimumAge5);
        System.out.println("Maximum Age: " + maximumAge5);
        System.out.println("Nationality: " + nationality5);
        System.out.println("Educational Qualification: " + educationalQualification5);
        System.out.println("Number of Attempts: " + numberOfAttempts5);
        System.out.println("Physical Standards: " + physicalStandards5);
        System.out.println("\n");
    }
}
