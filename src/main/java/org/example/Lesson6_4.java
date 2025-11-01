package org.example;
//Написать программу, высчитывающую факториал введёного числа
public class Lesson6_4 {
    static void main() {
        int factorial = factorial (6);
        System.out.println(factorial);
    }
    public static int factorial (int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
