package com.xworkz.inheritenceapp.nervecell;

public class NerveCellRunner {
    public static void main(String[] args) {
        NerveCell nerve = new NerveCell();
        nerve.nerveDetails();
        nerve.signalTransmission();
        nerve.nerveStructure();
        nerve.nerveFunction();
        nerve.nervousSystemSupport();

        System.out.println("\n");

        NerveCell ref = new Neuron();
        ref.nerveDetails();
        ref.signalTransmission();
        ref.nerveStructure();
        ref.nerveFunction();
        ref.nervousSystemSupport();

        System.out.println("\n");

        Neuron neuron = new Neuron();
        neuron.nerveDetails();
        neuron.synapseFunction();
        neuron.neuronTypes();
        neuron.neuronFunctionality();
        neuron.brainIntegration();

    }
}