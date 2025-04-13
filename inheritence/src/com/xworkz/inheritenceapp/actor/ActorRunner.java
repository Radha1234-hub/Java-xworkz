package com.xworkz.inheritenceapp.actor;

public class ActorRunner {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.actorDetails();

        Rajinikanth rajinikanth = new Rajinikanth();
        rajinikanth.actorDetails();

        Actor shiva = new Rajinikanth();
        shiva.actorDetails();

        Rajinikanth downcasted = (Rajinikanth) shiva;
        downcasted.actorDetails();
    }
}