package com.xworkz.inheritenceapp.programminglanguage;

public class ProgrammingLanguageRunner {
    public static void main(String[] args) {
        ProgrammingLanguage java = new ProgrammingLanguage();
        java.languageDetails();

        Java ref = new Java();
        ref.languageDetails();

        ProgrammingLanguage ref1 = new Java();
        ref1.languageDetails();

        Java downcasted = (Java) ref1;
        downcasted.languageDetails();

    }
}
