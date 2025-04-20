package com.xworkz.gemapp.pearl;

import com.xworkz.gemapp.gem.Gem;

public class Pearl extends Gem {
    @Override
    public void type() {
        System.out.println("Pearls are organic gems created by mollusks, often categorized as natural or cultured pearls.");
    }

    @Override
    public void formation() {
        System.out.println("Pearls are formed when a mollusk secretes layers of nacre around an irritant inside its shell.");
    }

    @Override
    public void uses() {
        System.out.println("Pearls are primarily used in necklaces, earrings, rings, and other jewelry pieces.");
    }

    @Override
    public void value() {
        System.out.println("The value of pearls depends on their size, luster, shape, and origin.");
    }

    @Override
    public void care() {
        System.out.println("Pearls require gentle cleaning and should be stored separately to avoid scratches.");
    }

    public void origin() {
        System.out.println("Natural pearls are harvested from oceans, while cultured pearls are produced in pearl farms.");
    }

    public void colorVarieties() {
        System.out.println("Pearls come in various colors, including white, pink, black, and golden.");
    }
}
