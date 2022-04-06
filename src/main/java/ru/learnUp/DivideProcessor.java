package ru.learnUp;

public class DivideProcessor implements Processor {
    @Override
    public long process(long arg1, long arg2) {
        if (arg2 == 0) {
            throw new ArithmeticException("������� �� ���� ���������");
        } else {
            return Math.round(arg1 / arg2);
        }
    }


}
