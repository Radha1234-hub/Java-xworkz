package com.xworkz.overrideapp.chefapp;

import com.xworkz.overrideapp.chefapp.chef.ChefDto;

public class ChefRunner {

    public static void main(String[] args) {

        ChefDto ref1 = new ChefDto();
        ref1.setChefId(1);
        ref1.setChefName("Sanjeev");
        ref1.setChefSpecialization("Indian Cuisine");
        ref1.setChefExperience("15 years");
        ref1.setChefRestaurant("The Taj Mahal Palace");
        ref1.setChefLocation("Mumbai");
        ref1.setChefSalary(2000000.00);

        int chefId1 = ref1.getChefId();
        String chefName1 = ref1.getChefName();
        String chefSpecialization1 = ref1.getChefSpecialization();
        String chefExperience1 = ref1.getChefExperience();
        String chefRestaurant1 = ref1.getChefRestaurant();
        String chefLocation1 = ref1.getChefLocation();
        double chefSalary1 = ref1.getChefSalary();

        System.out.println("Chef ID: " + chefId1);
        System.out.println("Chef Name: " + chefName1);
        System.out.println("Chef Specialization: " + chefSpecialization1);
        System.out.println("Chef Experience: " + chefExperience1);
        System.out.println("Chef Restaurant: " + chefRestaurant1);
        System.out.println("Chef Location: " + chefLocation1);
        System.out.println("Chef Salary: " + chefSalary1);
        System.out.println("\n");

        ChefDto ref2 = new ChefDto();
        ref2.setChefId(2);
        ref2.setChefName("Neha");
        ref2.setChefSpecialization("Italian Cuisine");
        ref2.setChefExperience("10 years");
        ref2.setChefRestaurant("Oberoi Hotels");
        ref2.setChefLocation("Delhi");
        ref2.setChefSalary(1800000.00);

        int chefId2 = ref2.getChefId();
        String chefName2 = ref2.getChefName();
        String chefSpecialization2 = ref2.getChefSpecialization();
        String chefExperience2 = ref2.getChefExperience();
        String chefRestaurant2 = ref2.getChefRestaurant();
        String chefLocation2 = ref2.getChefLocation();
        double chefSalary2 = ref2.getChefSalary();

        System.out.println("Chef ID: " + chefId2);
        System.out.println("Chef Name: " + chefName2);
        System.out.println("Chef Specialization: " + chefSpecialization2);
        System.out.println("Chef Experience: " + chefExperience2);
        System.out.println("Chef Restaurant: " + chefRestaurant2);
        System.out.println("Chef Location: " + chefLocation2);
        System.out.println("Chef Salary: " + chefSalary2);
        System.out.println("\n");

        ChefDto ref3 = new ChefDto();
        ref3.setChefId(3);
        ref3.setChefName("Vikram");
        ref3.setChefSpecialization("French Pastry");
        ref3.setChefExperience("12 years");
        ref3.setChefRestaurant("ITC Grand Chola");
        ref3.setChefLocation("Chennai");
        ref3.setChefSalary(1900000.00);

        int chefId3 = ref3.getChefId();
        String chefName3 = ref3.getChefName();
        String chefSpecialization3 = ref3.getChefSpecialization();
        String chefExperience3 = ref3.getChefExperience();
        String chefRestaurant3 = ref3.getChefRestaurant();
        String chefLocation3 = ref3.getChefLocation();
        double chefSalary3 = ref3.getChefSalary();

        System.out.println("Chef ID: " + chefId3);
        System.out.println("Chef Name: " + chefName3);
        System.out.println("Chef Specialization: " + chefSpecialization3);
        System.out.println("Chef Experience: " + chefExperience3);
        System.out.println("Chef Restaurant: " + chefRestaurant3);
        System.out.println("Chef Location: " + chefLocation3);
        System.out.println("Chef Salary: " + chefSalary3);
        System.out.println("\n");

        ChefDto ref22 = new ChefDto();
        ref22.setChefId(2);
        ref22.setChefName("Neha");
        ref22.setChefSpecialization("Italian Cuisine");
        ref22.setChefExperience("10 years");
        ref22.setChefRestaurant("Oberoi Hotels");
        ref22.setChefLocation("Delhi");
        ref22.setChefSalary(1800000.00);

        System.out.println(ref3.toString());
        System.out.println(ref2.equals(ref22));
        System.out.println(ref22.hashCode());
    }
}
