package com.xworkz.metalapp.mercury;

import com.xworkz.metalapp.metal.Metal;

public class Mercury extends Metal{

    @Override
    public void properties() {
        System.out.println("Mercury is a unique metal that is liquid at room temperature and is highly reflective.");
    }

    @Override
    public void uses() {
        System.out.println("Mercury is used in thermometers, barometers, and fluorescent lamps, though its use is limited due to toxicity.");
    }

    @Override
    public void types() {
        System.out.println("Mercury is a non-ferrous metal with distinct physical and chemical properties.");
    }

    @Override
    public void density() {
        System.out.println("Mercury has a high density of about 13.6 g/cm³, making it one of the densest metals.");
    }

    @Override
    public void reactions() {
        System.out.println("Mercury reacts with acids and halogens, forming compounds like mercuric chloride and mercurous oxide.");
    }

    public void safetyPrecautions() {
        System.out.println("Mercury is toxic and must be handled with extreme care to avoid exposure.");
    }

    public void environmentalImpact() {
        System.out.println("Mercury can contaminate water and soil, posing risks to ecosystems and human health.");
    }


}
