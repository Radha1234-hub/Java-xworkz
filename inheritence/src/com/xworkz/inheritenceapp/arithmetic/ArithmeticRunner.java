package com.xworkz.inheritenceapp.arithmetic;

public class ArithmeticRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        ArithmeticOperation operation = new ArithmeticOperation();
        operation.arithmeticDefinition();
        operation.arithmeticTypes();
        operation.arithmeticPurpose();
        operation.arithmeticUsage();
        operation.arithmeticImpact();

        System.out.println("\n");

        // Creating a copy of the subclass using the parent as reference type and invoking 5 methods
        ArithmeticOperation oper = new Addition();
        oper.arithmeticDefinition();
        oper.arithmeticTypes();
        oper.arithmeticPurpose();
        oper.arithmeticUsage();
        oper.arithmeticImpact();

        System.out.println("\n");

        // Creating a copy of the subclass using the subclass as reference type and invoking 5 methods
        Addition addition = new Addition();
        addition.arithmeticDefinition();
        addition.additionDefinition();
        addition.additionSymbol();
        addition.additionPurpose();
        addition.additionImpact();

    }
}
