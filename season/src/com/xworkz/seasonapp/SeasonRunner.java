package com.xworkz.seasonapp;

import com.xworkz.seasonapp.season.Season;
import com.xworkz.seasonapp.summer.Summer;

public class SeasonRunner {
    public static void main(String[] args) {

        Season ref = new Season();
        ref.weather();
        ref.activities();
        ref.duration();
        ref.changes();
        ref.festivals();

        Season ref1 = new Summer();
        ref1.weather();
        ref1.activities();
        ref1.duration();
        ref1.changes();
        ref1.festivals();

        Summer ref2 = new Summer();
        ref2.weather();
        ref2.activities();
        ref2.duration();
        ref2.changes();
        ref2.festivals();
        ref2.hydration();
        ref2.fashion();
    }
}
