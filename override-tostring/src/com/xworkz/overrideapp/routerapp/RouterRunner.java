package com.xworkz.overrideapp.routerapp;
import com.xworkz.overrideapp.routerapp.router.RouterDto;

public class RouterRunner {

    public static void main(String[] args) {

        RouterDto ref1 = new RouterDto();
        ref1.setRouterId(1);
        ref1.setRouterBrand("TP-Link");
        ref1.setRouterModel("Archer AX50");
        ref1.setRouterType("Wi-Fi 6");
        ref1.setRouterSpeed("2400 Mbps");
        ref1.setRouterFrequency("Dual-band");
        ref1.setRouterPrice(6999.00);

        int routerId1 = ref1.getRouterId();
        String routerBrand1 = ref1.getRouterBrand();
        String routerModel1 = ref1.getRouterModel();
        String routerType1 = ref1.getRouterType();
        String routerSpeed1 = ref1.getRouterSpeed();
        String routerFrequency1 = ref1.getRouterFrequency();
        double routerPrice1 = ref1.getRouterPrice();

        System.out.println("Router ID: " + routerId1);
        System.out.println("Router Brand: " + routerBrand1);
        System.out.println("Router Model: " + routerModel1);
        System.out.println("Router Type: " + routerType1);
        System.out.println("Router Speed: " + routerSpeed1);
        System.out.println("Router Frequency: " + routerFrequency1);
        System.out.println("Router Price: " + routerPrice1);
        System.out.println("\n");

        RouterDto ref2 = new RouterDto();
        ref2.setRouterId(2);
        ref2.setRouterBrand("Netgear");
        ref2.setRouterModel("Nighthawk RAX30");
        ref2.setRouterType("Wi-Fi 6");
        ref2.setRouterSpeed("1800 Mbps");
        ref2.setRouterFrequency("Dual-band");
        ref2.setRouterPrice(7999.00);

        int routerId2 = ref2.getRouterId();
        String routerBrand2 = ref2.getRouterBrand();
        String routerModel2 = ref2.getRouterModel();
        String routerType2 = ref2.getRouterType();
        String routerSpeed2 = ref2.getRouterSpeed();
        String routerFrequency2 = ref2.getRouterFrequency();
        double routerPrice2 = ref2.getRouterPrice();

        System.out.println("Router ID: " + routerId2);
        System.out.println("Router Brand: " + routerBrand2);
        System.out.println("Router Model: " + routerModel2);
        System.out.println("Router Type: " + routerType2);
        System.out.println("Router Speed: " + routerSpeed2);
        System.out.println("Router Frequency: " + routerFrequency2);
        System.out.println("Router Price: " + routerPrice2);
        System.out.println("\n");

        RouterDto ref3 = new RouterDto();
        ref3.setRouterId(3);
        ref3.setRouterBrand("ASUS");
        ref3.setRouterModel("RT-AX86U");
        ref3.setRouterType("Gaming Router");
        ref3.setRouterSpeed("5700 Mbps");
        ref3.setRouterFrequency("Tri-band");
        ref3.setRouterPrice(15999.00);

        int routerId3 = ref3.getRouterId();
        String routerBrand3 = ref3.getRouterBrand();
        String routerModel3 = ref3.getRouterModel();
        String routerType3 = ref3.getRouterType();
        String routerSpeed3 = ref3.getRouterSpeed();
        String routerFrequency3 = ref3.getRouterFrequency();
        double routerPrice3 = ref3.getRouterPrice();

        System.out.println("Router ID: " + routerId3);
        System.out.println("Router Brand: " + routerBrand3);
        System.out.println("Router Model: " + routerModel3);
        System.out.println("Router Type: " + routerType3);
        System.out.println("Router Speed: " + routerSpeed3);
        System.out.println("Router Frequency: " + routerFrequency3);
        System.out.println("Router Price: " + routerPrice3);
        System.out.println("\n");

        System.out.println(ref3.toString());
    }
}
