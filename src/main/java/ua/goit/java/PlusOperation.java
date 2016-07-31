package ua.goit.java;

/**
 * Created by 7 on 26.07.2016.
 */
public class PlusOperation implements BinaryOperation {

    public double init(double a, double b) {
        return a + b;
    }

    public char getOperationChar() {
        return '+';
    }
}
