package com.xworkz.inheritenceapp.gemstone;

public class GemstoneRunner {
    public static void main(String[] args) {
        Gemstone gemstone = new Gemstone();
        gemstone.gemstoneDetails();

        Daimond daimond = new Daimond();
        daimond.gemstoneDetails();

        Gemstone ref = new Daimond();
        ref.gemstoneDetails();

        Daimond downcasted = (Daimond) ref;
        downcasted.gemstoneDetails();

    }}
