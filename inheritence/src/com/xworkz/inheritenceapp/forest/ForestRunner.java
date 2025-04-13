package com.xworkz.inheritenceapp.forest;

public class ForestRunner {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.forestDetails();

        Amazon amazon = new Amazon();
        amazon.forestDetails();

        Forest ref = new Amazon();
        ref.forestDetails();

        Amazon downcasted = (Amazon) ref;
        downcasted.forestDetails();
    }
}
