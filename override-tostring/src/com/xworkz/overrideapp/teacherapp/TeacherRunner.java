package com.xworkz.overrideapp.teacherapp;

import com.xworkz.overrideapp.teacherapp.teacher.TeacherDto;

public class TeacherRunner {

    public static void main(String[] args) {

        TeacherDto ref1 = new TeacherDto();
        ref1.setTeacherId(1);
        ref1.setTeacherName("Anjali");
        ref1.setTeacherSubject("Mathematics");
        ref1.setTeacherExperience("10 years");
        ref1.setTeacherSchool("Delhi Public School");
        ref1.setTeacherLocation("Delhi");
        ref1.setTeacherSalary(850000.00);

        int teacherId1 = ref1.getTeacherId();
        String teacherName1 = ref1.getTeacherName();
        String teacherSubject1 = ref1.getTeacherSubject();
        String teacherExperience1 = ref1.getTeacherExperience();
        String teacherSchool1 = ref1.getTeacherSchool();
        String teacherLocation1 = ref1.getTeacherLocation();
        double teacherSalary1 = ref1.getTeacherSalary();

        System.out.println("Teacher ID: " + teacherId1);
        System.out.println("Teacher Name: " + teacherName1);
        System.out.println("Teacher Subject: " + teacherSubject1);
        System.out.println("Teacher Experience: " + teacherExperience1);
        System.out.println("Teacher School: " + teacherSchool1);
        System.out.println("Teacher Location: " + teacherLocation1);
        System.out.println("Teacher Salary: " + teacherSalary1);
        System.out.println("\n");

        TeacherDto ref2 = new TeacherDto();
        ref2.setTeacherId(2);
        ref2.setTeacherName("Rajesh");
        ref2.setTeacherSubject("Physics");
        ref2.setTeacherExperience("12 years");
        ref2.setTeacherSchool("National Public School");
        ref2.setTeacherLocation("Bengaluru");
        ref2.setTeacherSalary(900000.00);

        int teacherId2 = ref2.getTeacherId();
        String teacherName2 = ref2.getTeacherName();
        String teacherSubject2 = ref2.getTeacherSubject();
        String teacherExperience2 = ref2.getTeacherExperience();
        String teacherSchool2 = ref2.getTeacherSchool();
        String teacherLocation2 = ref2.getTeacherLocation();
        double teacherSalary2 = ref2.getTeacherSalary();

        System.out.println("Teacher ID: " + teacherId2);
        System.out.println("Teacher Name: " + teacherName2);
        System.out.println("Teacher Subject: " + teacherSubject2);
        System.out.println("Teacher Experience: " + teacherExperience2);
        System.out.println("Teacher School: " + teacherSchool2);
        System.out.println("Teacher Location: " + teacherLocation2);
        System.out.println("Teacher Salary: " + teacherSalary2);
        System.out.println("\n");

        TeacherDto ref3 = new TeacherDto();
        ref3.setTeacherId(3);
        ref3.setTeacherName("Meera");
        ref3.setTeacherSubject("English");
        ref3.setTeacherExperience("8 years");
        ref3.setTeacherSchool("Vidya Mandir");
        ref3.setTeacherLocation("Mumbai");
        ref3.setTeacherSalary(800000.00);

        int teacherId3 = ref3.getTeacherId();
        String teacherName3 = ref3.getTeacherName();
        String teacherSubject3 = ref3.getTeacherSubject();
        String teacherExperience3 = ref3.getTeacherExperience();
        String teacherSchool3 = ref3.getTeacherSchool();
        String teacherLocation3 = ref3.getTeacherLocation();
        double teacherSalary3 = ref3.getTeacherSalary();

        System.out.println("Teacher ID: " + teacherId3);
        System.out.println("Teacher Name: " + teacherName3);
        System.out.println("Teacher Subject: " + teacherSubject3);
        System.out.println("Teacher Experience: " + teacherExperience3);
        System.out.println("Teacher School: " + teacherSchool3);
        System.out.println("Teacher Location: " + teacherLocation3);
        System.out.println("Teacher Salary: " + teacherSalary3);
        System.out.println("\n");

        TeacherDto ref11 = new TeacherDto();
        ref11.setTeacherId(1);
        ref11.setTeacherName("Anjali");
        ref11.setTeacherSubject("Mathematics");
        ref11.setTeacherExperience("10 years");
        ref11.setTeacherSchool("Delhi Public School");
        ref11.setTeacherLocation("Delhi");
        ref11.setTeacherSalary(850000.00);

        System.out.println(ref3.toString());
        System.out.println(ref11.equals(ref1));
        System.out.println(ref2.hashCode());
    }
}
