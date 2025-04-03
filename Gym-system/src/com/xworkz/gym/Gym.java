package com.xworkz.gym;


import com.xworkz.gym.gymapp.trainer.Trainer;

public class Gym {

    public int gymId;
    public String gymBranches[];
    public String location;
    public Trainer trainers[];

    public void displayGymInfo() {
        System.out.println("Gym ID: " + gymId);
        System.out.println("Gym Branches:");
        for (String branch : gymBranches) {
            System.out.print(branch + " ");
        }
        System.out.println();
        System.out.println("Location: " + location);
        for (Trainer trainer : trainers) {
            trainer.displayTrainerInfo();
        }
    }
}

