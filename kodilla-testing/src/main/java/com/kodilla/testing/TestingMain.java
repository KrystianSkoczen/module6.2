package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import java.util.Objects;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator(5,4,9, 1);

        int add = calculator.getAdd();

        if (Objects.equals(add,9)) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }

        int subtract = calculator.getSubtract();

        if (Objects.equals(subtract,1)) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}