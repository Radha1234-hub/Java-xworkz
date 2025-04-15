package com.xworkz.inheritenceapp.virus;

public class VirusRunner {public static void main(String[] args) {
    Virus virus = new Virus();
    virus.virusDetails();
    virus.transmissionMode();
    virus.replicationProcess();
    virus.preventionMethods();
    virus.globalImpact();

    System.out.println("\n");

    Virus ref = new Corona();
    ref.virusDetails();
    ref.transmissionMode();
    ref.replicationProcess();
    ref.preventionMethods();
    ref.globalImpact();

    System.out.println("\n");

    Corona corona = new Corona();
    corona.virusDetails();
    corona.symptoms();
    corona.spreadMechanism();
    corona.vaccinationDevelopment();
    corona.economicEffects();

}
}
