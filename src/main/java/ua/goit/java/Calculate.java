package ua.goit.java;

/**
 * Created by 7 on 26.07.2016.
 */
public class Calculate {

    public static int result;

    public static void execution() {

        Input.execute();

        double firstOperand = Double.parseDouble(Input.firstOperand);
        double secondOperand = Double.parseDouble(Input.secondOperand);

        BinaryOperation operation = Operations.listOfOperations.get(Input.getOperationCharacter());
        result = (int) operation.init(firstOperand, secondOperand);

        String stringResult = Integer.toString(result);

        System.out.println(stringResult);
    }
}
