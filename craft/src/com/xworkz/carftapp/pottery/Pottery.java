package com.xworkz.carftapp.pottery;

import com.xworkz.carftapp.craft.Craft;

public class Pottery extends Craft {

    @Override
    public void type() {
        System.out.println("Pottery is a type of craft that involves shaping and firing clay to create vessels and decorative items.");
    }

    @Override
    public void materials() {
        System.out.println("Pottery uses materials such as clay, glazes, and natural pigments for finishing.");
    }

    @Override
    public void tools() {
        System.out.println("Pottery requires tools like potter's wheels, kilns, shaping tools, and sponges.");
    }

    @Override
    public void purpose() {
        System.out.println("Pottery is used to make functional items like bowls and pots, as well as artistic sculptures.");
    }

    @Override
    public void history() {
        System.out.println("Pottery dates back to ancient times, with early examples found in cultures like Mesopotamia and the Indus Valley.");
    }

    public void firingProcess() {
        System.out.println("Pottery is hardened through firing processes in kilns at high temperatures.");
    }

    public void styles() {
        System.out.println("Pottery includes styles such as earthenware, stoneware, and porcelain, each with unique characteristics.");
    }
}
