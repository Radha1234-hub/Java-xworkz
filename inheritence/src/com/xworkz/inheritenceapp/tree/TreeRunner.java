package com.xworkz.inheritenceapp.tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.treeDetails();

        Neem neem = new Neem();
        neem.treeDetails();

        Tree ref = new Neem();
        ref.treeDetails();

        Neem downcasted = (Neem) ref;
        downcasted.treeDetails();



    }
}
