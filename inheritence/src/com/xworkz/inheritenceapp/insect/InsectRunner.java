package com.xworkz.inheritenceapp.insect;

public class InsectRunner {


        public static void main(String[] args) {
            Inscet insect = new Inscet();
            insect.insectDetails();

            ButterFly butterfly = new ButterFly();
            butterfly.insectDetails();

            Inscet ref = new ButterFly();
            ref.insectDetails();

            ButterFly downcasted = (ButterFly) ref;
            downcasted.insectDetails();
        }
    }