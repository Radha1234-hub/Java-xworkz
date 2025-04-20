package com.xworkz.tabletapp.dot;

import com.xworkz.tabletapp.tablet.Tablet;

public class Dot extends Tablet {

    @Override
    public void composition() {
        System.out.println("Dot tablets contain specific combinations such as Amoxycillin and Lactobacillus or Drotaverine and Mefenamic Acid.");
    }

    @Override
    public void usage() {
        System.out.println("Dot tablets are used for treating bacterial infections, abdominal pain, and cramps.");
    }

    @Override
    public void dosage() {
        System.out.println("Dot tablet dosage is prescribed by a doctor and varies based on the patient's condition.");
    }

    @Override
    public void packaging() {
        System.out.println("Dot tablets are packaged in blister packs for convenient storage and usage.");
    }

    @Override
    public void shelfLife() {
        System.out.println("Dot tablets have a defined shelf life and must be stored in a cool, dry place.");
    }

    public void precautions() {
        System.out.println("Do tablets must be taken as prescribed, and allergic reactions should be monitored.");
    }

    public void effectiveness() {
        System.out.println("Dot tablets work effectively when taken correctly and as part of a prescribed treatment plan.");
    }
}
