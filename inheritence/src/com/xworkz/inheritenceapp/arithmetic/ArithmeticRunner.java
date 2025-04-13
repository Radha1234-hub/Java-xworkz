package com.xworkz.inheritenceapp.arithmetic;

public class ArithmeticRunner {
    public static void main(String[] args) {
        ArithmeticOperation operation = new ArithmeticOperation();
        operation.operationDetails();


        Addition addition = new Addition();
        addition.operationDetails();

        ArithmeticOperation oper = new Addition();
        oper.operationDetails();

        Addition downcasted = (Addition) oper;
        downcasted.operationDetails();

    }
}
