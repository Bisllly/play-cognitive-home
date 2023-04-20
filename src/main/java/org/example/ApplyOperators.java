package org.example;

import java.math.MathContext;

public class ApplyOperators {
    public static void main(String[] args) {
        int num1 = 232;
        int num2 = 32;
        String operator = "^";
        double result = 0.0;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = Math.pow((double) num1, (double) num2);
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + result);

    }
}
