package com.xworkz.countryapp;

import com.xworkz.countryapp.India.India;
import com.xworkz.countryapp.country.Country;

public class CountryRunner {

    public static void main(String[] args) {

        Country ref = new Country();
        ref.name();
        ref.population();
        ref.capital();
        ref.economy();
        ref.language();

        Country ref1 = new India();
        ref1.name();
        ref1.population();
        ref1.capital();
        ref1.economy();
        ref1.language();

        India ref2 = new India();
        ref2.name();
        ref2.population();
        ref2.capital();
        ref2.economy();
        ref2.language();
        ref2.culturalDiversity();
        ref2.historicalSignificance();
    }
}
