package com.xworkz.inheritenceapp.sport;

public class SportRunner {

    public static void main(String[] args) {
        Sport sport = new Sport();
        sport.sportDetails();
        sport.basicRules();
        sport.playerRoles();
        sport.gameFormats();
        sport.historyOfCricket();

        System.out.println("\n");

        Sport ref = new Cricket();
        ref.sportDetails();
        ref.basicRules();
        ref.playerRoles();
        ref.gameFormats();
        ref.historyOfCricket();

        System.out.println("\n");

        Cricket cricket = new Cricket();
        cricket.sportDetails();
        cricket.battingTechniques();
        cricket.bowlingStrategies();
        cricket.fieldingSkills();
        cricket.worldCupHistory();
    }
}
