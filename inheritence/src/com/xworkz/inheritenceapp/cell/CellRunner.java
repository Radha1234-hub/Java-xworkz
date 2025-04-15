package com.xworkz.inheritenceapp.cell;

public class CellRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Cell cell = new Cell();
        cell.cellDetails();
        cell.cellComposition();
        cell.cellFunctionality();
        cell.cellGrowth();
        cell.cellSignificance();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Cell ref = new WhiteBloodCell();
        ref.cellDetails();
        ref.cellComposition();
        ref.cellFunctionality();
        ref.cellGrowth();
        ref.cellSignificance();

        System.out.println("\n");

        // Creating a copy of the subclass using its own reference type and invoking 5 methods
        WhiteBloodCell whiteBloodCell = new WhiteBloodCell();
        whiteBloodCell.cellDetails();
        whiteBloodCell.whiteBloodCellDetails();
        whiteBloodCell.whiteBloodCellFunction();
        whiteBloodCell.whiteBloodCellTypes();
        whiteBloodCell.whiteBloodCellImportance();


    }
}
