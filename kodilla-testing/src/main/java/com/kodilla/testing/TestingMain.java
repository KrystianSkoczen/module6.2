package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import java.util.Objects;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();

        int add = calculator.add(5, 4);

        if (add == 9) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }

        int sub = calculator.subtract(7, 2);

        if (sub == 5) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}