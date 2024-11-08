package Inheritance;

/**
 * AdvanceCalculator
 */
class AdvanceCalculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}

/**
 * basic calculator
 */
class BasicCalculator extends AdvanceCalculator {

    int a, b;

    BasicCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

}

public class Calculator {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        BasicCalculator calc = new BasicCalculator(num1, num2);

        System.out.println("Multiplication for the two numbers : " + calc.multiply(num1, num2));
        System.out.println("Division of the two numbers : " + calc.divide(num1, num2));
        System.out.println("Addition of two numbers : " + calc.add());
        System.out.println("Substraction of the two numbers : " + calc.sub());



    }
}
