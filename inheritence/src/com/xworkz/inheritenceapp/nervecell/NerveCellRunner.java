package com.xworkz.inheritenceapp.nervecell;

public class NerveCellRunner {
    public static void main(String[] args) {
        NerveCell nerve = new NerveCell();
        nerve.nerveDetails();

        Neuron neuron = new Neuron();
        neuron.nerveDetails();

        NerveCell ref = new Neuron();
        ref.nerveDetails();

        Neuron downcasted = (Neuron) ref;
        downcasted.nerveDetails();


    }
}