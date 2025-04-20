package com.xworkz.gasesapp.oxygen;

import com.xworkz.gasesapp.gases.Gases;

public class Oxygen extends Gases {
    @Override
    public void composition() {
        System.out.println("Oxygen is a diatomic gas with the chemical formula O₂.");
    }

    @Override
    public void properties() {
        System.out.println("Oxygen is colorless, odorless, and supports combustion. It is slightly denser than air.");
    }

    @Override
    public void uses() {
        System.out.println("Oxygen is used in medical treatments, welding, and as a life-supporting gas for breathing.");
    }

    @Override
    public void occurrence() {
        System.out.println("Oxygen makes up about 21% of the Earth's atmosphere and is abundant in water and minerals.");
    }

    @Override
    public void behavior() {
        System.out.println("Oxygen reacts with other elements to form oxides and supports combustion processes.");
    }

    public void biologicalImportance() {
        System.out.println("Oxygen is essential for cellular respiration in living organisms.");
    }

    public void industrialApplications() {
        System.out.println("Oxygen is used in industries for steelmaking, chemical production, and wastewater treatment.");
    }
}
