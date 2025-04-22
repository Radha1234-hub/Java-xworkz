package com.xworkz.overrideapp.switchesapp;


import com.xworkz.overrideapp.switchesapp.switches.SwitchesDto;

public class SwitchesRunner {
    public static void main(String[] args) {

        SwitchesDto ref1 = new SwitchesDto();
        ref1.setSwitchesId(1);
        ref1.setSwitchesBrand("Legrand");
        ref1.setSwitchesType("Modular");
        ref1.setSwitchesMaterial("Polycarbonate");
        ref1.setSwitchesCurrentRating("10A");
        ref1.setSwitchesColor("White");
        ref1.setSwitchesPrice(250.00);

        int switchesId1 = ref1.getSwitchesId();
        String switchesBrand1 = ref1.getSwitchesBrand();
        String switchesType1 = ref1.getSwitchesType();
        String switchesMaterial1 = ref1.getSwitchesMaterial();
        String switchesCurrentRating1 = ref1.getSwitchesCurrentRating();
        String switchesColor1 = ref1.getSwitchesColor();
        double switchesPrice1 = ref1.getSwitchesPrice();

        System.out.println("Switches ID: " + switchesId1);
        System.out.println("Switches Brand: " + switchesBrand1);
        System.out.println("Switches Type: " + switchesType1);
        System.out.println("Switches Material: " + switchesMaterial1);
        System.out.println("Switches Current Rating: " + switchesCurrentRating1);
        System.out.println("Switches Color: " + switchesColor1);
        System.out.println("Switches Price: " + switchesPrice1);
        System.out.println("\n");

        SwitchesDto ref2 = new SwitchesDto();
        ref2.setSwitchesId(2);
        ref2.setSwitchesBrand("Schneider Electric");
        ref2.setSwitchesType("Rocker Switch");
        ref2.setSwitchesMaterial("Thermoplastic");
        ref2.setSwitchesCurrentRating("16A");
        ref2.setSwitchesColor("Black");
        ref2.setSwitchesPrice(300.00);

        int switchesId2 = ref2.getSwitchesId();
        String switchesBrand2 = ref2.getSwitchesBrand();
        String switchesType2 = ref2.getSwitchesType();
        String switchesMaterial2 = ref2.getSwitchesMaterial();
        String switchesCurrentRating2 = ref2.getSwitchesCurrentRating();
        String switchesColor2 = ref2.getSwitchesColor();
        double switchesPrice2 = ref2.getSwitchesPrice();

        System.out.println("Switches ID: " + switchesId2);
        System.out.println("Switches Brand: " + switchesBrand2);
        System.out.println("Switches Type: " + switchesType2);
        System.out.println("Switches Material: " + switchesMaterial2);
        System.out.println("Switches Current Rating: " + switchesCurrentRating2);
        System.out.println("Switches Color: " + switchesColor2);
        System.out.println("Switches Price: " + switchesPrice2);
        System.out.println("\n");

        SwitchesDto ref3 = new SwitchesDto();
        ref3.setSwitchesId(3);
        ref3.setSwitchesBrand("Havells");
        ref3.setSwitchesType("Touch Switch");
        ref3.setSwitchesMaterial("Glass Panel");
        ref3.setSwitchesCurrentRating("6A");
        ref3.setSwitchesColor("Blue");
        ref3.setSwitchesPrice(750.00);

        int switchesId3 = ref3.getSwitchesId();
        String switchesBrand3 = ref3.getSwitchesBrand();
        String switchesType3 = ref3.getSwitchesType();
        String switchesMaterial3 = ref3.getSwitchesMaterial();
        String switchesCurrentRating3 = ref3.getSwitchesCurrentRating();
        String switchesColor3 = ref3.getSwitchesColor();
        double switchesPrice3 = ref3.getSwitchesPrice();

        System.out.println("Switches ID: " + switchesId3);
        System.out.println("Switches Brand: " + switchesBrand3);
        System.out.println("Switches Type: " + switchesType3);
        System.out.println("Switches Material: " + switchesMaterial3);
        System.out.println("Switches Current Rating: " + switchesCurrentRating3);
        System.out.println("Switches Color: " + switchesColor3);
        System.out.println("Switches Price: " + switchesPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
