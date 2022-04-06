package ru.learnUp;

public class Calculator {
    private final SumProcessor sum;
    private final SubtractProcessor subtract;
    private final DivideProcessor divide;
    private final MultiplyProcessor multiply;

    public Calculator(SumProcessor sum, SubtractProcessor subtract, DivideProcessor divide, MultiplyProcessor multiply) {
        this.sum = sum;
        this.subtract = subtract;
        this.divide = divide;
        this.multiply = multiply;
    }

    public long sum(long arg1, long arg2) {
        return sum.process(arg1, arg2);
    }

    public long subtract(long arg1, long arg2) {
        return subtract.process(arg1, arg2);
    }

    public long divide(long arg1, long arg2) {
        return divide.process(arg1, arg2);
    }

    public long multiply(long arg1, long arg2) {
        return multiply.process(arg1, arg2);
    }
}
