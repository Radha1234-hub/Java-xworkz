package com.xworkz.inheritenceapp.hormone;

public class HormoneRunner {

    public static void main(String[] args) {
        Hormone hormone = new Hormone();
        hormone.hormoneDetails();

        Insulin insulin = new Insulin();
        insulin.hormoneDetails();
    }

}
