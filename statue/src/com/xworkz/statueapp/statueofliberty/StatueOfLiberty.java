package com.xworkz.statueapp.statueofliberty;

import com.xworkz.statueapp.statue.Statue;

import java.util.Stack;

public class StatueOfLiberty extends Statue {
    @Override
    public void name() {
        System.out.println("The Statue of Liberty is officially named 'Liberty Enlightening the World.'");
    }

    @Override
    public void height() {
        System.out.println("The Statue of Liberty stands 93 meters (305 feet) tall, including its pedestal.");
    }

    @Override
    public void material() {
        System.out.println("The Statue of Liberty is made of copper, with an internal iron and steel framework.");
    }

    @Override
    public void location() {
        System.out.println("The Statue of Liberty is located on Liberty Island in New York Harbor, USA.");
    }

    @Override
    public void purpose() {
        System.out.println("The Statue of Liberty was a gift from France, symbolizing freedom and democracy.");
    }

    public void designer() {
        System.out.println("The Statue of Liberty was designed by French sculptor Frédéric Auguste Bartholdi.");
    }

    public void dateOfInauguration() {
        System.out.println("The Statue of Liberty was inaugurated on October 28, 1886.");
    }
}
