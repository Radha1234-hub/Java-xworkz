package com.xworkz.gym;


import com.xworkz.gym.gymapp.trainer.Trainer;
import com.xworkz.gym.gymapp.client.Client;

public class GymRunner {

    public static void main(String[] args) {
        String branches[] = {"Jayanagar", "Rajajinagar", "JP Nagar"};

        Gym gym1 = new Gym();
        gym1.gymId = 1;
        gym1.gymBranches = branches;
        gym1.location = "Bangalore";

        Trainer trainers[] = new Trainer[2];

        // Trainer 1
        Trainer trainer1 = new Trainer();
        trainer1.trainerId = 101;
        trainer1.trainerName = "Ramesh";
        Client clients1[] = new Client[2];

        Client client1 = new Client();
        client1.clientId = 1;
        client1.clientName = "Suresh";
        String equipment1[] = {"Treadmill", "Dumbbells", "Resistance Bands"};
        client1.equipment = equipment1;

        Client client2 = new Client();
        client2.clientId = 2;
        client2.clientName = "Mahesh";
        String equipment2[] = {"Cycle Machine", "Barbell", "Pull-up Bar"};
        client2.equipment = equipment2;

        clients1[0] = client1;
        clients1[1] = client2;
        trainer1.clients = clients1;

        // Trainer 2
        Trainer trainer2 = new Trainer();
        trainer2.trainerId = 102;
        trainer2.trainerName = "Ganesh";
        Client clients2[] = new Client[2];

        Client client3 = new Client();
        client3.clientId = 3;
        client3.clientName = "Naresh";
        String equipment3[] = {"Rowing Machine", "Kettlebells", "Yoga Mat"};
        client3.equipment = equipment3;

        Client client4 = new Client();
        client4.clientId = 4;
        client4.clientName = "Rakesh";
        String equipment4[] = {"Elliptical", "Medicine Ball", "Foam Roller"};
        client4.equipment = equipment4;

        clients2[0] = client3;
        clients2[1] = client4;
        trainer2.clients = clients2;

        trainers[0] = trainer1;
        trainers[1] = trainer2;

        gym1.trainers = trainers;

        gym1.displayGymInfo();
    }
}

