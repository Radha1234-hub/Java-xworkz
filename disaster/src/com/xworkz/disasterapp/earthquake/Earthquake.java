package com.xworkz.disasterapp.earthquake;

import com.xworkz.disasterapp.disaster.Disaster;

public class Earthquake extends Disaster {
    @Override
    public void type() {
        System.out.println("Earthquake is a natural disaster caused by sudden movement of tectonic plates.");
    }

    @Override
    public void cause() {
        System.out.println("Earthquakes occur due to tectonic shifts, volcanic activity, or underground explosions.");
    }

    @Override
    public void impact() {
        System.out.println("Earthquakes can cause building collapses, landslides, tsunamis, and loss of life.");
    }

    @Override
    public void preparedness() {
        System.out.println("Preparedness for earthquakes includes earthquake-resistant structures, drills, and survival kits.");
    }

    @Override
    public void recovery() {
        System.out.println("Recovery after earthquakes involves rescuing victims, restoring utilities, and rebuilding communities.");
    }

    public void magnitude() {
        System.out.println("Earthquakes are measured on the Richter scale or Moment Magnitude Scale to gauge their intensity.");
    }

    public void regions() {
        System.out.println("Regions prone to earthquakes include areas near tectonic plate boundaries, like the Pacific Ring of Fire.");
    }
}
