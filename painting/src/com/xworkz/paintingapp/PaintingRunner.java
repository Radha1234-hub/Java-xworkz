package com.xworkz.paintingapp;

import com.xworkz.paintingapp.painting.Painting;
import com.xworkz.paintingapp.art.Art;

public class PaintingRunner {
    public static void main(String[] args) {

        Art ref1 = new Art();

        ref1.space();
        ref1.shape();
        ref1.line();
        ref1.color();
        ref1.texture();

        Art ref2 = new Painting();

        ref2.texture();
        ref2.line();
        ref2.shape();
        ref2.color();
        ref2.space();

        Painting ref = new Painting();
        ref.color();
        ref.texture();
        ref.line();
        ref.shape();
        ref.space();





    }
}
