package com.xworkz.inheritenceapp.glass;

public class GlassRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Glass glass = new Glass();
        glass.glassDetails();
        glass.glassTypes();
        glass.glassProperties();
        glass.glassUses();
        glass.glassRecyclability();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Glass ref = new Window();
        ref.glassDetails();
        ref.glassTypes();
        ref.glassProperties();
        ref.glassUses();
        ref.glassRecyclability();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Window window = new Window();
        window.glassDetails();
        window.windowType();
        window.windowMaterial();
        window.windowDesign();
        window.windowMaintenance();


    }
}
