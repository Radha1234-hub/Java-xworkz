package com.xworkz.civilizationapp;

import com.xworkz.civilizationapp.civilization.Civilization;
import com.xworkz.civilizationapp.indus.IndusValley;

public class CivilizationRunner {
    public static void main(String[] args) {

        Civilization ref = new Civilization();
        ref.period();
        ref.advancements();
        ref.trade();
        ref.societyStructure();
        ref.legacy();

        Civilization ref1 = new IndusValley();
        ref1.period();
        ref1.advancements();
        ref1.trade();
        ref1.societyStructure();
        ref1.legacy();

        IndusValley ref2 = new IndusValley();
        ref2.period();
        ref2.advancements();
        ref2.trade();
        ref2.societyStructure();
        ref2.legacy();
        ref2.notableCities();
        ref2.waterManagement();
    }
}
