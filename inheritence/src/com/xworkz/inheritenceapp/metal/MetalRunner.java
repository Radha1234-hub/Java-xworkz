package com.xworkz.inheritenceapp.metal;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Metal();
        metal.metalDetails();

        Gold gold = new Gold();
        gold.metalDetails();

    Metal ref = new Gold();
    ref.metalDetails();

        Gold downcasted = (Gold) ref;
        downcasted.metalDetails();

    }}
