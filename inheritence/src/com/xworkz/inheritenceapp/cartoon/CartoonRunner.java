package com.xworkz.inheritenceapp.cartoon;

public class CartoonRunner {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        cartoon.cartoonDetails();

        Doremon doremon = new Doremon();
        doremon.cartoonDetails();

    Cartoon ref = new Doremon();
    ref.cartoonDetails();

        Doremon downcasted = (Doremon) ref;
        downcasted.cartoonDetails();


}}
