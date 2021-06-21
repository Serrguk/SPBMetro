package ru.skillbox;

public class ArithmeticCalculator {

    private final int valueOne;
    private final int valueTwo;

    public ArithmeticCalculator(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return valueOne + valueTwo;
        } else if (operation == Operation.SUBTRACT) {
            return valueOne - valueTwo;
        } else return valueOne * valueTwo;
    }
}
