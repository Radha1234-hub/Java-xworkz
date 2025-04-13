package com.xworkz.inheritenceapp.wood;

public class WoodRunner {
    public static void main(String[] args) {
        Wood wood = new Wood();
        wood.woodDetails();

        Table table = new Table();
        table.woodDetails();

        Wood ref = new Table();
        ref.woodDetails();

        Table downcasted = (Table) ref;
        downcasted.woodDetails();




    }
}
