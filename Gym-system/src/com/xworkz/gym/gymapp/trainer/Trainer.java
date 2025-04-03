package com.xworkz.gym.gymapp.trainer;

import com.xworkz.gym.gymapp.client.Client;

public class Trainer {

    public int trainerId;
    public String trainerName;
    public Client clients[];

    public void displayTrainerInfo() {
        System.out.println("Trainer ID: " + trainerId);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Clients:");
        for (Client client : clients) {
            client.displayClientInfo();
        }
    }
}

