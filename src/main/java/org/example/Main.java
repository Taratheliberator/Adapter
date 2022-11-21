package org.example;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.newFormula()
                .addOperand(5)
                .addOperand(15)
                .calculate(Calculator.Operation.MULT)
                .result()
        );

        Ints intsCalc = new IntsCalculator(calc);
        System.out.println(intsCalc.sum(4, 25));
        System.out.println(intsCalc.mult(9, 11));
        System.out.println(intsCalc.pow(3, 4));
    }
}