package com.xworkz.inheritenceapp.cell;

public class CellRunner {
    public static void main(String[] args) {
        Cell cell = new Cell();
        cell.cellDetails();

        WhiteBloodCell whiteBloodCell = new WhiteBloodCell();
        whiteBloodCell.cellDetails();

        Cell ref = new WhiteBloodCell();
        ref.cellDetails();

        WhiteBloodCell downcasted = (WhiteBloodCell) ref;
        downcasted.cellDetails();



    }
}
