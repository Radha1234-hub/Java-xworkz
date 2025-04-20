package com.xworkz.chocolateapp.fivestar;

import com.xworkz.chocolateapp.chocolate.Chocolate;

public class FiveStar extends Chocolate {

    @Override
    public void type() {
        System.out.println("Five Star is a type of milk chocolate with caramel and nougat filling.");
    }

    @Override
    public void ingredients() {
        System.out.println("Five Star contains milk chocolate, caramel, nougat, sugar, and other flavor enhancers.");
    }

    @Override
    public void texture() {
        System.out.println("Five Star has a chewy texture due to its caramel and nougat layers, along with smooth chocolate coating.");
    }

    @Override
    public void packaging() {
        System.out.println("Five Star is packaged in shiny wrappers with the recognizable logo and branding.");
    }

    @Override
    public void popularity() {
        System.out.println("Five Star is a widely popular chocolate brand, known for its rich and indulgent taste.");
    }

    public void marketReach() {
        System.out.println("Five Star chocolates are marketed in various countries and have region-specific flavors.");
    }

    public void specialEditions() {
        System.out.println("Five Star occasionally launches special edition flavors for festivals or promotions.");
    }

}
