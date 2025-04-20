package com.xworkz.cityapp;

import com.xworkz.cityapp.city.City;
import com.xworkz.cityapp.jaipur.Jaipur;

public class CityRunner {
    public static void main(String[] args) {

        City ref = new City();
        ref.name();
        ref.population();
        ref.landmarks();
        ref.culture();
        ref.economy();

        City ref1 = new Jaipur();
        ref1.name();
        ref1.population();
        ref1.landmarks();
        ref1.culture();
        ref1.economy();

        Jaipur ref2 = new Jaipur();
        ref2.name();
        ref2.population();
        ref2.landmarks();
        ref2.culture();
        ref2.economy();
        ref2.festivals();
        ref2.cuisine();
    }
}
