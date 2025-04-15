package com.xworkz.inheritenceapp.actor;

public class ActorRunner {
    public static void main(String[] args) {
        // Copy of Parent Class
        Actor actor = new Actor();
        actor.actorDetails();
        actor.performRole();
        actor.attendAuditions();
        actor.rehearseDialogues();
        actor.receiveAwards();

        System.out.println("\n");

        // Copy of Subclass Using Parent Reference Type
        Actor rajiniAsActor = new Rajinikanth();
        rajiniAsActor.actorDetails();
        rajiniAsActor.performRole();
        rajiniAsActor.attendAuditions();
        rajiniAsActor.rehearseDialogues();
        rajiniAsActor.receiveAwards();

        System.out.println("\n");

        // Copy of Subclass Using Subclass Reference Type
        Rajinikanth rajinikanth = new Rajinikanth();
        rajinikanth.actorDetails();
        rajinikanth.signatureStyle();
        rajinikanth.fanFollowing();
        rajinikanth.blockbusterMovies();
        rajinikanth.charisma();


    }
}