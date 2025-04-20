package com.xworkz.danceapp.kathak;

import com.xworkz.danceapp.danceform.DanceForm;

public class Kathak extends DanceForm {
    @Override
    public void origin() {
        System.out.println("Kathak originated in Northern India and is deeply rooted in storytelling traditions.");
    }

    @Override
    public void style() {
        System.out.println("Kathak is characterized by intricate footwork, spins, and expressive hand gestures.");
    }

    @Override
    public void music() {
        System.out.println("Kathak is performed with Hindustani classical music, often including tabla and sitar.");
    }

    @Override
    public void costume() {
        System.out.println("Kathak dancers wear traditional Anarkali suits or lehengas, often adorned with embellishments.");
    }

    @Override
    public void expression() {
        System.out.println("Kathak relies heavily on facial expressions and eye movements to narrate stories.");
    }

    public void gharanas() {
        System.out.println("Kathak has three main gharanas (styles): Lucknow, Jaipur, and Banaras.");
    }

    public void storytelling() {
        System.out.println("Kathak incorporates storytelling, drawing inspiration from epics like Mahabharata and Ramayana.");
    }
}
