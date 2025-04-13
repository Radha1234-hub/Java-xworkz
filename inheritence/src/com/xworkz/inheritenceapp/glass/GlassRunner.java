package com.xworkz.inheritenceapp.glass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.glassDetails();

        Window window = new Window();
        window.glassDetails();

        Glass ref = new Window();
        ref.glassDetails();

        Window downcasted = (Window) ref;
        downcasted.glassDetails();


    }
}
