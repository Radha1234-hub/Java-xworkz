package com.xworkz.inheritenceapp.tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.treeDetails();
        tree.treeGrowth();
        tree.environmentalImpact();
        tree.biodiversitySupport();
        tree.medicinalProperties();

        System.out.println("\n");

        Tree ref = new Neem();
        ref.treeDetails();
        ref.treeGrowth();
        ref.environmentalImpact();
        ref.biodiversitySupport();
        ref.medicinalProperties();

        System.out.println("\n");

        Neem neem = new Neem();
        neem.treeDetails();
        neem.neemMedicinalUses();
        neem.neemOilExtraction();
        neem.neemEnvironmentalBenefits();
        neem.neemTraditionalUses();



    }
}
