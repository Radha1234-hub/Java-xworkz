package com.xworkz.simcardapp;

import com.xworkz.simcardapp.simcard.SimCard;

public class SimCardRunner {

    public static void main(String[] args) {

        // 1
        SimCard ref1 = new SimCard();
        ref1.setSimCardId(1);
        ref1.setSimCardType("Nano");
        ref1.setSimCardCarrier("Airtel");
        ref1.setSimCardNetwork("4G");
        ref1.setSimCardPlan("Unlimited calls + 2GB/day");
        ref1.setSimCardValidity("28 days");
        ref1.setSimCardCountry("India");

        int simCardId1 = ref1.getSimCardId();
        String simCardType1 = ref1.getSimCardType();
        String simCardCarrier1 = ref1.getSimCardCarrier();
        String simCardNetwork1 = ref1.getSimCardNetwork();
        String simCardPlan1 = ref1.getSimCardPlan();
        String simCardValidity1 = ref1.getSimCardValidity();
        String simCardCountry1 = ref1.getSimCardCountry();

        System.out.println("SimCard ID: " + simCardId1);
        System.out.println("SimCard Type: " + simCardType1);
        System.out.println("SimCard Carrier: " + simCardCarrier1);
        System.out.println("SimCard Network: " + simCardNetwork1);
        System.out.println("SimCard Plan: " + simCardPlan1);
        System.out.println("SimCard Validity: " + simCardValidity1);
        System.out.println("SimCard Country: " + simCardCountry1);
        System.out.println("\n");

        // 2
        SimCard ref2 = new SimCard();
        ref2.setSimCardId(2);
        ref2.setSimCardType("Micro");
        ref2.setSimCardCarrier("Reliance Jio");
        ref2.setSimCardNetwork("5G");
        ref2.setSimCardPlan("Unlimited calls + 3GB/day");
        ref2.setSimCardValidity("56 days");
        ref2.setSimCardCountry("India");

        int simCardId2 = ref2.getSimCardId();
        String simCardType2 = ref2.getSimCardType();
        String simCardCarrier2 = ref2.getSimCardCarrier();
        String simCardNetwork2 = ref2.getSimCardNetwork();
        String simCardPlan2 = ref2.getSimCardPlan();
        String simCardValidity2 = ref2.getSimCardValidity();
        String simCardCountry2 = ref2.getSimCardCountry();

        System.out.println("SimCard ID: " + simCardId2);
        System.out.println("SimCard Type: " + simCardType2);
        System.out.println("SimCard Carrier: " + simCardCarrier2);
        System.out.println("SimCard Network: " + simCardNetwork2);
        System.out.println("SimCard Plan: " + simCardPlan2);
        System.out.println("SimCard Validity: " + simCardValidity2);
        System.out.println("SimCard Country: " + simCardCountry2);
        System.out.println("\n");

        // 3
        SimCard ref3 = new SimCard();
        ref3.setSimCardId(3);
        ref3.setSimCardType("Nano");
        ref3.setSimCardCarrier("BSNL");
        ref3.setSimCardNetwork("3G");
        ref3.setSimCardPlan("500 mins + 1GB/day");
        ref3.setSimCardValidity("90 days");
        ref3.setSimCardCountry("India");

        int simCardId3 = ref3.getSimCardId();
        String simCardType3 = ref3.getSimCardType();
        String simCardCarrier3 = ref3.getSimCardCarrier();
        String simCardNetwork3 = ref3.getSimCardNetwork();
        String simCardPlan3 = ref3.getSimCardPlan();
        String simCardValidity3 = ref3.getSimCardValidity();
        String simCardCountry3 = ref3.getSimCardCountry();

        System.out.println("SimCard ID: " + simCardId3);
        System.out.println("SimCard Type: " + simCardType3);
        System.out.println("SimCard Carrier: " + simCardCarrier3);
        System.out.println("SimCard Network: " + simCardNetwork3);
        System.out.println("SimCard Plan: " + simCardPlan3);
        System.out.println("SimCard Validity: " + simCardValidity3);
        System.out.println("SimCard Country: " + simCardCountry3);
        System.out.println("\n");

        // 4
        SimCard ref4 = new SimCard();
        ref4.setSimCardId(4);
        ref4.setSimCardType("eSIM");
        ref4.setSimCardCarrier("Vodafone Idea");
        ref4.setSimCardNetwork("4G");
        ref4.setSimCardPlan("Unlimited calls + 1.5GB/day");
        ref4.setSimCardValidity("30 days");
        ref4.setSimCardCountry("India");

        int simCardId4 = ref4.getSimCardId();
        String simCardType4 = ref4.getSimCardType();
        String simCardCarrier4 = ref4.getSimCardCarrier();
        String simCardNetwork4 = ref4.getSimCardNetwork();
        String simCardPlan4 = ref4.getSimCardPlan();
        String simCardValidity4 = ref4.getSimCardValidity();
        String simCardCountry4 = ref4.getSimCardCountry();

        System.out.println("SimCard ID: " + simCardId4);
        System.out.println("SimCard Type: " + simCardType4);
        System.out.println("SimCard Carrier: " + simCardCarrier4);
        System.out.println("SimCard Network: " + simCardNetwork4);
        System.out.println("SimCard Plan: " + simCardPlan4);
        System.out.println("SimCard Validity: " + simCardValidity4);
        System.out.println("SimCard Country: " + simCardCountry4);
        System.out.println("\n");

        // 5
        SimCard ref5 = new SimCard();
        ref5.setSimCardId(5);
        ref5.setSimCardType("Nano");
        ref5.setSimCardCarrier("MTNL");
        ref5.setSimCardNetwork("3G");
        ref5.setSimCardPlan("1000 mins + 500MB/day");
        ref5.setSimCardValidity("60 days");
        ref5.setSimCardCountry("India");

        int simCardId5 = ref5.getSimCardId();
        String simCardType5 = ref5.getSimCardType();
        String simCardCarrier5 = ref5.getSimCardCarrier();
        String simCardNetwork5 = ref5.getSimCardNetwork();
        String simCardPlan5 = ref5.getSimCardPlan();
        String simCardValidity5 = ref5.getSimCardValidity();
        String simCardCountry5 = ref5.getSimCardCountry();

        System.out.println("SimCard ID: " + simCardId5);
        System.out.println("SimCard Type: " + simCardType5);
        System.out.println("SimCard Carrier: " + simCardCarrier5);
        System.out.println("SimCard Network: " + simCardNetwork5);
        System.out.println("SimCard Plan: " + simCardPlan5);
        System.out.println("SimCard Validity: " + simCardValidity5);
        System.out.println("SimCard Country: " + simCardCountry5);
        System.out.println("\n");
    }
}
