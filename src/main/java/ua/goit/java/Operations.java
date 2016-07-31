package ua.goit.java;

import java.util.HashMap;

/**
 * Created by 7 on 26.07.2016.
 */
public class Operations {

    public static HashMap<Character, BinaryOperation> listOfOperations = new HashMap<>();

    static {
        Operations.addOperation(new PlusOperation());
        Operations.addOperation(new MinusOperation());
    }

    public static void addOperation(BinaryOperation binaryOperation) {
        listOfOperations.put(binaryOperation.getOperationChar(), binaryOperation);
    }
}
