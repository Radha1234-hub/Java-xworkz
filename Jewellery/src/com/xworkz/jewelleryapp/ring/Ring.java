package com.xworkz.jewelleryapp.ring;

import com.xworkz.jewelleryapp.jewellery.Jewellery;

public class Ring extends Jewellery {
    @Override
    public void type() {
        System.out.println("Rings are a type of jewellery worn on fingers, often symbolizing love, commitment, or achievements.");
    }

    @Override
    public void material() {
        System.out.println("Rings can be made from gold, silver, platinum, or encrusted with diamonds and gemstones.");
    }

    @Override
    public void purpose() {
        System.out.println("Rings are commonly used in engagements, weddings, and as fashion accessories.");
    }

    @Override
    public void origin() {
        System.out.println("Rings have been used historically in various cultures as symbols of power, loyalty, and love.");
    }

    @Override
    public void maintenance() {
        System.out.println("Rings require regular cleaning and care to maintain their luster, especially if they have gemstones.");
    }

    public void size() {
        System.out.println("Rings come in different sizes to fit comfortably on the fingers.");
    }

    public void engraving() {
        System.out.println("Rings can be personalized with engravings, such as names, dates, or meaningful quotes.");
    }
}
