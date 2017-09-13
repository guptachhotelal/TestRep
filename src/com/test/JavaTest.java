package com.test;

/**
 *
 * @author chhotelal.gupta
 */
public class JavaTest {

    interface MathOperation {

        int operation(int a, int b);
    }

    interface GreetService {

        void sayMessage(String msg);
    }

    int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation substraction = (a, b) -> {
            return a - b;
        };
        MathOperation multiply = (int a, int b) -> {
            return a * b;
        };
        MathOperation divide = (int a, int b) -> a / b;

        GreetService greetService1 = message -> System.out.println("hello " + message);
        GreetService greetService2 = (message) -> System.out.println("hello " + message);
        greetService1.sayMessage("ABC");
        greetService2.sayMessage("PQR");

        JavaTest jt = new JavaTest();
        System.out.println("10+5= " + jt.operate(10, 5, addition));
        System.out.println("10-5= " + jt.operate(10, 5, substraction));
        System.out.println("10*5=" + jt.operate(10, 5, multiply));
        System.out.println("10/5=" + jt.operate(10, 5, divide));

    }
}
