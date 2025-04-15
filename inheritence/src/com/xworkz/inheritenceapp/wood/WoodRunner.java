package com.xworkz.inheritenceapp.wood;

public class WoodRunner {
    public static void main(String[] args) {
        Wood wood = new Wood();
        wood.woodDetails();
        wood.woodProperties();
        wood.woodProcessing();
        wood.furnitureUses();
        wood.ecoBenefits();

        System.out.println("\n");

        Wood ref = new Table();
        ref.woodDetails();
        ref.woodProperties();
        ref.woodProcessing();
        ref.furnitureUses();
        ref.ecoBenefits();

        System.out.println("\n");

        Table table = new Table();
        table.woodDetails();
        table.tableTypes();
        table.tableMaterials();
        table.tableDesigns();
        table.tableCareTips();




    }
}
