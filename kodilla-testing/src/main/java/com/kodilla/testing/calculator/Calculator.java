package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    private int add;
    private int subtract;

    private int simpleCalc;

    public Calculator(int a, int b, int add, int subtract) {
        this.a = a;
        this.b = b;
        this.add = add;
        this.subtract = subtract;
    }

    public int add() {
        return (a+b);
    }

    public int getAdd() {
        return add;
    }

    public int subtract() {
        return (a-b);
    }
    public int getSubtract() {
        return subtract;
    }

}
