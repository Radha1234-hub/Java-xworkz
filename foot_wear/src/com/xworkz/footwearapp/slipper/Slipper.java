package com.xworkz.footwearapp.slipper;

import com.xworkz.footwearapp.footwear.FootWear;

public class Slipper extends FootWear {
    @Override
    public void type() {
        System.out.println("Slippers are a type of casual footwear, typically used indoors or for light outdoor activities.");
    }

    @Override
    public void material() {
        System.out.println("Slippers are often made from rubber, foam, or soft fabric for comfort.");
    }

    @Override
    public void usage() {
        System.out.println("Slippers are used for easy wear and relaxation, especially at home.");
    }

    @Override
    public void size() {
        System.out.println("Slippers generally come in standard sizes, with options for adjustable straps.");
    }

    @Override
    public void design() {
        System.out.println("Slippers feature simple designs, often open-toed, and may include colorful or fun patterns.");
    }

    public void comfortLevel() {
        System.out.println("Slippers prioritize comfort with cushioned soles and breathable materials.");
    }

    public void slipResistance() {
        System.out.println("Many slippers are designed with slip-resistant soles for safe use on smooth surfaces.");
    }
}
