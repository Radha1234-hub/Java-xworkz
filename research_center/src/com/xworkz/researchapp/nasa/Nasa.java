package com.xworkz.researchapp.nasa;

import com.xworkz.researchapp.research.ReserachCenter;

public class Nasa extends ReserachCenter {

    @Override
    public void focusArea() {
        System.out.println("NASA focuses on space exploration, aeronautics, and advanced scientific research.");
    }

    @Override
    public void funding() {
        System.out.println("NASA is primarily funded by the U.S. government through federal budgets.");
    }

    @Override
    public void achievements() {
        System.out.println("NASA's achievements include the Apollo Moon landings, Mars rovers, and the Hubble Space Telescope.");
    }

    @Override
    public void location() {
        System.out.println("NASA's headquarters is in Washington, D.C., with research facilities like JPL and Kennedy Space Center.");
    }

    @Override
    public void collaborations() {
        System.out.println("NASA collaborates with international space agencies like ESA, JAXA, and private companies like SpaceX.");
    }

    public void missions() {
        System.out.println("NASA conducts missions like Artemis for the Moon, Perseverance for Mars, and Webb for deep-space exploration.");
    }

    public void educationPrograms() {
        System.out.println("NASA runs educational programs to inspire the next generation of scientists and engineers.");
    }
}
