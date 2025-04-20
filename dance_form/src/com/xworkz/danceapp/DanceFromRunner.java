package com.xworkz.danceapp;

import com.xworkz.danceapp.danceform.DanceForm;
import com.xworkz.danceapp.kathak.Kathak;

public class DanceFromRunner {
    public static void main(String[] args) {

        DanceForm ref = new DanceForm();
        ref.origin();
        ref.style();
        ref.music();
        ref.costume();
        ref.expression();

        DanceForm ref1 = new Kathak();
        ref1.origin();
        ref1.style();
        ref1.music();
        ref1.costume();
        ref1.expression();

        Kathak ref2 = new Kathak();
        ref2.origin();
        ref2.style();
        ref2.music();
        ref2.costume();
        ref2.expression();
        ref2.gharanas();
        ref2.storytelling();
    }
}
