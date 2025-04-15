package com.xworkz.inheritenceapp.programminglanguage;

public class ProgrammingLanguageRunner {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.languageDetails();
        language.languageSyntax();
        language.memoryManagement();
        language.developmentTools();
        language.multiThreading();

        System.out.println("\n");

        ProgrammingLanguage ref = new Java();
        ref.languageDetails();
        ref.languageSyntax();
        ref.memoryManagement();
        ref.developmentTools();
        ref.multiThreading();

        System.out.println("\n");

        Java java = new Java();
        java.languageDetails();
        java.javaLibraries();
        java.javaApplications();
        java.javaSecurityFeatures();
        java.javaFrameworks();
    }
}
