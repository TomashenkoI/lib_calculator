package ua.goit.java;

import java.util.Scanner;

/**
 * Created by 7 on 26.07.2016.
 */
public class Input {

    public static String firstOperand;
    public static String secondOperand;
    private static char operationCharacter = ' ';
    private static int operandPosition;
    static boolean isItBinaryOperation = false;

    public static void execute() {

        System.out.println("Enter your expression: ");
        String inputtedExpression = new Scanner(System.in).nextLine();

        for (int i = 0; i < inputtedExpression.length(); i++) {
            for (Character operation : Operations.listOfOperations.keySet()) {
                if (inputtedExpression.charAt(i) == operation) {
                    operationCharacter = operation;
                    operandPosition = i;
                    isItBinaryOperation = true;
                }
            }
        }

        if (isItBinaryOperation) {

            firstOperand = inputtedExpression.substring(0, operandPosition);
            secondOperand = inputtedExpression.substring(operandPosition + 1, inputtedExpression.length());

            System.out.print(inputtedExpression + " = ");

        }
    }

    public double getFirstOperand() {
        return Double.parseDouble(firstOperand);
    }

    public double getSecondOperand() {
        return Double.parseDouble(secondOperand);
    }

    public static char getOperationCharacter() {
        return operationCharacter;
    }
}
