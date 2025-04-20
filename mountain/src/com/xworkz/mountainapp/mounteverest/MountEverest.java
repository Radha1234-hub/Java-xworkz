package com.xworkz.mountainapp.mounteverest;

import com.xworkz.mountainapp.mountain.Mountain;

public class MountEverest extends Mountain {

    @Override
    public void height() {
        System.out.println("Mount Everest is the highest mountain in the world, with a height of 8,849 meters above sea level.");
    }

    @Override
    public void location() {
        System.out.println("Mount Everest is located in the Himalayan range, on the border between Nepal and Tibet (China).");
    }

    @Override
    public void climate() {
        System.out.println("Mount Everest has extreme cold and windy conditions, with temperatures often below freezing.");
    }

    @Override
    public void activities() {
        System.out.println("Activities on Mount Everest include trekking to base camps and attempting summit expeditions.");
    }

    @Override
    public void biodiversity() {
        System.out.println("Mount Everest's biodiversity includes snow leopards, Himalayan tahrs, and alpine plants.");
    }

    public void history() {
        System.out.println("Mount Everest was first successfully summited by Tenzing Norgay and Edmund Hillary in 1953.");
    }

    public void challenges() {
        System.out.println("Challenges of Mount Everest expeditions include altitude sickness, extreme weather, and technical climbing.");
    }
}
