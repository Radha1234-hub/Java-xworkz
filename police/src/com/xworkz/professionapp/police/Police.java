package com.xworkz.professionapp.police;

import com.xworkz.professionapp.profession.Profession;

public class Police extends Profession {
    @Override
    public void name() {
        System.out.println("Police officers represent law enforcement as a profession.");
    }

    @Override
    public void skills() {
        System.out.println("Police officers require skills in investigation, communication, physical fitness, and conflict resolution.");
    }

    @Override
    public void purpose() {
        System.out.println("The purpose of the police is to enforce laws, maintain public order, and ensure community safety.");
    }

    @Override
    public void workplace() {
        System.out.println("Police officers work in stations, patrol vehicles, public areas, and crime scenes.");
    }

    @Override
    public void uniform() {
        System.out.println("Police officers wear uniforms that include badges, belts, and caps to represent their authority.");
    }

    public void rankSystem() {
        System.out.println("Police departments have ranks such as constable, inspector, and commissioner.");
    }

    public void tools() {
        System.out.println("Police officers use tools like handcuffs, radios, batons, and firearms for their duties.");
    }
}
