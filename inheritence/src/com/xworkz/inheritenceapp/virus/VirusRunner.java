package com.xworkz.inheritenceapp.virus;

public class VirusRunner {public static void main(String[] args) {
    Virus virus = new Virus();
    virus.virusDetails();

    Corona corona = new Corona();
    corona.virusDetails();

    Virus ref = new Corona();
    ref.virusDetails();

    Corona downcasted = (Corona) ref;
    downcasted.virusDetails();

}
}
