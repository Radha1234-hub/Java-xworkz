package com.xworkz.gym.gymapp.client;


public class Client {

    public int clientId;
    public String clientName;
    public String equipment[];

    public void displayClientInfo() {
        System.out.println("Client ID: " + clientId);
        System.out.println("Client Name: " + clientName);
        System.out.println("Equipment Used:");
        for (String equip : equipment) {
            System.out.println(equip);
        }
    }
}

