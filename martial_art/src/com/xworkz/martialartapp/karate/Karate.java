package com.xworkz.martialartapp.karate;

import com.xworkz.martialartapp.martialart.MartilaArt;

public class Karate extends MartilaArt {
    @Override
    public void origin() {
        System.out.println("Karate originated in Okinawa, Japan, and is influenced by traditional Okinawan and Chinese martial arts.");
    }

    @Override
    public void techniques() {
        System.out.println("Karate techniques include punches, kicks, knee strikes, and open-hand techniques.");
    }

    @Override
    public void purpose() {
        System.out.println("Karate is practiced for self-defense, competition, and personal discipline.");
    }

    @Override
    public void equipment() {
        System.out.println("Karate uses equipment like gi (uniform), belts to indicate rank, and protective gear for sparring.");
    }

    @Override
    public void philosophy() {
        System.out.println("Karate emphasizes respect, focus, and continuous improvement through practice.");
    }

    public void kata() {
        System.out.println("Kata are predefined sequences of movements in Karate used for training and demonstration.");
    }

    public void beltSystem() {
        System.out.println("Karate uses a belt ranking system, progressing from white belt to black belt and beyond.");
    }
}
